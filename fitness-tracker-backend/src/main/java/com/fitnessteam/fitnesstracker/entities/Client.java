package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "client")
@Entity

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    //private String password;
    private Date createdOn;
    private boolean gender;
    private boolean isActive;

    @OneToOne(mappedBy = "client")
    private ClientFeature clientFeature;

    @ManyToOne
    @JoinColumn(name = "tracker_id")
    private Tracker tracker;

    @OneToMany
    private List<TrainingProgram> trainingPrograms;

    @OneToMany
    private List<NutritionSchedule> nutritionSchedules;





}
