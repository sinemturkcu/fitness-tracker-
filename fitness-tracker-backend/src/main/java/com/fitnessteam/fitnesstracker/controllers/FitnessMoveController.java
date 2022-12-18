package com.fitnessteam.fitnesstracker.controllers;

import com.fitnessteam.fitnesstracker.entities.FitnessMove;
import com.fitnessteam.fitnesstracker.services.FitnessMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/fitnessMove")
public class FitnessMoveController {
    FitnessMoveService fitnessMoveService;

    @Autowired
    public FitnessMoveController(FitnessMoveService fitnessMoveService) {
        this.fitnessMoveService = fitnessMoveService;
    }

    @GetMapping("/getAll")
    public List<FitnessMove> getAll(){
        return fitnessMoveService.getAll();
    }

    @PostMapping
    public FitnessMove save(@RequestBody FitnessMove fitnessMove){
        return fitnessMoveService.saveFitnessMove(fitnessMove);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        fitnessMoveService.deleteFitnessMove(id);
    }

    @GetMapping("/filter")
    public List<FitnessMove> getFilterAll(@RequestParam String target){
        return fitnessMoveService.filterByTarget(target);
    }

}
