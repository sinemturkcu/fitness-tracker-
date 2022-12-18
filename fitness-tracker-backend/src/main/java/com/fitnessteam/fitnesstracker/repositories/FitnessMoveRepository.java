package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.FitnessMove;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("fitnessMove")
public interface FitnessMoveRepository extends JpaRepository<FitnessMove,Long> {
    List<FitnessMove> findAllById(Long id);

    @Query(value = "SELECT fm from FitnessMove fm " +
            " where (:requestTarget IS NULL OR fm.target =: requestTarget) "
    )
    List<FitnessMove> filterByTarget(String requestTarget);
}
