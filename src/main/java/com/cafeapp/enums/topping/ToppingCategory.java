package com.cafeapp.enums.topping;

public enum ToppingCategory {
    /*premium toppings & xtra cheese
   small: .75$ base, .30 xtra
   medmium: 1.50$ base, .60 xtra
   large: 2.25$ base, .90 xtra
    */
    PREMIUM(.75,1.50, 2.25, .30, .60, .90),
    //regular toppings included with base drink price
    REGULAR(0,0, 0, 0, 0, 0),
    /*meats & xtra meats
    small: 1$ base, .50 extra
    medium: 2$ base, 1.00 extra
    large: 3$ base, 1.50 extra
     */
    BOOSTER(1,2, 3, .50, 1, 1.50);

    private final double smallBasePrice;
    private final double mediumBasePrice;
    private final double largeBasePrice;
    private final double smallExtraPrice;
    private final double mediumExtraPrice;
    private final double largeExtraPrice;

    ToppingCategory(double smallBasePrice, double mediumBasePrice, double largeBasePrice, double smallExtraPrice, double mediumExtraPrice, double largeExtraPrice) {
        this.smallBasePrice = smallBasePrice;
        this.mediumBasePrice = mediumBasePrice;
        this.largeBasePrice = largeBasePrice;
        this.smallExtraPrice = smallExtraPrice;
        this.mediumExtraPrice = mediumExtraPrice;
        this.largeExtraPrice = largeExtraPrice;
    }

    public double getSmallBasePrice() {
        return smallBasePrice;
    }

    public double getMediumBasePrice() {
        return mediumBasePrice;
    }

    public double getLargeBasePrice() {
        return largeBasePrice;
    }

    public double getSmallExtraPrice() {
        return smallExtraPrice;
    }

    public double getMediumExtraPrice() {
        return mediumExtraPrice;
    }

    public double getLargeExtraPrice() {
        return largeExtraPrice;
    }
}
