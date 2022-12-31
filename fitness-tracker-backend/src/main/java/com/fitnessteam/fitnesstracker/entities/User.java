package com.fitnessteam.fitnesstracker.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String userName;
    String password;

    @Enumerated(EnumType.STRING)
    private  Roles roles;

    @OneToOne(mappedBy = "user")
    private Client client;

    @OneToOne(mappedBy = "user")
    private Tracker tracker;


}
