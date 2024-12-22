package com.grocery.store.entities;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "GROCERY_IND_T")
@AllArgsConstructor
@NoArgsConstructor
public class GroceryItem {
    @Id
    @Column(name = "GROCERY_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public String groceryId;
    @Column(name = "PRODUCT")
    public String product;
    @Column(name = "CATEGORY")
    public String category;
    @Column(name = "SUB_CATEGORY")
    public String subCategory;
    @Column(name = "BRAND")
    public String brand;
    @Column(name = "SALE_PRICE")
    public String salePrice;
    @Column(name = "MARKET_PRICE")
    public String marketPrice;
    @Column(name = "TYPE")
    public String type;
    @Column(name = "RATING")
    public String rating;
    @Column(name = "DESCRIPTION")
    public String description;
}
