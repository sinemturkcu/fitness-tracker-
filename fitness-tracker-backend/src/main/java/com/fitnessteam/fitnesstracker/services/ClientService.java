package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.Client;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClientService {
    Client saveClient(Client client);
    void deleteClient(Long id);
    List<Client> getAll();
}
