package com.cafeapp.models;

import com.cafeapp.enums.DrinkSize;
import com.cafeapp.enums.DrinkType;
import com.cafeapp.enums.ToppingType;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Drink {
    private final DrinkSize size;
    private final DrinkType type;
    private ArrayList<ToppingType> toppings;

    public Drink(DrinkSize size, DrinkType type, ArrayList<ToppingType> toppings) {
        this.size = size;
        this.type = type;
        this.toppings = toppings;
    }

    public String getSize() {
        return size.getLabel();
    }

    public String getType() {
        return type.getLabel();
    }

    public String getToppings() {
        return toppings.stream()
                .map(ToppingType::getLabel)
                .collect(Collectors.joining(", "));
    }

    public void setToppings(ArrayList<ToppingType> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString(){
        return String.format(
                """
                Size: %s
                Type: %s
                Toppings: %s
                """,
                getSize(),
                getType(),
                getToppings()
        );
    }

}
