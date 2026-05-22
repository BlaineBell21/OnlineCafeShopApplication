package com.cafeapp.enums.menus;

import java.util.Arrays;
import java.util.Optional;

public enum OrderScreenOption {

    ADD_ITEM(1, "Add Item"),
    ADD_SIGNATURE_DRINK(2, "Add Signature Drink"),
    ADD_SIDE(3, "Add Side"),
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
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
