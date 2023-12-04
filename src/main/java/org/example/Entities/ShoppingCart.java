package org.example.Entities;

import java.util.List;

public class ShoppingCart {

        private String id;
        private List<Product> products;

    public ShoppingCart() {
    }

    public ShoppingCart(String id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}


