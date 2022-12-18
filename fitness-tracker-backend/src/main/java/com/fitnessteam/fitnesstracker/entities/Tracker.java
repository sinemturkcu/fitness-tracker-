package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "tracker")
@Entity
@EqualsAndHashCode(callSuper=false)

public class Tracker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int experienceYear;
    private String description;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    // private String password;
    private Date createdOn;
    private boolean gender;
    private boolean isActive;
    private int starRate;
    @OneToMany
    private List<Client> students;



}
