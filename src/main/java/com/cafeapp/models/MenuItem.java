package com.cafeapp.models;

public class MenuItem {
    private final String itemLabel;
    private double basePrice;

    public MenuItem(String itemLabel, double basePrice) {
        this.itemLabel = itemLabel;
        this.basePrice = basePrice;
    }

    public String getItemLabel() {
        return itemLabel;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return null;
    }
}
