package com.cafeapp.ui;

import com.cafeapp.enums.menus.MainMenuOption;
import com.cafeapp.utils.InputHelper;


public class HomeScreen {
    public static void welcomeScreen(){
        System.out.println("welcome to moon beam cafe");
    }

    public static void homeScreenUI(){
        for(MainMenuOption option : MainMenuOption.values()){
            System.out.printf("%-3d) - %s%n", option.getCode(), option.getLabel());
        }
        System.out.println();
    }

    public static void homeScreenDisplay(){
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

    public static void homeScreenOptions(MainMenuOption choice){
        if(choice == null){
            System.out.println("Invalid Option. Please try again.");
            return;
        }
        while (true){
            switch (choice){
                case NEW_ORDER ->OrderScreen.orderScreenDisplay();
                //case BROWSE_MENU ->
                case EXIT -> {
                    return;
                }
            }
        }
    }
}
