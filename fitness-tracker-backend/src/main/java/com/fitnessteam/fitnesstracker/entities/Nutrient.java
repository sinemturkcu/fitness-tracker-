package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "nutrient")
public class Nutrient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double calorie;
    private double proteinRatio;
    private  double fatRate;
    private double 	carbohydrateRate;
    private String image;

}
