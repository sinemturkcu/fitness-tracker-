package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.repositories.ClaimRepository;
import com.fitnessteam.fitnesstracker.services.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimServiceImpl implements ClaimService {
    ClaimRepository claimRepository;

    @Autowired
    public ClaimServiceImpl(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }


}
