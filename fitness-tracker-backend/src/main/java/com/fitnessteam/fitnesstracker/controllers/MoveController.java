package com.fitnessteam.fitnesstracker.controllers;

import com.fitnessteam.fitnesstracker.entities.Move;
import com.fitnessteam.fitnesstracker.services.MoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/move")
@CrossOrigin(origins="*")
public class MoveController {

    MoveService moveService;

    @Autowired
    public MoveController(MoveService moveService) {
        this.moveService = moveService;
    }

    @GetMapping("/getAll")
    public List<Move> getAll(){
      return this.moveService.getAll();
    }

    @PostMapping
    public Move save(@RequestBody Move move){
        return moveService.saveMove(move);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        moveService.deleteMove(id);
    }
}
