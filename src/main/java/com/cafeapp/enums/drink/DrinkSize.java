package com.cafeapp.enums.drink;


import com.cafeapp.interfaces.Displayable;

import java.util.Arrays;
import java.util.Optional;

public enum DrinkSize implements Displayable {
    SMALL(1,"Small",3.50),
    MEDIUM(2,"Medium",9),
    LARGE(3,"Large",8.50);

    private final int code;
    private final double baseCost;
    private final String size;

    DrinkSize(int code, String size, double baseCost){
        this.code = code;
        this.baseCost = baseCost;
        this.size = size;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getLabel() {
        return size;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public static Optional<DrinkSize> fromCode(int code) {
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
