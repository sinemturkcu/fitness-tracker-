package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    User saveUser(User user);
    void deleteUser(Long id);
    List<User> getAll();
    User getOneUserByUserName(String userName);
    User saveOneUser(User user);
}
