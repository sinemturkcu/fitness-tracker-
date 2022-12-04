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

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany
    private List<Move> firstDay;
    @OneToMany
    private List<Move> secondDay;
    @OneToMany
    private List<Move> thirdDay;
    @OneToMany
    private List<Move> fourthDay;
    @OneToMany
    private List<Move> fifthDay;




}
