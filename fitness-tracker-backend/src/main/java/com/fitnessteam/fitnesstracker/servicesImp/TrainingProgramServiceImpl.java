package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.TrainingProgram;
import com.fitnessteam.fitnesstracker.repositories.TrainingProgramRepository;
import com.fitnessteam.fitnesstracker.services.TrainingProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingProgramServiceImpl implements TrainingProgramService {
    TrainingProgramRepository trainingProgramRepository;

    @Autowired
    public TrainingProgramServiceImpl(TrainingProgramRepository trainingProgramRepository) {
        this.trainingProgramRepository = trainingProgramRepository;
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
}
