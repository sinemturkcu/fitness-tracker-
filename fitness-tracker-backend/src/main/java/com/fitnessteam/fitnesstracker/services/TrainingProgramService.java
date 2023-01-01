package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.dtos.TrainingProgramDto;
import com.fitnessteam.fitnesstracker.entities.TrainingProgram;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TrainingProgramService {
    TrainingProgram saveTrainingProgram(TrainingProgram trainingProgram);
    void deleteTrainingProgram(Long id);
    List<TrainingProgram> getAll();
    List<TrainingProgramDto> filterByUserId(Long userId);
}
