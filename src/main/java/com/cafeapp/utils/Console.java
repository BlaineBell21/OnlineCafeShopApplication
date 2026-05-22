package com.cafeapp.utils;

import com.cafeapp.enums.menus.MainMenuOption;

public class Console {
    public static boolean invalidOption(MainMenuOption choice){
        if(choice == null){
            System.out.println("Invalid Option. Please try again.");
            return true;
        }
        return false;
    }
}
