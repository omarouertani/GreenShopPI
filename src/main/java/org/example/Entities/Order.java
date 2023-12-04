package org.example.Entities;


import java.util.List;

public class Order {
        private String id;
        private List<Product> products;
        private Statut status;
        private String deliveryAddress;
        private PaymentInfo paymentInfo;

        public Order() {
        }

        public Order(String id, List<Product> products, Statut status, String deliveryAddress, PaymentInfo paymentInfo) {
                this.id = id;
                this.products = products;
                this.status = status;
                this.deliveryAddress = deliveryAddress;
                this.paymentInfo = paymentInfo;
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

        public Statut getStatus() {
                return status;
        }

        public void setStatus(Statut status) {
                this.status = status;
        }

        public String getDeliveryAddress() {
                return deliveryAddress;
        }

        public void setDeliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
        }

        public PaymentInfo getPaymentInfo() {
                return paymentInfo;
        }

        public void setPaymentInfo(PaymentInfo paymentInfo) {
                this.paymentInfo = paymentInfo;
        }
}


