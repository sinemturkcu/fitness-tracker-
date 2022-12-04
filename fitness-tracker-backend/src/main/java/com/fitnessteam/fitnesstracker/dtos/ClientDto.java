package com.fitnessteam.fitnesstracker.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ClientDto {
    private Long clientId;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private Date createdOn;
    private boolean gender;
    private Long trackerId;
    private String trackerName;
    private String stringGender;


    public ClientDto(Long clientId, String fullName, String emailAddress, String phoneNumber, Date createdOn, boolean gender, Long trackerId, String trackerName){
        this.clientId = clientId;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.createdOn = createdOn;
        this.gender = gender;
        this.trackerId = trackerId;
        this.trackerName = trackerName;
    }
}
