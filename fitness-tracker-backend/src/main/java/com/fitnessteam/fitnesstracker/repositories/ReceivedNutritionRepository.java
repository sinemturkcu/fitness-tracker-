package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.ReceivedNutrition;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("receivedNutrition")
public interface ReceivedNutritionRepository extends JpaRepository<ReceivedNutrition,Long> {
    List<ReceivedNutrition> findAllById(Long id);
}
