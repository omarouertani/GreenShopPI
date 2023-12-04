package org.example.Services;

import org.example.Entities.Order;

public interface OrderService {
    void displayOrderHistory(String userId);
    void trackOrderStatus(String orderId);
    void fillOrderForm(Order order);
    void addToCart(String userId, String productId);
    void removeFromCart(String userId, String productId);
    double calculateOrderTotal(String userId);
    void updateProductQuantity(String userId, String productId, int quantity);
}
