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


/*
  @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

 @OneToMany
    private List<ReceivedNutrition> nutritionProgram;
 */






}
