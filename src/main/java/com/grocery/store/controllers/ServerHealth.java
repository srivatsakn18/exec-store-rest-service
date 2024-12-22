package com.grocery.store.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class ServerHealth {

    @GetMapping(value="/")
    public ResponseEntity<String> serverHealth() {
        return new ResponseEntity<>("Rest server Up", HttpStatus.OK);
    }
}
