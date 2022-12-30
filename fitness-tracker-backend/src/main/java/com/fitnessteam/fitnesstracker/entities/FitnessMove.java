package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "fitnessMove")
@Entity
@Data
public class FitnessMove {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bodyPart;
    private String equipment;
    private String gifUrl;
    private  String name;
    private String target;

    @OneToMany
    private List<TrainingProgram> trainingPrograms;

    /*
      @OneToMany
    private List<TrainingProgram> trainingPrograms;
     */

}
