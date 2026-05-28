package com.cafeapp.enums.drink;

public enum DrinkSpecialization {
    NONE("None","Standard drink preparation with no specialty enhancements."),
    MOON_FOAM("Moon Foam","A smooth layer of flavored cream foam that gives the drink a soft, cloud-like finish inspired by moonlight."),
    GALAXY_SWIRL( "Galaxy Swirl","A vibrant syrup swirl blended throughout the drink to create a colorful cosmic effect with extra sweetness."),
    NITRO_INFUSION( "Nitro Infusion","Infused with nitro for a creamy texture and velvety finish with a subtle sparkling sensation.");

    private final String description;
    private final String label;

    DrinkSpecialization(String description, String label) {
        this.description = description;
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public String getLabel() {
        return label;
    }
}
