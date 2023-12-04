package org.example.Entities;

import java.util.List;

public class RegisteredUser {
    private String id;
    private String username;
    private String password;
    private String email;
    private String deliveryAddress;
    private List<Order> orderHistory;
    private ShoppingCart shoppingCart;
    private List<Notification> notifications;

    public RegisteredUser() {
    }

    public RegisteredUser(String id, String username, String password, String email, String deliveryAddress, List<Order> orderHistory, ShoppingCart shoppingCart, List<Notification> notifications) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.orderHistory = orderHistory;
        this.shoppingCart = shoppingCart;
        this.notifications = notifications;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
