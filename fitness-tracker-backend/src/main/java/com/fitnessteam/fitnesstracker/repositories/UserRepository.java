package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("user")
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}
