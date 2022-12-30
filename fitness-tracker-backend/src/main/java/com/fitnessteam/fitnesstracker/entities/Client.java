package com.fitnessteam.fitnesstracker.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "client")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private Date createdOn;
    private boolean gender;
    private boolean isActive;
    private int age;
    private double height;
    private double weight;
    private double bodyMassIndex;
    private double neckGirth; // boyun çevresi
    private double hipCircumference; // kalça çevresi
    private double garth; // bel çevresi
    private boolean isSmoke;
    private String sportDescription;
    private double basalMetabolism;
    @Enumerated(EnumType.STRING)
    private  Target target;


    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id",referencedColumnName = "id")//, referencedColumnName = "Id"
    private User user;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "tracker_id")
    private Tracker tracker;

    @OneToMany
    private List<TrainingProgram> trainingPrograms;
    /*


    @OneToMany
    private List<NutritionSchedule> nutritionSchedules;

     */





}
