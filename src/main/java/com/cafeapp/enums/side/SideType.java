package com.cafeapp.enums.side;

public enum SideType {
    ORBIT_MACARON(1, "Orbit Macaron", "Colorful assorted macarons inspired by planets.", SideCategory.COMPLIMENTARY),
    GALAXY_CAKE_POP(2, "Galaxy Cake Pop", "Chocolate cake pop coated with star sprinkles.", SideCategory.COMPLIMENTARY),
    STARFALL_SCONE(3, "Starfall Scone", "Vanilla lavender scone with light glaze.", SideCategory.COMPLIMENTARY),
    CRESCENT_MOON_CROISSANT(4, "Crescent Moon Croissant", "Buttery croissant shaped like a crescent moon.", SideCategory.COMPLIMENTARY),
    LUNAR_BLUEBERRY_MUFFIN(5, "Lunar Blueberry Muffin", "Blueberry muffin dusted with powdered sugar \"moon dust\".", SideCategory.COMPLIMENTARY),

    ECLIPSE_LAVA_CAKE(1, "Eclipse Lava Cake", "Warm chocolate lava cake with dark cocoa center and powdered sugar \"stardust\".", SideCategory.MAIN),
    GALAXY_TIRAMISU(2, "Galaxy Tiramisu", "Espresso-soaked layered tiramisu with cocoa powder and whipped cream stars.", SideCategory.MAIN),
    LUNAR_CHEESECAKE_SLICE(3, "Lunar Cheesecake Slice", "Creamy vanilla cheesecake with lavender syrup glaze and cocoa dusting.", SideCategory.MAIN),
    MILKY_WAY_PARFAIT(4, "Milky Way Parfait", "Layered dessert cup with whipped cream, cookie crumble, caramel syrup, and boba pearls.", SideCategory.MAIN),
    METEORITE_BROWNIE(5,"Meteorite Brownie", "Dark chocolate brownie with Oreo crumble topping and caramel drizzle.", SideCategory.MAIN),
    COSMIC_CINNAMON_ROLL(6, "Cosmic Cinnamon Roll", "Large cinnamon roll with caramel drizzle.", SideCategory.MAIN);

    private final int code;
      private final String label;
      private final String description;
      private final SideCategory category;

    SideType(int code, String label, String description, SideCategory category) {
        this.code = code;
        this.label = label;
        this.description = description;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public SideCategory getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

}
