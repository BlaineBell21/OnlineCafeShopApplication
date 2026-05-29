package com.cafeapp.enums.drink;

import com.cafeapp.interfaces.Displayable;


import java.util.Arrays;
import java.util.Optional;

public enum SeasonalDrinkSize implements Displayable {
    // contains seasonal drink size and cost values
    SEASONAL_SMALL(1,"Seasonal Small",2),
    SEASONAL_MEDIUM(2,"Seasonal Medium",2.50),
    SEASONAL_LARGE(3,"Seasonal Large",3);

    private final int code;
    private final double baseCost;
    private final String label;

    SeasonalDrinkSize(int code, String label, double baseCost){
        this.code = code;
        this.baseCost = baseCost;
        this.label = label;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public double getBaseCost() {
        return baseCost;
    }
    public static Optional<SeasonalDrinkSize> fromCode(int code) {
        //takes in int input to check if it is a value that exists in the enums
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
