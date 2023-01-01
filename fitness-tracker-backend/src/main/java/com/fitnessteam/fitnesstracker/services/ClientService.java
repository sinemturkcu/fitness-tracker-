package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.dtos.ClientDto;
import com.fitnessteam.fitnesstracker.dtos.ClientFilterDto;
import com.fitnessteam.fitnesstracker.entities.Client;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClientService {
    Client saveClient(Client client);
    void deleteClient(Long id);
    List<Client> getAll();
    List<ClientDto> getClientAll();
    List<ClientFilterDto> filterByTrackerId(Long trackerId);
    ClientFilterDto filterByUserId(Long userId);
}
