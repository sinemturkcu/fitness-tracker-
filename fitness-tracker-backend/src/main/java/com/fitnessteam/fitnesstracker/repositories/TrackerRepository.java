package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.dtos.ClientFilterDto;
import com.fitnessteam.fitnesstracker.dtos.TrackerDto;
import com.fitnessteam.fitnesstracker.dtos.TrackerFilterDto;
import com.fitnessteam.fitnesstracker.entities.Tracker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("tracker")
@Repository
public interface TrackerRepository extends JpaRepository<Tracker,Long> {
    List<Tracker> findAllById(Long id);

    @Query(value = "SELECT NEW com.fitnessteam.fitnesstracker.dtos.TrackerDto" + "(t.id,t.experienceYear,t.image, t.description, t.fullName, t.emailAddress, " +
            "t.phoneNumber, t.gender)" +
            "FROM Tracker t")
    List<TrackerDto> listAllTrackers();

    @Query(value = "SELECT NEW com.fitnessteam.fitnesstracker.dtos.TrackerFilterDto" +
            "(t.id)" +
            "FROM Tracker t" +
            " where (:userId IS NULL OR t.user.id =: userId) ")
    TrackerFilterDto filterByUserId(Long userId);
}
