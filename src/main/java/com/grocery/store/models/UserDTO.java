package com.grocery.store.models;

import lombok.Data;

@Data
public class UserDTO {

    private String userId;
    private String userName;
    private String userEmail;
    private String userPassword;

}
