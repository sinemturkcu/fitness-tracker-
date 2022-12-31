package com.fitnessteam.fitnesstracker.servicesImp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fitnessteam.fitnesstracker.dtos.ClientDto;
import com.fitnessteam.fitnesstracker.dtos.TrackerActiveDto;
import com.fitnessteam.fitnesstracker.dtos.TrackerDto;
import com.fitnessteam.fitnesstracker.dtos.TrackerFilterDto;
import com.fitnessteam.fitnesstracker.entities.Tracker;
import com.fitnessteam.fitnesstracker.repositories.TrackerRepository;
import com.fitnessteam.fitnesstracker.services.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public TrackerFilterDto filterByUserId(Long userId) {
        return trackerRepository.filterByUserId(userId);
    }

    @Override
    public List<TrackerDto> getAllTrackers() {
        List<TrackerDto> response = trackerRepository.listAllTrackers();
        for (int i=0; i< response.size(); i++){
            if(response.get(i).isGender()){
                response.get(i).setSGender("Male");
            }
            else {
                response.get(i).setSGender("Female");
            }
        }
        return response;
    }

    @Override
    public List<TrackerActiveDto> findAllActiveTracker() {
        return trackerRepository.findAllActiveTracker();
    }

    @Override
    public Tracker changeActivity(Long userId) {
        TrackerFilterDto trackerFilterDto = trackerRepository.filterByUserId(userId);
        Tracker tracker= trackerRepository.getById(trackerFilterDto.getTrackerId());
        if(tracker.isActive()){
            tracker.setActive(false);
        }
        else{
            tracker.setActive(true);
        }
        return trackerRepository.save(tracker);

    }

}
