package com.grocery.store.services;

import com.grocery.store.entities.GroceryItem;
import com.grocery.store.exceptions.ItemNotFoundException;
import com.grocery.store.exceptions.ObjectNotFoundException;
import com.grocery.store.repository.IndianGroceryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndianGroceryServices {

    @Autowired
    public IndianGroceryRepository indianGroceryRepository;

    public GroceryItem findGroceryItembyId(String id) throws ObjectNotFoundException {
        GroceryItem item = indianGroceryRepository.findBygroceryId(id);
        if(item == null)
            throw new ObjectNotFoundException("Item Not Found");
        else
            return item;
    }
}
