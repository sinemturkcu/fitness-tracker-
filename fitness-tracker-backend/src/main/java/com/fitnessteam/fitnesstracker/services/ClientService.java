package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.Client;
import org.springframework.stereotype.Component;

@Component
public interface ClientService {
    Client saveClient(Client client);
    void deleteClient(Long id);
}
