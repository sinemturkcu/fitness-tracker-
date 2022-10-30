package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.ClientFeature;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("clientFeature")
public interface ClientFeatureRepository extends JpaRepository<ClientFeature,Long> {
    List<ClientFeature> findAllById(Long id);
}
