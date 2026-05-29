package com.cafeapp.ui;

import com.cafeapp.enums.menus.MainMenuOption;
import com.cafeapp.enums.menus.MenuUI;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;
import com.cafeapp.utils.UIHelper;

import java.io.IOException;



public class HomeScreen {

    public static void welcomeScreen(){
        UIHelper.printHeader(MenuUI.TITLE.getMenuSection(), MenuUI.MAIN_FLAVOR_TEXT.getMenuSection());
    }

    public static void homeScreenUI(){
        UIHelper.printMenuTitle(MenuUI.MAIN_MENU_TEXT.getMenuSection());
        ListUtils.genericMenuDisplay(MainMenuOption.values());
        // lists all menu option values
        System.out.println();
    }

    public static void homeScreenDisplay() throws IOException {
        MainMenuOption selectedChoice;
        // stores user's choice
        do {
            welcomeScreen();
            homeScreenUI();
            int choice = InputHelper.readIntInput("Enter your choice: ");
            selectedChoice = MainMenuOption.fromCode(choice).orElse(null);
            // validates whether the inputted choice exists, if not returns null
            homeScreenOptions(selectedChoice);
        } while(selectedChoice != MainMenuOption.EXIT);
        // continues to loop until the exit option is selected
        UIHelper.printBorder();
        System.out.println("  Thank you for visiting MoonBeam Cafe 🌙");
        System.out.println("         See you among the stars ✨");
        UIHelper.printBorder();
    }

    public static void homeScreenOptions(MainMenuOption choice) throws IOException {
        if (choice == null) {
            UIHelper.printError(MenuUI.ERROR.getMenuSection());
            return;
        }
        // created for clarity of other developers
        switch (choice){
        case NEW_ORDER:
            OrderScreen.orderScreenDisplay();
            break;
        case EXIT:
        }
    }
}
