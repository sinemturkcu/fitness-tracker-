package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "receivedNutrition")
@Entity
public class ReceivedNutrition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private double receivedProtein;
    private double receivedCarbo;
    private  double receivedFat;
    private String note;

    /*
        @ManyToOne
    @JoinColumn(name = "nutrition_schedule_id")
    private NutritionSchedule nutritionSchedule;
     */



}
