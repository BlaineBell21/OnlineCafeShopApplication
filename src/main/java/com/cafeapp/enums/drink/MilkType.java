package com.cafeapp.enums.drink;

import com.cafeapp.interfaces.Displayable;

public enum MilkType implements Displayable {
    SOY_MILK(1, "Soy Milk"),
    ALMOND_MILK(2, "Almond Milk"),
    WHOLE_MILK(3, "Whole Milk"),
    TWO_PERCENT_MILK(4, "2% Milk");

    private final int code;
    private final String label;

    MilkType(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }
}
