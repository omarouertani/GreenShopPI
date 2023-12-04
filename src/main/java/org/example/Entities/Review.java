package org.example.Entities;

public class Review {
    private String id;
    private String userId;
    private int rating;

    public Review() {
    }

    public Review(String id, String userId, int rating) {
        this.id = id;
        this.userId = userId;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
