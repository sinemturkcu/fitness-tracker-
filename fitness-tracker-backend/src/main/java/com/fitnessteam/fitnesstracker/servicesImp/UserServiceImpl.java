package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.User;
import com.fitnessteam.fitnesstracker.repositories.UserRepository;
import com.fitnessteam.fitnesstracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @Override
    public List<User> saveUser() {
        User user=new User();
        List<User> userList=new ArrayList<>();
        userList.add(user);
        return userRepository.saveAll(userList);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user=userRepository.getById(id);
        userRepository.delete(user);
    }

}
