package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "user")
@Inheritance (strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private String password;
    private Date createdOn;
    private boolean gender;
    private boolean isActive;

    @OneToMany
    private List<Role> role;



}
