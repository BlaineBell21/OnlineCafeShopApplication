package com.cafeapp.enums.drink.side;

public enum SideCategory {
    COMPLIMENTARY(0),
    MAIN(1.50);

    private final double price;

    SideCategory(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
