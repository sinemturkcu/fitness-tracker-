package com.fitnessteam.fitnesstracker.controllers;

import com.fitnessteam.fitnesstracker.entities.ReceivedNutrition;
import com.fitnessteam.fitnesstracker.services.ReceivedNutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receivedNutrition")
@CrossOrigin(origins="*")
public class ReceivedNutritionController {
    ReceivedNutritionService receivedNutritionService;

    @Autowired
    public ReceivedNutritionController(ReceivedNutritionService receivedNutritionService) {
        this.receivedNutritionService = receivedNutritionService;
    }

    @GetMapping("/getAll")
    public List<ReceivedNutrition> getAll(){
       return this.receivedNutritionService.getAll();
    }

    @PostMapping
    public ReceivedNutrition save(@RequestBody ReceivedNutrition receivedNutrition){
        return receivedNutritionService.saveReceivedNutrition(receivedNutrition);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        receivedNutritionService.deleteReceivedNutrition(id);
    }

}
