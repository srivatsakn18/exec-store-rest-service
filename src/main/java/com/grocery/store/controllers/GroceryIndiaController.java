package com.grocery.store.controllers;

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
    public ResponseEntity<Object> getItems(@RequestBody GetEntitiesDTO entity) {
        try {
            GroceryItem groceryItem = indianGroceryServices.findGroceryItembyId(entity.getId());
            GetEntitiesResponseDTO getEntitiesResponseDTO = new GetEntitiesResponseDTO("Completed Successfully",
                    "200", groceryItem);
            return new ResponseEntity<>(getEntitiesResponseDTO, HttpStatus.OK);
        } catch (ItemNotFoundException e) {
            GetEntitiesErrorDTO getEntitiesErrorDTO = new GetEntitiesErrorDTO("Unsuccessful",
                    "404", e.getMessage());
            return new ResponseEntity<>(getEntitiesErrorDTO, HttpStatus.NOT_FOUND);
        }
    }
}
