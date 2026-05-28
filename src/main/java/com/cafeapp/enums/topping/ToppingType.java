package com.cafeapp.enums.topping;

import com.cafeapp.interfaces.Displayable;

public enum ToppingType implements Displayable {

    EXTRA_ESPRESSO_SHOT(1,"Extra Espresso Shot", ToppingCategory.BOOSTER),
    ENERGY_BOOST_SYRUP(2,"Energy Boost Syrup", ToppingCategory.BOOSTER),
    BLONDE_ESPRESSO_SHOT(3,"Blonde Espresso Shot", ToppingCategory.BOOSTER),
    NITRO_SHOT(4,"Nitro Shot", ToppingCategory.BOOSTER),
    PROTEIN_FOAM(5,"Protein Foam", ToppingCategory.BOOSTER),
    COLLAGEN_ADD_IN(6,"Collagen Add-in", ToppingCategory.BOOSTER),

    BOBA_PEARLS(1,"Boba Pearls",ToppingCategory.PREMIUM),
    CHEESE_FOAM(2,"Cheese Foam", ToppingCategory.PREMIUM),
    MATCHA_FOAM(3,"Matcha Foam", ToppingCategory.PREMIUM),
    OREO_COOKIE_CRUMBLE(4,"Oreo Cookie Crumble", ToppingCategory.PREMIUM),

    VANILLA_SYRUP(1,"Vanilla Syrup", ToppingCategory.REGULAR),
    HAZELNUT_SYRUP(2,"Hazelnut Syrup", ToppingCategory.REGULAR),
    BROWN_SUGAR_SYRUP(3,"Brown Sugar Syrup", ToppingCategory.REGULAR),
    LAVENDER_SYRUP(4,"Lavender Syrup", ToppingCategory.REGULAR),
    CARAMEL_SYRUP(5,"Caramel Syrup", ToppingCategory.REGULAR),
    PEPPERMINT_SYRUP(6,"Peppermint Syrup", ToppingCategory.REGULAR),
    CINNAMON_POWDER(7,"Cinnamon Powder", ToppingCategory.REGULAR),
    COCOA_POWDER(8,"Cocoa Powder", ToppingCategory.REGULAR),
    NUTMEG(9,"Nutmeg", ToppingCategory.REGULAR);

    private final int code;
    private final String label;
    private final ToppingCategory category;

    ToppingType(int code, String label, ToppingCategory category) {
        this.code = code;
        this.category = category;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public ToppingCategory getCategory() {
        return category;
    }
}
