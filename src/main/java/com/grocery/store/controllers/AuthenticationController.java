package com.grocery.store.controllers;

import com.grocery.store.exceptions.AuthorizationException;
import com.grocery.store.exceptions.UserNotFoundException;
import com.grocery.store.models.AuthorizedUserDTO;
import com.grocery.store.services.AuthenticationService;
import com.grocery.store.util.BasicAuthDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping(path = "/login")
    public ResponseEntity<AuthorizedUserDTO> login(@RequestHeader final String authorization) throws AuthorizationException, UserNotFoundException {
        final BasicAuthDecoder basicAuthDecoder = new BasicAuthDecoder(authorization);
        final AuthorizedUserDTO authorizedUser = authenticationService.authenticate(basicAuthDecoder.getUserid(), basicAuthDecoder.getPassword());
        return ResponseEntity.status(HttpStatus.OK).body(authorizedUser);
    }

}
