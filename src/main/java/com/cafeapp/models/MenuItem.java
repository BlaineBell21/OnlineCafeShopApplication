package com.cafeapp.models;

abstract class MenuItem {
    private final String itemLabel;
    private final String typeOfItem;


    public MenuItem(String itemLabel, String typeOfItem) {
        this.itemLabel = itemLabel;
        this.typeOfItem = typeOfItem;
    }

    public String getItemLabel() {
        return itemLabel;
    }

    public String getTypeOfItem() {
        return typeOfItem;
    }

}
