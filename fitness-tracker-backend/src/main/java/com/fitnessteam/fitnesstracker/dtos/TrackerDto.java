package com.fitnessteam.fitnesstracker.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrackerDto {
    private Long id;
    private int experienceYear;
    private String image;
    private String description;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private boolean gender;
    private String sGender;
    private boolean isActive;

    public TrackerDto(Long id, int experienceYear,String image, String description, String fullName, String emailAddress,
                      String phoneNumber, boolean gender,boolean isActive){
        this.id = id;
        this.experienceYear = experienceYear;
        this.image=image;
        this.description = description;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.isActive=isActive;

    }
}
