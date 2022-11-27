package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.User;
import com.fitnessteam.fitnesstracker.repositories.UserRepository;
import com.fitnessteam.fitnesstracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
         User user= userRepository.getById(id);
         userRepository.delete(user);

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getOneUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public User saveOneUser(User user) {
        return userRepository.save(user);
    }
}
