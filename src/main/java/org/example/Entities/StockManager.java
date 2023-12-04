package org.example.Entities;

import java.util.List;

public class StockManager {
    private String id;
    private String username;
    private String password;
    private List<Product> products;
    private List<Supplier> suppliers;

    public StockManager() {
    }

    public StockManager(String id, String username, String password, List<Product> products, List<Supplier> suppliers) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.products = products;
        this.suppliers = suppliers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}

