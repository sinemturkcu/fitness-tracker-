package com.fitnessteam.fitnesstracker.controllers;

import com.fitnessteam.fitnesstracker.entities.Client;
import com.fitnessteam.fitnesstracker.entities.ClientFeature;
import com.fitnessteam.fitnesstracker.services.ClientFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/clientFeature")
public class ClientFeatureController {
    ClientFeatureService clientFeatureService;

    @Autowired
    public ClientFeatureController(ClientFeatureService clientFeatureService) {
        this.clientFeatureService = clientFeatureService;
    }

    @GetMapping("/getAll")
    public List<ClientFeature> getAll(){
        return clientFeatureService.getAll();
    }

    @PostMapping
    public ClientFeature save(@RequestBody ClientFeature clientFeature){
        return clientFeatureService.saveClientFeature(clientFeature);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
         clientFeatureService.deleteClientFeature(id);
    }
}
