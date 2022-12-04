package com.fitnessteam.fitnesstracker.controllers;

import com.fitnessteam.fitnesstracker.entities.NutritionSchedule;
import com.fitnessteam.fitnesstracker.services.NutritionScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nutritionSchedule")
@CrossOrigin(origins="*")
public class NutritionScheduleController {

    NutritionScheduleService nutritionScheduleService;

    @Autowired
    public NutritionScheduleController(NutritionScheduleService nutritionScheduleService) {
        this.nutritionScheduleService = nutritionScheduleService;
    }

    @GetMapping("/getAll")
    public List<NutritionSchedule> getAll(){
        return nutritionScheduleService.getAll();
    }

    @PostMapping
    public NutritionSchedule save(@RequestBody NutritionSchedule nutritionSchedule){
        return nutritionScheduleService.saveNutritionSchedule(nutritionSchedule);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
         nutritionScheduleService.deleteNutritionSchedule(id);
    }
}
