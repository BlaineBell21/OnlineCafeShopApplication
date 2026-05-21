package com.cafeapp.models;

abstract class MenuItem {
    private String itemName;
    private double basePrice;

    public MenuItem(String itemName, double basePrice) {
        this.itemName = itemName;
        this.basePrice = basePrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
