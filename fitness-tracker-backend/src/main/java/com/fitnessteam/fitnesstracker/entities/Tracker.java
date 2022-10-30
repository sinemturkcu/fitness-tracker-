package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "tracker")
@Entity
public class Tracker extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trackerId;
    private int experienceYear;
    private String description;
    @OneToMany
    private List<Client> students;


}
