package com.cafeapp.models;

import com.cafeapp.enums.side.SideCategory;


public class Side extends MenuItem{

    private final SideCategory category;

    public Side(String itemLabel, double basePrice, SideCategory category) {
        super(itemLabel, basePrice);
        this.category = category;
    }

    @Override
    double calculatePrice() {
        return category.getPrice();
    }

    public SideCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {

        return String.format(
                """
                --------------------------------
                Side: %s
                Price: $%.2f
                --------------------------------
                """,
                getItemLabel(),
                getBasePrice()
        );
    }
}
