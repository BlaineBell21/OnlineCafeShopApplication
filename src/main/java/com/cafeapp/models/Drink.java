package com.cafeapp.models;

import com.cafeapp.enums.DrinkSize;
import com.cafeapp.enums.DrinkBase;
import com.cafeapp.enums.ToppingType;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Drink extends MenuItem{
    private final DrinkSize size;
    private final DrinkBase type;
    private ArrayList<ToppingType> toppings;

    public Drink(String itemLabel, double basePrice, DrinkSize size, DrinkBase type, ArrayList<ToppingType> toppings) {
        super(itemLabel, basePrice);
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

    public ArrayList<ToppingType> getToppings(){
        return toppings;
    }

    public String getToppingFormat() {
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
                getToppingFormat()
        );
    }

}
