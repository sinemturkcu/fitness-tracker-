package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "client")
@Entity
public class Client extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

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
