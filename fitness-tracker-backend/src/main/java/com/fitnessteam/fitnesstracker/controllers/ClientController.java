package com.fitnessteam.fitnesstracker.controllers;


import com.fitnessteam.fitnesstracker.dtos.ClientDto;
import com.fitnessteam.fitnesstracker.dtos.ClientFilterDto;
import com.fitnessteam.fitnesstracker.entities.Client;
import com.fitnessteam.fitnesstracker.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@CrossOrigin(origins="*")
public class ClientController {
    ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/getAll")
    public List<Client> getAll(){
        return this.clientService.getAll();
    }

    @PostMapping
    public Client save(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
         clientService.deleteClient(id);
    }

    @GetMapping("/listAll")
    public List<ClientDto> getAllDto(){
        return  this.clientService.getClientAll();
    }

    @GetMapping("/filter")
    public List<ClientFilterDto> getFilterAll(@RequestParam Long trackerId){
        return clientService.filterByTrackerId(trackerId);
    }




}
