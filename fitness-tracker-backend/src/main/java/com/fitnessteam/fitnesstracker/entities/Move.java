package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "move")
@Entity
public class Move {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int setNumber;
    private int repetitionNumber;
    private String note;


    @ManyToOne
    @JoinColumn(name = "training_program_id")
    private TrainingProgram trainingProgram;


}
