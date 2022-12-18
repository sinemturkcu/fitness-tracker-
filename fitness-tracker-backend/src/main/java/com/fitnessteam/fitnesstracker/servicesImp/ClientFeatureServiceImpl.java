package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.ClientFeature;
import com.fitnessteam.fitnesstracker.repositories.ClientFeatureRepository;
import com.fitnessteam.fitnesstracker.services.ClientFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientFeatureServiceImpl implements ClientFeatureService {

    ClientFeatureRepository clientFeatureRepository;

    @Autowired
    public ClientFeatureServiceImpl(ClientFeatureRepository clientFeatureRepository) {
        this.clientFeatureRepository = clientFeatureRepository;
    }

    @Override
    public ClientFeature saveClientFeature(ClientFeature clientFeature) {
        double BMR;
        double BMI;
        if (clientFeature.isGender()){
            BMR = calculateBasalMetabolismForMan(clientFeature.getAge(),
                    clientFeature.getWeight(), clientFeature.getHeight());
        }
        else {
            BMR = calculateBasalMetabolismForWomen(clientFeature.getAge(),
                    clientFeature.getWeight(), clientFeature.getHeight());
        }
        clientFeature.setBasalMetabolism(BMR);
        BMI = calculateBodyMassIndex(clientFeature.getWeight(), clientFeature.getHeight());
        clientFeature.setBodyMassIndex(BMI);

        return clientFeatureRepository.save(clientFeature);
    }

    @Override
    public void deleteClientFeature(Long id) {
        ClientFeature clientFeature=clientFeatureRepository.getById(id);
        clientFeatureRepository.delete(clientFeature);
    }

    @Override
    public List<ClientFeature> getAll() {
        return clientFeatureRepository.findAll();
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


}


