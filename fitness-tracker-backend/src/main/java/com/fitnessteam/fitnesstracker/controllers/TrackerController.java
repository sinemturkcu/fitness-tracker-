package com.fitnessteam.fitnesstracker.controllers;
import com.fitnessteam.fitnesstracker.dtos.TrackerDto;
import com.fitnessteam.fitnesstracker.services.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/trackerController")
public class TrackerController {

    TrackerService trackerService;

    @Autowired
    public TrackerController(TrackerService trackerService) {
        this.trackerService = trackerService;
    }

    @GetMapping("/listAll")
    public List<TrackerDto> getAllTrackers(){
        return  this.trackerService.getAllTrackers();
    }


}
