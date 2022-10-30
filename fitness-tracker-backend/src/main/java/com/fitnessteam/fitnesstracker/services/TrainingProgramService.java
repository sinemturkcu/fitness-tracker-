package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.TrainingProgram;
import org.springframework.stereotype.Component;

@Component
public interface TrainingProgramService {
    TrainingProgram saveTrainingProgram(TrainingProgram trainingProgram);
    void deleteTrainingProgram(Long id);
}
