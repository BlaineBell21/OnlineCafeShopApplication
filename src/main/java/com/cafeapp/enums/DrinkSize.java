package com.cafeapp.enums;

public enum DrinkSize {
    SMALL(1,"Small",3.50),
    MEDIUM(2,"Medium",9),
    LARGE(3,"Large",8.50);

    private final int code;
    private final double baseCost;
    private final String drinkSize;

    DrinkSize(int code, String drinkSize, double baseCost){
        this.code = code;
        this.baseCost = baseCost;
        this.drinkSize = drinkSize;
    }

    public int getCode() {
        return code;
    }

    public double getBaseCost(){
        return baseCost;
    }
    public String getDrinkSize(){
        return drinkSize;
    }
}
