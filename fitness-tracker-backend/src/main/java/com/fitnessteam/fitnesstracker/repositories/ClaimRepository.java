package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.Claim;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("client")
@Repository
public interface ClaimRepository  extends JpaRepository<Claim,String> {
    List<Claim> findAllById(String id);
}
