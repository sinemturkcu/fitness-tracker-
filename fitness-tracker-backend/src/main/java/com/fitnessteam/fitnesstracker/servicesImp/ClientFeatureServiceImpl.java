package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.ClientFeature;
import com.fitnessteam.fitnesstracker.repositories.ClientFeatureRepository;
import com.fitnessteam.fitnesstracker.services.ClientFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientFeatureServiceImpl implements ClientFeatureService {

    ClientFeatureRepository clientFeatureRepository;

    @Autowired
    public ClientFeatureServiceImpl(ClientFeatureRepository clientFeatureRepository) {
        this.clientFeatureRepository = clientFeatureRepository;
    }

    @Override
    public ClientFeature saveClientFeature(ClientFeature clientFeature) {
        return clientFeatureRepository.save(clientFeature);
    }

    @Override
    public void deleteClientFeature(Long id) {
        ClientFeature clientFeature=clientFeatureRepository.getById(id);
        clientFeatureRepository.delete(clientFeature);
    }
}
