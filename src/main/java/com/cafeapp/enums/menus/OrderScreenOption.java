package com.cafeapp.enums.menus;

import com.cafeapp.interfaces.Displayable;

import java.util.Arrays;
import java.util.Optional;

public enum OrderScreenOption implements Displayable {

    ADD_ITEM(1, "Add Drink"),
    ADD_SEASONAL_DRINK(2, "Add Seasonal items"),
    ADD_SIDE(3, "Add Sides"),
    CHECKOUT(4, "Checkout"),
    VIEW_ORDER(5, "View Order"),
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
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
