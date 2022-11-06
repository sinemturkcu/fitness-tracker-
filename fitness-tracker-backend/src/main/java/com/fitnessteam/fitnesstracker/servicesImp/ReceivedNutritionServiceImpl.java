package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.ReceivedNutrition;
import com.fitnessteam.fitnesstracker.repositories.ReceivedNutritionRepository;
import com.fitnessteam.fitnesstracker.services.ReceivedNutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceivedNutritionServiceImpl implements ReceivedNutritionService {

    ReceivedNutritionRepository receivedNutritionRepository;

    @Autowired
    public ReceivedNutritionServiceImpl(ReceivedNutritionRepository receivedNutritionRepository) {
        this.receivedNutritionRepository = receivedNutritionRepository;
    }

    @Override
    public ReceivedNutrition saveReceivedNutrition(ReceivedNutrition receivedNutrition) {
        return receivedNutritionRepository.save(receivedNutrition);
    }

    @Override
    public void deleteReceivedNutrition(Long id) {
        receivedNutritionRepository.deleteById(id);
    }

    @Override
    public List<ReceivedNutrition> getAll() {
        return receivedNutritionRepository.findAll();
    }
}
