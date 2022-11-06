package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.Nutrient;
import com.fitnessteam.fitnesstracker.repositories.NutrientRepository;
import com.fitnessteam.fitnesstracker.services.NutrientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutrientServiceImpl implements NutrientService {

    NutrientRepository nutrientRepository;

    @Autowired
    public NutrientServiceImpl(NutrientRepository nutrientRepository) {
        this.nutrientRepository = nutrientRepository;
    }

    @Override
    public Nutrient saveNutrient(Nutrient nutrient) {
        return nutrientRepository.save(nutrient);
    }

    @Override
    public void deleteNutrient(Long id) {
        nutrientRepository.deleteById(id);
    }

    @Override
    public List<Nutrient> getAll() {
        return nutrientRepository.findAll();
    }
}
