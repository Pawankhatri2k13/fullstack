package com.example.fullstack.entity;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private int timesInMinutes;
    private double destinationInKm;
    private double givenRate;
    private double price;
    private List<String> collectionPoint = new ArrayList<>();
    private double discount;
    private boolean isPromotionAvail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimesInMinutes() {
        return timesInMinutes;
    }

    public void setTimesInMinutes(int timesInMinutes) {
        this.timesInMinutes = timesInMinutes;
    }

    public double getDestinationInKm() {
        return destinationInKm;
    }

    public void setDestinationInKm(double destinationInKm) {
        this.destinationInKm = destinationInKm;
    }

    public double getGivenRate() {
        return givenRate;
    }

    public void setGivenRate(double givenRate) {
        this.givenRate = givenRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getCollectionPoint() {
        return collectionPoint;
    }

    public void setCollectionPoint(List<String> collectionPoint) {
        this.collectionPoint = collectionPoint;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isPromotionAvail() {
        return isPromotionAvail;
    }

    public void setPromotionAvail(boolean promotionAvail) {
        isPromotionAvail = promotionAvail;
    }
}
