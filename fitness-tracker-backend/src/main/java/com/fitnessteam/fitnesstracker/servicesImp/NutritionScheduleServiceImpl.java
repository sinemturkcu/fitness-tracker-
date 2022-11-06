package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.NutritionSchedule;
import com.fitnessteam.fitnesstracker.repositories.NutritionScheduleRepository;
import com.fitnessteam.fitnesstracker.services.NutritionScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionScheduleServiceImpl implements NutritionScheduleService {
    NutritionScheduleRepository nutritionScheduleRepository;

    @Autowired
    public NutritionScheduleServiceImpl(NutritionScheduleRepository nutritionScheduleRepository) {
        this.nutritionScheduleRepository = nutritionScheduleRepository;
    }

    @Override
    public NutritionSchedule saveNutritionSchedule(NutritionSchedule nutritionSchedule) {
        return nutritionScheduleRepository.save(nutritionSchedule);
    }

    @Override
    public void deleteNutritionSchedule(Long id) {
        nutritionScheduleRepository.deleteById(id);
    }

    @Override
    public List<NutritionSchedule> getAll() {
        return nutritionScheduleRepository.findAll();
    }
}
