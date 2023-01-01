package com.fitnessteam.fitnesstracker.dtos;
import com.fitnessteam.fitnesstracker.entities.Target;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientFeatureDto {
    private Long clientId;
    private String fullName;
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
    private Target target;

    public ClientFeatureDto(Long clientId, String fullName, int age, double height, double weight, double bodyMassIndex,
                           double neckGirth, double hipCircumference, double garth, boolean isSmoke, String sportDescription,
                           double basalMetabolism, Target target
    ) {
        this.clientId = clientId;
        this.fullName = fullName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bodyMassIndex = bodyMassIndex;
        this.neckGirth = neckGirth;
        this.hipCircumference = hipCircumference;
        this.garth = garth;
        this.isSmoke = isSmoke;
        this.sportDescription = sportDescription;
        this.basalMetabolism = basalMetabolism;
        this.target = target;
    }
}

