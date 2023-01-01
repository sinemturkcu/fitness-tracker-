package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.dtos.ClientDto;
import com.fitnessteam.fitnesstracker.dtos.ClientFilterDto;
import com.fitnessteam.fitnesstracker.dtos.TrackerFilterDto;
import com.fitnessteam.fitnesstracker.entities.Client;
import com.fitnessteam.fitnesstracker.entities.Tracker;
import com.fitnessteam.fitnesstracker.repositories.ClientRepository;
import com.fitnessteam.fitnesstracker.repositories.TrackerRepository;
import com.fitnessteam.fitnesstracker.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    ClientRepository clientRepository;
    TrackerRepository trackerRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository, TrackerRepository trackerRepository) {
        this.clientRepository = clientRepository;
        this.trackerRepository = trackerRepository;
    }


    @Override
    public Client saveClient(Client client) {
        double BMR;
        double BMI;
        if (client.isGender()){
            BMR = calculateBasalMetabolismForMan(client.getAge(),
                    client.getWeight(), client.getHeight());
        }
        else {
            BMR = calculateBasalMetabolismForWomen(client.getAge(),
                    client.getWeight(), client.getHeight());
        }
        client.setBasalMetabolism(BMR);
        BMI = calculateBodyMassIndex(client.getWeight(), client.getHeight());
        client.setBodyMassIndex(BMI);

        return clientRepository.save(client);
    }
    public double calculateBasalMetabolismForMan(int age, double weight, double height){
        double BMR = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        return BMR;
    }

    public double calculateBasalMetabolismForWomen(int age, double weight, double height){
        double BMR = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        return BMR;
    }

    public double calculateBodyMassIndex (double weight, double height){
        double BMI = weight / ((height * height)/10000);
        return BMI;
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

    @Override
    public List<ClientFilterDto> filterByTrackerId(Long trackerId) {
        TrackerFilterDto trackerFilterDto=trackerRepository.filterByUserId(trackerId);
        return clientRepository.filterByTrackerId(trackerFilterDto.getTrackerId());
    }

    @Override
    public ClientFilterDto filterByUserId(Long userId) {
        return clientRepository.filterByUserId(userId);
    }

}
