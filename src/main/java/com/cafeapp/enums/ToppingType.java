package com.cafeapp.enums;

import java.util.Arrays;
import java.util.Optional;

public enum ToppingType {

    EXTRA_ESPRESSO_SHOT(1,"Extra Espresso Shot", "Booster"),
    ENERGY_BOOST_SYRUP(2,"Energy Boost Syrup", "Booster"),
    BLONDE_ESPRESSO_SHOT(3,"Blonde Espresso Shot", "Booster"),
    NITRO_SHOT(4,"Nitro Shot", "Booster"),
    PROTEIN_FOAM(5,"Protein Foam", "Booster"),
    COLLAGEN_ADD_IN(6,"Collagen Add-in", "Booster"),

    BOBA_PEARLS(1,"Boba Pearls", "Premium"),
    CHEESE_FOAM(2,"Cheese Foam", "Premium"),
    MATCHA_FOAM(3,"Matcha Foam", "Premium"),
    OREO_COOKIE_CRUMBLE(4,"Oreo Cookie Crumble", "Premium"),

    VANILLA_SYRUP(1,"Vanilla Syrup", "Regular"),
    HAZELNUT_SYRUP(2,"Hazelnut Syrup", "Regular"),
    BROWN_SUGAR_SYRUP(3,"Brown Sugar Syrup", "Regular"),
    LAVENDER_SYRUP(4,"Lavender Syrup", "Regular"),
    CARAMEL_SYRUP(5,"Caramel Syrup", "Regular"),
    PEPPERMINT_SYRUP(6,"Peppermint Syrup", "Regular"),
    CINNAMON_POWDER(7,"Cinnamon Powder", "Regular"),
    COCOA_POWDER(8,"Cocoa Powder", "Regular"),
    NUTMEG(9,"Nutmeg", "Regular");

    private final int code;
    private final String label;
    private final String type;


    ToppingType(int code, String label, String type) {
        this.code = code;
        this.type = type;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public static Optional<ToppingType> fromCode(int code, String label) {
        return Arrays.stream(values())
                .filter(option -> option.label.equals("Premium"))
                .findFirst();
    }
}
