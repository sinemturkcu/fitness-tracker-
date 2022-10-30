package com.fitnessteam.fitnesstracker.entities;

import lombok.Data;
import net.bytebuddy.utility.nullability.MaybeNull;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "claim")
@Entity
public class Claim {
    @Id
    private String id;
    private String desc;

    @ManyToMany
    @JoinColumn(name = "role_id")
    private List<Role> roles;
}
