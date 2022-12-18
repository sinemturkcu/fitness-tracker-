package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.FitnessMove;
import com.fitnessteam.fitnesstracker.repositories.FitnessMoveRepository;
import com.fitnessteam.fitnesstracker.services.FitnessMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitnessMoveServiceImpl implements FitnessMoveService {
    FitnessMoveRepository fitnessMoveRepository;

    @Autowired
    public FitnessMoveServiceImpl(FitnessMoveRepository fitnessMoveRepository) {
        this.fitnessMoveRepository = fitnessMoveRepository;
    }

    @Override
    public FitnessMove saveFitnessMove(FitnessMove fitnessMove) {
        return fitnessMoveRepository.save(fitnessMove);
    }

    @Override
    public void deleteFitnessMove(Long id) {
        FitnessMove fitnessMove=fitnessMoveRepository.getById(id);
        fitnessMoveRepository.delete(fitnessMove);
    }

    @Override
    public List<FitnessMove> getAll() {
        return fitnessMoveRepository.findAll();
    }

    @Override
    public List<FitnessMove> filterByTarget(String target) {
        return fitnessMoveRepository.filterByTarget(target);
    }
}
