package com.fitnessteam.fitnesstracker.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListRequest {
    private Long userId;

    public ListRequest(Long userId) {
        this.userId = userId;
    }
}
