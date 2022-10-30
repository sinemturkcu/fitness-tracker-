package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;

@Table(name = "fitnessMove")
@Entity
@Data
public class FitnessMove {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bodyPart;
    private String equipment;
    private String gifUrl;
    private  String name;
    private String target;
}
