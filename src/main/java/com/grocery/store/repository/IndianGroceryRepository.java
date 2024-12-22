package com.grocery.store.repository;

import com.grocery.store.entities.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IndianGroceryRepository extends JpaRepository<GroceryItem, String> {

    @Query(value = "SELECT * FROM GROCERY_IND_T WHERE GROCERY_ID = :groceryId", nativeQuery = true)
    public GroceryItem findBygroceryId(String groceryId);
}
