package com.cafeapp.services;

import com.cafeapp.enums.drink.*;
import com.cafeapp.models.SeasonalDrinkModel;
import com.cafeapp.ui.OrderScreen;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;
import com.cafeapp.utils.UIHelper;

public class SeasonalDrinkService {

    public static void seasonalDrinkUI() {
        UIHelper.printGradientHeader("COSMIC SEASONS",  "Exclusive flavors drifting through the galaxy");
        SeasonalDrinkSize size = seasonalDrinkSizeDisplay();
        // retrieves the selected cup size and stores for later use
        SeasonalDrink type = seasonalDrinkOptionDisplay();
        // retrieves the selected type of drink and stores for later
        SeasonalDrinkModel newSeasonalDrink = new SeasonalDrinkModel(type.getLabel(), size.getBaseCost(),size, type);
        //creates new seasonal drink object that stores the label, cost, size, and type of drink
        OrderScreen.getOrder().addItem(newSeasonalDrink);
    }

    public static void seasonalDrinkSizeUI(){
        UIHelper.printHeader("STEP 1: SIZE SELECTION");
        ListUtils.genericMenuDisplay(SeasonalDrinkSize.values());
        System.out.println("0) Return");
        System.out.println();
    }

    public static SeasonalDrinkSize seasonalDrinkSizeDisplay() {
        SeasonalDrinkSize selectedChoice;
        while (true) {
            seasonalDrinkSizeUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = SeasonalDrinkSize.fromCode(choice).orElse(null);
            if(selectedChoice != null){
                seasonalDrinkSizeOptions(selectedChoice);
                return selectedChoice;
            }
        }
    }

    public static void seasonalDrinkSizeOptions(SeasonalDrinkSize choice){
        //tells user what size cup was selected
        switch (choice) {
            case  SEASONAL_SMALL-> {
                System.out.println("Small selected");
            }
            case SEASONAL_MEDIUM ->{
                System.out.println("Medium selected");
            }
            case SEASONAL_LARGE ->{
                System.out.println("Large selected");
            }
        }
    }
    public static void seasonalDrinkTypeUI(){
        UIHelper.printHeader("STEP 2: DRINK SELECTION");
        ListUtils.genericMenuDisplay(SeasonalDrink.values());
        System.out.println("0) Return");
        System.out.println();
    }

    public static SeasonalDrink seasonalDrinkOptionDisplay() {
        SeasonalDrink selectedChoice;
        while (true) {
            seasonalDrinkTypeUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = SeasonalDrink.fromCode(choice).orElse(null);
            if(selectedChoice != null){
                seasonalDrinkOptions(selectedChoice);
                return selectedChoice;
            }
        }
    }
    public static void seasonalDrinkOptions(SeasonalDrink choice){
        switch (choice) {
            case PUMPKIN_STARDUST_LATTE -> {
                System.out.println(SeasonalDrink.PUMPKIN_STARDUST_LATTE.getLabel());
                System.out.println(SeasonalDrink.PUMPKIN_STARDUST_LATTE.getDescription());
            }
            case FROSTED_MOONBERRY_ICED_TEA -> {
                System.out.println(SeasonalDrink.FROSTED_MOONBERRY_ICED_TEA.getLabel());
                System.out.println(SeasonalDrink.FROSTED_MOONBERRY_ICED_TEA.getDescription());
            }
        }
    }
}
