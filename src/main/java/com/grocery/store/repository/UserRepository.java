package com.grocery.store.repository;

import com.grocery.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT USER_ID, USER_NAME, USER_EMAIL, USER_PASSWORD FROM USER_T WHERE USER_ID = :userId", nativeQuery = true)
    User findbyUserId(String userId);
}
