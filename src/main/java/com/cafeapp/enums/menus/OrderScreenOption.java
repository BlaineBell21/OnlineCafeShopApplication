package com.cafeapp.enums.menus;

import com.cafeapp.interfaces.Displayable;

import java.util.Arrays;
import java.util.Optional;

public enum OrderScreenOption implements Displayable {
    // enum for order screen option values
    ADD_DRINK(1, "Add Drink"),
    ADD_SEASONAL_ITEM(2, "Add Seasonal item"),
    ADD_SIDE(3, "Add Sides"),
    CHECKOUT(4, "Checkout"),
    CANCEL_ORDER(0, "Cancel Order");

    private final int code;
    private final String label;

    OrderScreenOption(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public static Optional<OrderScreenOption> fromCode(int code) {
        //takes in int input to check if it is a value that exists in the enums
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
