package com.cafeapp.enums.menus;

public enum MenuUI {
    TITLE("MOONBEAM CAFE"),
    MAIN_FLAVOR_TEXT("Where every drink is written in the stars"),
    ERROR("Invalid option. Please try again."),
    MAIN_MENU_TEXT("MAIN MENU");
    private final String menuSection;

    MenuUI(String menuSection) {
        this.menuSection = menuSection;
    }

    public String getMenuSection() {
        return menuSection;
    }
}
