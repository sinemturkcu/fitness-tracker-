package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.dtos.ClientFilterDto;
import com.fitnessteam.fitnesstracker.dtos.TrainingProgramDto;
import com.fitnessteam.fitnesstracker.entities.Client;
import com.fitnessteam.fitnesstracker.entities.TrainingProgram;
import com.fitnessteam.fitnesstracker.repositories.TrainingProgramRepository;
import com.fitnessteam.fitnesstracker.services.ClientService;
import com.fitnessteam.fitnesstracker.services.TrainingProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingProgramServiceImpl implements TrainingProgramService {
    TrainingProgramRepository trainingProgramRepository;
    ClientService clientService;
    ExcelExportService excelExportService;

    @Autowired
    public TrainingProgramServiceImpl(TrainingProgramRepository trainingProgramRepository, ClientService clientService,
                                      ExcelExportService excelExportService) {
        this.trainingProgramRepository = trainingProgramRepository;
        this.clientService = clientService;
        this.excelExportService = excelExportService;
    }

    @Override
    public TrainingProgram saveTrainingProgram(TrainingProgram trainingProgram) {
        return trainingProgramRepository.save(trainingProgram);
    }

    @Override
    public void deleteTrainingProgram(Long id) {
        trainingProgramRepository.deleteById(id);
    }

    @Override
    public List<TrainingProgram> getAll() {
        return trainingProgramRepository.findAll();
    }

    @Override
    public List<TrainingProgramDto> filterByUserId(Long userId) {
        ClientFilterDto clientFilterDto = clientService.filterByUserId(userId);
        return trainingProgramRepository.filterByClientId(clientFilterDto.getClientId());
    }

    @Override
    public ByteArrayInputStream exportTrainingProgram(Long userId) {
        ClientFilterDto clientFilterDto = clientService.filterByUserId(userId);
        List<TrainingProgramDto> trainingProgramDtoList = trainingProgramRepository.filterByClientId(clientFilterDto.getClientId());

        return excelExportService.exportTrainingProgram(trainingProgramDtoList);
    }
}
