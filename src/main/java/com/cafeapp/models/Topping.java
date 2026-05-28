package com.cafeapp.models;

import com.cafeapp.enums.topping.ToppingType;

public class Topping extends MenuItem{
    private final ToppingType type;

    public Topping(String itemLabel, double basePrice, ToppingType type) {
        super(itemLabel, basePrice);
        this.type = type;
    }

    public ToppingType getToppingType(){
        return type;
    }

    @Override
    double calculatePrice() {

        return 0;
    }
}
