package com.cafeapp.models;

abstract class MenuItem {
    private final String itemName;
    private final String typeOfItem;
    private final double basePrice;

    public MenuItem(String itemName, String typeOfItem , double basePrice) {
        this.itemName = itemName;
        this.basePrice = basePrice;
        this.typeOfItem = typeOfItem;
    }

    public String getItemName() {
        return itemName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getTypeOfItem() {
        return typeOfItem;
    }

}
