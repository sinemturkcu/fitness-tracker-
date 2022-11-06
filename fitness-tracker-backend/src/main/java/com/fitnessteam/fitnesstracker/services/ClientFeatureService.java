package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.ClientFeature;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClientFeatureService {
    ClientFeature saveClientFeature(ClientFeature clientFeature);
    void deleteClientFeature(Long id);
    List<ClientFeature> getAll();
}
