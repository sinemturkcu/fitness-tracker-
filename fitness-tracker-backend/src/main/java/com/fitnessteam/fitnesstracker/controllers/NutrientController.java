package com.fitnessteam.fitnesstracker.controllers;

import com.fitnessteam.fitnesstracker.entities.Nutrient;
import com.fitnessteam.fitnesstracker.services.NutrientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/nutrient")
public class NutrientController {

    NutrientService nutrientService;

    @Autowired
    public NutrientController(NutrientService nutrientService) {
        this.nutrientService = nutrientService;
    }

    @GetMapping("/getAll")
    public List<Nutrient> getAll(){
       return nutrientService.getAll();
    }

    @PostMapping
    public Nutrient save(@RequestBody Nutrient nutrient){
        return nutrientService.saveNutrient(nutrient);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        nutrientService.deleteNutrient(id);
    }



}
