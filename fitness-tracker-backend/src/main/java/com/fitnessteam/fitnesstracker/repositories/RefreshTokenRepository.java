package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    RefreshToken findByUserId(Long userId);

}
