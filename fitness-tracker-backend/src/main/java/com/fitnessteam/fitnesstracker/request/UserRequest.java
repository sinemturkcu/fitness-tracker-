package com.fitnessteam.fitnesstracker.request;

import lombok.Data;

@Data
public class UserRequest {

    String userName;
    String password;
    String userRole;

}