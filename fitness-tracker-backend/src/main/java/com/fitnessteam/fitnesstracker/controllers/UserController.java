package com.fitnessteam.fitnesstracker.controllers;

import com.fitnessteam.fitnesstracker.entities.Client;
import com.fitnessteam.fitnesstracker.entities.User;
import com.fitnessteam.fitnesstracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return this.userService.getAll();
    }


    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody User newUser) {
        User user = userService.saveUser(newUser);
        if(user != null)
            return new ResponseEntity<>(HttpStatus.CREATED);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }





}
