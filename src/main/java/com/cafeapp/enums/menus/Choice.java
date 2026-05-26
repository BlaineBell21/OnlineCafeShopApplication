package com.cafeapp.enums.menus;

import com.cafeapp.enums.DrinkType;

import java.util.Arrays;
import java.util.Optional;

public enum Choice {

    YES(1, "Yes"),
    NO(2, "No");

    private final int code;
    private final String label;

    Choice(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int getCode() {
        return code;
    }
    public static Optional<Choice> fromCode(int code) {
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
