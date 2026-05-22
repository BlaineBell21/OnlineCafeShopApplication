package com.cafeapp.models;

import java.util.List;

public class Drink {
    private final String size;
    private final String type;
    private List<Topping> toppings;
    private String specialOptions;

    public Drink(String size, String type, List<Topping> toppings, String specialOptions) {
        this.size = size;
        this.type = type;
        this.toppings = toppings;
        this.specialOptions = specialOptions;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public String getSpecialOptions() {
        return specialOptions;
    }

    public void setSpecialOptions(String specialOptions) {
        this.specialOptions = specialOptions;
    }
}
