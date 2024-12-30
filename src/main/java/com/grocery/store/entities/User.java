package com.grocery.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_T")
public class User {

    @Id
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "USER_EMAIL")
    private String userEmail;
    @Column(name = "USER_PASSWORD")
    private String userPassword;
    @Column(name = "USER_NAME")
    private String userName;
}
