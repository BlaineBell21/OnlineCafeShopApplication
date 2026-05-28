package com.cafeapp.enums.drink;

import com.cafeapp.interfaces.Displayable;

import java.util.Arrays;
import java.util.Optional;

public enum DrinkSpecialization implements Displayable {
    // enum containing drink specialization option values
    NONE(1, "None","Standard drink preparation with no specialty enhancements."),
    MOON_FOAM(2, "Moon Foam","A smooth layer of flavored cream foam that gives the drink a soft, cloud-like finish inspired by moonlight."),
    GALAXY_SWIRL( 3, "Galaxy Swirl","A vibrant syrup swirl blended throughout the drink to create a colorful cosmic effect with extra sweetness."),
    NITRO_INFUSION( 4, "Nitro Infusion","Infused with nitro for a creamy texture and velvety finish with a subtle sparkling sensation.");

    private final int code;
    private final String description;
    private final String label;

    DrinkSpecialization(int code, String label, String description) {
        this.code = code;
        this.description = description;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getLabel() {
        return label;
    }
    public static Optional<DrinkSpecialization> fromCode(int code) {
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
