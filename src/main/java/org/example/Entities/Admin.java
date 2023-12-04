package org.example.Entities;

import java.util.List;

public class Admin {
    private String id;
    private String username;
    private String password;
    private List<Product> products;
    private List<Order> orders;
    private List<RegisteredUser> users;

    public Admin() {

    }

    public Admin(String id, String username, String password, List<Product> products, List<Order> orders, List<RegisteredUser> users) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.products = products;
        this.orders = orders;
        this.users = users;
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

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<RegisteredUser> getUsers() {
        return users;
    }

    public void setUsers(List<RegisteredUser> users) {
        this.users = users;
    }
}


