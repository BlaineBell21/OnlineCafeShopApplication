package com.cafeapp.enums;

import java.util.Arrays;
import java.util.Optional;

public enum DrinkType {
    LATTE(1,"Latte"),
    ESPRESSO(2,"Espresso"),
    BLACK_TEA(3,"Black Tea"),
    GREEN_TEA(4,"Green Tea");

    private final int code;
    private final String label;

    DrinkType(int code, String name) {
        this.code = code;
        this.label = name;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }
    public static Optional<DrinkType> fromCode(int code) {
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
