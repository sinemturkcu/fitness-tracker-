package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "nutritionSchedule")
@Entity
@Data
public class NutritionSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<ReceivedNutrition> firstMeal;
    @OneToMany
    private List<ReceivedNutrition> secondMeal;
    @OneToMany
    private List<ReceivedNutrition> thirdMeal;
    @OneToMany
    private List<ReceivedNutrition> fourthMeal;
    @OneToMany
    private List<ReceivedNutrition> fifthMeal;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
