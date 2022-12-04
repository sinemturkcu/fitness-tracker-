package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.dtos.ClientDto;
import com.fitnessteam.fitnesstracker.entities.Client;
import com.fitnessteam.fitnesstracker.repositories.ClientRepository;
import com.fitnessteam.fitnesstracker.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        Client client=clientRepository.getById(id);
        clientRepository.delete(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public List<ClientDto> getClientAll() {
        List<ClientDto> response = clientRepository.listAllClients();
        for (int i=0; i< response.size(); i++){
            if(response.get(i).isGender()){
                response.get(i).setStringGender("Male");
            }
            else {
                response.get(i).setStringGender("Female");
            }
        }
        return response;
    }
}
