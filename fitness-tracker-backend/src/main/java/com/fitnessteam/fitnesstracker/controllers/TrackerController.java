package com.fitnessteam.fitnesstracker.controllers;
import com.fitnessteam.fitnesstracker.dtos.*;
import com.fitnessteam.fitnesstracker.entities.Tracker;
import com.fitnessteam.fitnesstracker.services.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RequestMapping("/api/tracker")
@RestController
public class TrackerController {

    TrackerService trackerService;

    @Autowired
    public TrackerController(TrackerService trackerService) {
        this.trackerService = trackerService;
    }

    @GetMapping("/getAll")
    public List<TrackerDto> getAllTrackers(){
        return  this.trackerService.getAllTrackers();
    }

    @PostMapping
    public Tracker save(@RequestBody Tracker tracker){
        return trackerService.saveTracker(tracker);
    }

    @GetMapping("/availableTrackers")
    public List<TrackerActiveDto> getAvailableTrackers(){
        return  this.trackerService.findAllActiveTracker();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{userId}")
    public Tracker updateActivity(@Validated @PathVariable Long userId){
        return trackerService.changeActivity(userId);
    }


}
