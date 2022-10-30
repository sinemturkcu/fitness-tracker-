package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.TrainingProgram;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("trainingProgram")
@Repository
public interface TrainingProgramRepository extends JpaRepository<TrainingProgram,Long> {
    List<TrainingProgram> findAllById(Long id);
}
