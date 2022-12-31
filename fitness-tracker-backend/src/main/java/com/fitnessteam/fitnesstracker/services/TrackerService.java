package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.dtos.TrackerActiveDto;
import com.fitnessteam.fitnesstracker.dtos.TrackerDto;
import com.fitnessteam.fitnesstracker.dtos.TrackerFilterDto;
import com.fitnessteam.fitnesstracker.entities.Tracker;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TrackerService {
    Tracker saveTracker(Tracker tracker);
    void deleteTracker(Long id);
    TrackerFilterDto filterByUserId(Long userId);
    List<TrackerDto> getAllTrackers();
    List<TrackerActiveDto> findAllActiveTracker();
    Tracker changeActivity(Long userId);

}
