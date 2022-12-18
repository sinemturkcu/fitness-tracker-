package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.FitnessMove;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FitnessMoveService {
    FitnessMove saveFitnessMove(FitnessMove fitnessMove);
    void deleteFitnessMove(Long id);
    List<FitnessMove> getAll();
    List<FitnessMove> filterByTarget(String target);
}
