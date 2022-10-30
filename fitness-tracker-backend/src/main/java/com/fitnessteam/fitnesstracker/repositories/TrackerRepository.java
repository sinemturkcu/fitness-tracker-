package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.Tracker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("tracker")
@Repository
public interface TrackerRepository extends JpaRepository<Tracker,Long> {
    List<Tracker> findAllById(Long id);
}
