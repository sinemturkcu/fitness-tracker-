package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.dtos.TrainingProgramDto;
import com.fitnessteam.fitnesstracker.entities.TrainingProgram;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("trainingProgram")
@Repository
public interface TrainingProgramRepository extends JpaRepository<TrainingProgram,Long> {
    List<TrainingProgram> findAllById(Long id);

    @Query(value = "SELECT NEW com.fitnessteam.fitnesstracker.dtos.TrainingProgramDto" +
            "(tp.id, tp.setNumber, tp.repetitionNumber, tp.note, tp.client.id, tp.fitnessMove.id, tp.fitnessMove.gifUrl, " +
            "tp.fitnessMove.name, tp.fitnessMove.target, tp.fitnessMove.bodyPart)" +
            "FROM TrainingProgram tp" +
            " where (:clientId IS NULL OR tp.client.id =: clientId) ")
    List<TrainingProgramDto> filterByClientId(Long clientId);
}
