package com.fitnessteam.fitnesstracker.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientFilterDto {
    private Long clientId;
    private String fullName;

    public ClientFilterDto(Long clientId, String fullName) {
        this.clientId = clientId;
        this.fullName = fullName;
    }
}
