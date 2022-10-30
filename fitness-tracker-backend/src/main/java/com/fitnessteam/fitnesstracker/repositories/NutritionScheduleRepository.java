package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.NutritionSchedule;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("nutritionSchedule")
@Repository
public interface NutritionScheduleRepository extends JpaRepository<NutritionSchedule,Long> {
    List<NutritionSchedule> findAllById(Long id);
}
