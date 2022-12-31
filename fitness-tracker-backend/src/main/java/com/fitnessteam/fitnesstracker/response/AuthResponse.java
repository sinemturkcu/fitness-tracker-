package com.fitnessteam.fitnesstracker.response;

import lombok.Data;

@Data
public class AuthResponse {

    String message;
    Long userId;
    String accessToken;
    String refreshToken;
    String userRole;
}
