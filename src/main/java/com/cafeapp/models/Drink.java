package com.cafeapp.models;

import com.cafeapp.enums.drink.DrinkSize;
import com.cafeapp.enums.drink.DrinkBase;
import com.cafeapp.enums.topping.ToppingCategory;
import com.cafeapp.enums.topping.ToppingType;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Drink extends MenuItem{
    private final DrinkSize size;
    private final DrinkBase category;
    private ArrayList<ToppingType> toppings;

    public Drink(String itemLabel, double basePrice, DrinkSize size, DrinkBase category, ArrayList<ToppingType> toppings) {
        super(itemLabel, basePrice);
        this.size = size;
        this.category = category;
        this.toppings = toppings;
    }

    public DrinkSize getSize() {
        return size;
    }

    public double getCupBaseCost(DrinkSize size) {
        return size.getBaseCost();
    }

    public String getType() {
        return category.getLabel();
    }

    public ArrayList<ToppingType> getToppings(){
        return toppings;
    }

    public void test(int topping){
        if(topping == 1){

        } else if(topping > 1){

        }
    }

    public double calculateToppingTotal(){

        ArrayList<ToppingType> toppings = getToppings();
        int totalPremiumToppings = 0;
        int totalBoosterToppings = 0;

        for(ToppingType topping : toppings){
            if(topping.getCategory() == ToppingCategory.PREMIUM) {
                totalPremiumToppings += 1;
            } else if(topping.getCategory() == ToppingCategory.BOOSTER){
                totalBoosterToppings += 1;
            }
        }

        double premiumToppingsPrice = 0;
        double boosterToppingsPrice = 0;

        switch(size) {
            case SMALL -> {
                if (totalPremiumToppings == 1){
                    premiumToppingsPrice += ToppingCategory.PREMIUM.getSmallBasePrice();
                } else if (totalPremiumToppings > 1) {
                    premiumToppingsPrice += ToppingCategory.PREMIUM.getSmallBasePrice();
                    int premiumToppings = totalPremiumToppings - 1;
                    premiumToppingsPrice += premiumToppings * ToppingCategory.PREMIUM.getSmallExtraPrice();
                }
                if (totalBoosterToppings == 1){
                    boosterToppingsPrice += ToppingCategory.BOOSTER.getSmallBasePrice();
                } else if (totalBoosterToppings > 1) {
                    boosterToppingsPrice += ToppingCategory.BOOSTER.getSmallBasePrice();
                    int boosterToppings = totalBoosterToppings - 1;
                    boosterToppingsPrice += boosterToppings * ToppingCategory.BOOSTER.getSmallExtraPrice();
                }
            }
            case MEDIUM -> {
                if(totalPremiumToppings == 1) {
                    premiumToppingsPrice += ToppingCategory.PREMIUM.getMediumBasePrice();
                }else if (totalPremiumToppings > 1) {
                    premiumToppingsPrice += ToppingCategory.PREMIUM.getMediumBasePrice();
                    int premiumToppings = totalPremiumToppings - 1;
                    premiumToppingsPrice += premiumToppings * ToppingCategory.PREMIUM.getMediumExtraPrice();
                }
                if (totalBoosterToppings == 1){
                    boosterToppingsPrice += ToppingCategory.BOOSTER.getMediumBasePrice();
                } else if (totalBoosterToppings > 1) {
                    boosterToppingsPrice += ToppingCategory.BOOSTER.getMediumBasePrice();
                    int boosterToppings = totalBoosterToppings - 1;
                    boosterToppingsPrice += boosterToppings * ToppingCategory.BOOSTER.getMediumBasePrice();
                }
            }
            case LARGE -> {
                if(totalPremiumToppings == 1) {
                    premiumToppingsPrice += ToppingCategory.PREMIUM.getLargeBasePrice();
                }else if (totalPremiumToppings > 1) {
                    premiumToppingsPrice += ToppingCategory.PREMIUM.getLargeBasePrice();
                    int premiumToppings = totalPremiumToppings - 1;
                    premiumToppingsPrice += premiumToppings * ToppingCategory.PREMIUM.getLargeExtraPrice();
                }
                if (totalBoosterToppings == 1){
                    boosterToppingsPrice += ToppingCategory.BOOSTER.getLargeBasePrice();
                } else if (totalBoosterToppings > 1) {
                    boosterToppingsPrice += ToppingCategory.BOOSTER.getLargeBasePrice();
                    int boosterToppings = totalBoosterToppings - 1;
                    boosterToppingsPrice += boosterToppings * ToppingCategory.BOOSTER.getLargeBasePrice();
                }
            }
        }
        return premiumToppingsPrice + boosterToppingsPrice;
    }

    public String getToppingFormat() {
        return toppings.stream()
                .map(ToppingType::getLabel)
                .collect(Collectors.joining(", "));
    }

    @Override
    double calculatePrice() {
        double baseCupCost = getCupBaseCost(size);
        return baseCupCost + calculateToppingTotal();
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
