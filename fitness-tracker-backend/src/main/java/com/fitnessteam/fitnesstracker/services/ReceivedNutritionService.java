package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.ReceivedNutrition;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ReceivedNutritionService {
    ReceivedNutrition saveReceivedNutrition(ReceivedNutrition receivedNutrition);
    void deleteReceivedNutrition(Long id);
    List<ReceivedNutrition> getAll();
}
