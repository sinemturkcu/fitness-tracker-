package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("user")
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllById(Long id);
    User getById(Long id);

}
