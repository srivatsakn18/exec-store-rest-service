package com.grocery.store.models;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
@JsonPropertyOrder({ "groceryId", "category", "subCategory", "product", "brand",
                    "salePrice", "marketPrice", "type", "rating", "description"})
public class GroceryItemDTO {

    @JsonProperty("groceryId")
    public String groceryId;
    @JsonProperty("product")
    public String product;
    @JsonProperty("category")
    public String category;
    @JsonProperty("subCategory")
    public String subCategory;
    @JsonProperty("brand")
    public String brand;
    @JsonProperty("salePrice")
    public String salePrice;
    @JsonProperty("marketPrice")
    public String marketPrice;
    @JsonProperty("type")
    public String type;
    @JsonProperty("rating")
    public String rating;
    @JsonProperty("description")
    public String description;

    @Override
    public String toString() {
        return "GroceryItemDTO{" +
                "groceryId='" + groceryId + '\'' +
                ", product='" + product + '\'' +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", brand='" + brand + '\'' +
                ", salePrice='" + salePrice + '\'' +
                ", marketPrice='" + marketPrice + '\'' +
                ", type='" + type + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
