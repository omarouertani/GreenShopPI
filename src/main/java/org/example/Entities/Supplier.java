package org.example.Entities;

import java.util.List;

public class Supplier {
    private String id;
    private String name;
    private String contactInfo;
    private List<Product> products;

    public Supplier() {
    }

    public Supplier(String id, String name, String contactInfo, List<Product> products) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
