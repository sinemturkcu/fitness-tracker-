package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.Tracker;
import com.fitnessteam.fitnesstracker.repositories.TrackerRepository;
import com.fitnessteam.fitnesstracker.services.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackerServiceImpl implements TrackerService {

    private TrackerRepository trackerRepository;

    @Autowired
    public TrackerServiceImpl(TrackerRepository trackerRepository) {
        this.trackerRepository=trackerRepository;
    }

    @Override
    public Tracker saveTracker(Tracker tracker) {
        return trackerRepository.save(tracker);
    }

    @Override
    public void deleteTracker(Long id) {
        Tracker tracker=trackerRepository.getById(id);
        trackerRepository.delete(tracker);
    }

}
