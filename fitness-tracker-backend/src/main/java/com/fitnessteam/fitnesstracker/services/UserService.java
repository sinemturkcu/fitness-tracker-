package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.User;
import com.fitnessteam.fitnesstracker.repositories.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface UserService {
   List<User> saveUser();
   User saveUser(User user);
   void deleteUser(Long id);

}
