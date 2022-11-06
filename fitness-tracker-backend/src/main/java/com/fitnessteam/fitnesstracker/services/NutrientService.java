package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.Nutrient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NutrientService {
    Nutrient saveNutrient(Nutrient nutrient);
    void deleteNutrient(Long id);
    List<Nutrient> getAll();
}
