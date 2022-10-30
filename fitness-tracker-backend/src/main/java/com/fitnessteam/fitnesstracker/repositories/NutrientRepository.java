package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.Nutrient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("nutrient")
@Repository
public interface NutrientRepository extends JpaRepository<Nutrient,Long> {
    List<Nutrient> findAllById(Long id);
}
