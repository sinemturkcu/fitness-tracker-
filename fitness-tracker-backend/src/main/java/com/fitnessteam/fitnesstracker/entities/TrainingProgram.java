package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "trainingProgram")
@Data
@Entity
public class TrainingProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int setNumber;
    private int repetitionNumber;
    private String note;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "move_id")
    private FitnessMove fitnessMove;


    /*
    @ManyToOne
    @JoinColumn(name = "move_id")
    private FitnessMove fitnessMove;

       @OneToMany
    private FitnessMove whichMove;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
     */




}
