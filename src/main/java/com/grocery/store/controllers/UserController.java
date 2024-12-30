package com.grocery.store.controllers;

import com.grocery.store.entities.User;
import com.grocery.store.exceptions.ObjectNotFoundException;
import com.grocery.store.models.GetEntitiesDTO;
import com.grocery.store.models.GetEntitiesResponseDTO;
import com.grocery.store.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/get")
    public ResponseEntity<GetEntitiesResponseDTO> getUser(@RequestBody GetEntitiesDTO userID) throws ObjectNotFoundException {
        return new ResponseEntity<>(new GetEntitiesResponseDTO("Completed Successfully",
                HttpStatus.OK.name(), userService.getUser(userID.getId())),
                HttpStatus.OK);
    }
}
