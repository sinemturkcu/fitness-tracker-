package com.fitnessteam.fitnesstracker.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "tracker")
@Entity
@EqualsAndHashCode(callSuper=false)

public class Tracker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int experienceYear;
    private String image;
    private String description;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private Date createdOn;
    private boolean gender;
    private boolean isActive;
    private int starRate;

    @JsonManagedReference
    @OneToMany
    @JoinColumn(name = "client_id")
    private List<Client> students;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id",referencedColumnName = "id")//, referencedColumnName = "Id"
    private User user;


}
