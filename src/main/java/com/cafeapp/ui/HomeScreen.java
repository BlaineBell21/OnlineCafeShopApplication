package com.cafeapp.ui;

import com.cafeapp.enums.menus.MainMenuOption;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;

import java.io.IOException;


public class HomeScreen {
    public static void welcomeScreen(){
        System.out.println("welcome to moon beam cafe");
    }

    public static void homeScreenUI(){
        ListUtils.genericMenuDisplay(MainMenuOption.values());
        System.out.println();
    }

    public static void homeScreenDisplay() throws IOException {
        MainMenuOption selectedChoice;
        do {
            welcomeScreen();
            homeScreenUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = MainMenuOption.fromCode(choice).orElse(null);
            homeScreenOptions(selectedChoice);
        } while(selectedChoice != MainMenuOption.EXIT);
        System.out.println("Thank you for ordering at MoonBeam Cafe");
    }

    public static void homeScreenOptions(MainMenuOption choice) throws IOException {
        if(choice == null){
            InputHelper.invalidInput();
            return;
        }

        switch (choice){
        case NEW_ORDER:
            OrderScreen.orderScreenDisplay();
            break;
        case EXIT:
        }
    }
}
