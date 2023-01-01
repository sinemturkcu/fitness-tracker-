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

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingProgramServiceImpl implements TrainingProgramService {
    TrainingProgramRepository trainingProgramRepository;
    ClientService clientService;

    @Autowired
    public TrainingProgramServiceImpl(TrainingProgramRepository trainingProgramRepository, ClientService clientService) {
        this.trainingProgramRepository = trainingProgramRepository;
        this.clientService = clientService;
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
}
