package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.Tracker;
import org.springframework.stereotype.Component;

@Component
public interface TrackerService {
    Tracker saveTracker(Tracker tracker);
    void deleteTracker(Long id);

}
