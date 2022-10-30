package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.FitnessMove;
import org.springframework.stereotype.Component;

@Component
public interface FitnessMoveService {
    FitnessMove saveFitnessMove(FitnessMove fitnessMove);
    void deleteFitnessMove(Long id);
}
