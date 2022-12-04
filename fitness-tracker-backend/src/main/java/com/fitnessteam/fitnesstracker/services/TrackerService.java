package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.dtos.TrackerDto;
import com.fitnessteam.fitnesstracker.entities.Tracker;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TrackerService {
    Tracker saveTracker(Tracker tracker);
    void deleteTracker(Long id);

    List<TrackerDto> getAllTrackers();

}
