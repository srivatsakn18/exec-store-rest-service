package com.grocery.store.controllers;

import com.grocery.store.exceptions.ObjectNotFoundException;
import com.grocery.store.models.GetEntitiesDTO;
import com.grocery.store.models.GetEntitiesResponseDTO;
import com.grocery.store.models.GetEntitiesErrorDTO;
import com.grocery.store.entities.GroceryItem;
import com.grocery.store.exceptions.ItemNotFoundException;
import com.grocery.store.services.IndianGroceryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/ind")
public class GroceryIndiaController {

    @Autowired
    public IndianGroceryServices indianGroceryServices;

    @PostMapping("/items")
    public ResponseEntity<GetEntitiesResponseDTO> getItems(@RequestBody GetEntitiesDTO entity) throws ObjectNotFoundException {
        return new ResponseEntity<>(new GetEntitiesResponseDTO("Completed Successfully",
                HttpStatus.OK.name(), indianGroceryServices.findGroceryItembyId(entity.getId())),
                HttpStatus.OK);
    }
}
