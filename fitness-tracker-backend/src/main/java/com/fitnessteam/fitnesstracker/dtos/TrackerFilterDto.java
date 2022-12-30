package com.fitnessteam.fitnesstracker.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrackerFilterDto {
    private Long trackerId;

    public TrackerFilterDto(Long trackerId) {
        this.trackerId = trackerId;
    }
}
