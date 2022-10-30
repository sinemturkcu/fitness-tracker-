package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "clientFeature")
@Entity
public class ClientFeature {
    @Id
    private Long Id;
    private boolean gender;
    private int age;
    private double height;
    private double weight;
    private double bodyMassIndex;
    private double neckGirth; // boyun çevresi
    private double hipCircumference; // kalça çevresi
    private double garth; // bel çevresi
    private boolean isSmoke;
    private String sportDescription;
    private double basalMetabolism;
    private  Enum target;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "Id")
    private Client client;








}
