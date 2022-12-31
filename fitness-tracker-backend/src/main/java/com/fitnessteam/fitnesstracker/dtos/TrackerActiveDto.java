package com.fitnessteam.fitnesstracker.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrackerActiveDto {
    private Long id;
    private String fullName;
    private boolean isActive;

    public TrackerActiveDto(Long id, String fullName, boolean isActive) {
        this.id = id;
        this.fullName = fullName;
        this.isActive = isActive;
    }
}
