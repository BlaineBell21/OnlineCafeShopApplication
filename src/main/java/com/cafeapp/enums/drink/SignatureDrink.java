package com.cafeapp.enums.drink;


import java.util.ArrayList;

public enum SignatureDrink{
    ;
    private final String drinkBase;
    private final String milkType;
    private final ArrayList<String> toppings;
    private final String description;

    SignatureDrink(String drinkBase, String milkType, ArrayList<String> toppings, String description) {
        this.drinkBase = drinkBase;
        this.milkType = milkType;
        this.toppings = toppings;
        this.description = description;
    }

    public String getDrinkBase() {
        return drinkBase;
    }

    public String getMilkType() {
        return milkType;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public String getDescription() {
        return description;
    }
}
