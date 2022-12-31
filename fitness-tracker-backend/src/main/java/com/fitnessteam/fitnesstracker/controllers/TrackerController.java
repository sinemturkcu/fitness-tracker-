package com.fitnessteam.fitnesstracker.controllers;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fitnessteam.fitnesstracker.dtos.*;
import com.fitnessteam.fitnesstracker.entities.Tracker;
import com.fitnessteam.fitnesstracker.services.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @PostMapping("/change")
    public Tracker changeActivity(@RequestBody ListRequest listRequest){
        return trackerService.changeActivity(listRequest.getUserId());
    }
}
