package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name="role")
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String desc;

    @ManyToMany
    private List<Claim> claims;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
