package com.cafeapp.enums.drink;

import com.cafeapp.interfaces.Displayable;

import java.util.Arrays;
import java.util.Optional;

public enum SeasonalDrink implements Displayable {
    // contains set seasonal drinks
    PUMPKIN_STARDUST_LATTE(1,"Pumpkin Stardust Latte",
            "A warm spiced latte infused with pumpkin puree, cinnamon, and a light vanilla foam topping. " +
                      "Finished with a dusting of \"stardust\" nutmeg for a cozy autumn feel.", "Seasonal"),
    FROSTED_MOONBERRY_ICED_TEA(2,"Frosted Moonberry Iced Tea",
            "A refreshing iced tea blend with blueberry and lavender notes, " +
                      "lightly sweetened and served over ice with a shimmering “frosted” sugar finish.", "Seasonal");


    private final String label;
    private final int code;
    private final String description;
    private final String category;

    SeasonalDrink(int code, String label, String description, String category) {
        this.label = label;
        this.code = code;
        this.description = description;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getLabel() {
        return label;
    }
    public static Optional<SeasonalDrink> fromCode(int code) {
        // takes in int input to check if it is a value that exists in the enums
        return Arrays.stream(values())
                .filter(drink -> drink.code == code)
                .findFirst();
    }
}
