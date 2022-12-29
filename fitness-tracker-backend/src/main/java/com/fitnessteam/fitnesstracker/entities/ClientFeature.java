package com.fitnessteam.fitnesstracker.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "clientFeature")
@Entity
public class ClientFeature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
    @Enumerated(EnumType.STRING)
    private  Target target;

   @OneToOne(cascade = CascadeType.MERGE)
   @JoinColumn(name = "client_id",referencedColumnName = "id")//, referencedColumnName = "Id"
   private Client client;



}
