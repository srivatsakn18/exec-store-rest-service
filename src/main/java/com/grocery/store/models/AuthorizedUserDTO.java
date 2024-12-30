package com.grocery.store.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorizedUserDTO {

    public String userName;
    public String bearerToken;
    public Long expiryTime;

}
