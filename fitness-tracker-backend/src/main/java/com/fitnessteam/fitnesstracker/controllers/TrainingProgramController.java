package com.fitnessteam.fitnesstracker.controllers;

import com.fitnessteam.fitnesstracker.dtos.TrainingProgramDto;
import com.fitnessteam.fitnesstracker.entities.TrainingProgram;
import com.fitnessteam.fitnesstracker.services.TrainingProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainingProgram")
@CrossOrigin(origins="*")
public class TrainingProgramController {

    TrainingProgramService trainingProgramService;

    @Autowired
    public TrainingProgramController(TrainingProgramService trainingProgramService) {
        this.trainingProgramService = trainingProgramService;
    }

    @GetMapping("/getAll")
    public List<TrainingProgram> getAll(){
        return trainingProgramService.getAll();
    }

    @PostMapping
    public TrainingProgram save(@RequestBody TrainingProgram trainingProgram){
        return trainingProgramService.saveTrainingProgram(trainingProgram);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        trainingProgramService.deleteTrainingProgram(id);
    }

    @GetMapping("/getAllByUserId")
    public List<TrainingProgramDto> getFilterAll(@RequestParam Long userId){
        return trainingProgramService.filterByUserId(userId);
    }
}
