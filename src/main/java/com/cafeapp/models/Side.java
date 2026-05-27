package com.cafeapp.models;

public class Side extends MenuItem{

    public Side(String itemLabel, double basePrice) {
        super(itemLabel, basePrice);

    }

    @Override
    public String getItemLabel(){

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
