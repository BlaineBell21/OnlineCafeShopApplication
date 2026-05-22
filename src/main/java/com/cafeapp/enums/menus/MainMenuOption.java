package com.cafeapp.enums.menus;

import java.util.Arrays;
import java.util.Optional;

public enum MainMenuOption {
    NEW_ORDER(1, "Place an Order"),
    //BROWSE_MENU(2, "Browse Menu"),
    EXIT(2, "Exit");

    private final String label;
    private final int code;

    MainMenuOption(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int getCode() {
        return code;
    }

    public static Optional<MainMenuOption> fromCode(int code) {
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
