package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.NutritionSchedule;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NutritionScheduleService {
    NutritionSchedule saveNutritionSchedule(NutritionSchedule nutritionSchedule);
    void deleteNutritionSchedule(Long id);
    List<NutritionSchedule> getAll();

}
