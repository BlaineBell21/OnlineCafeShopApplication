package com.cafeapp.models;

public class Drink {
    private String size;
    private String type;
    private String toppings;
    private String specialOptions;

    public Drink(String size, String type, String toppings, String specialOptions) {
        this.size = size;
        this.type = type;
        this.toppings = toppings;
        this.specialOptions = specialOptions;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSpecialOptions() {
        return specialOptions;
    }

    public void setSpecialOptions(String specialOptions) {
        this.specialOptions = specialOptions;
    }
}
