package com.cafeapp.services;

import com.cafeapp.enums.side.SideCategory;
import com.cafeapp.enums.side.SideType;
import com.cafeapp.enums.menus.SideMenuOption;
import com.cafeapp.models.Side;
import com.cafeapp.ui.OrderScreen;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;
import com.cafeapp.utils.UIHelper;

import java.util.ArrayList;

public class SideService {

    private static final ArrayList<SideType> sideTypes = new ArrayList<>();
    // array storing all user selected sides
    public static void addSideUI(){
        sideMainMenuDisplay();
        for (SideType sideType : sideTypes) {
            // loops through available sides
            Side newSide = new com.cafeapp.models.Side(sideType.getLabel(), sideType.getCategory().getPrice(), sideType.getCategory());
            // loops through all of user's selected sides and creates new side objects
            OrderScreen.getOrder().addItem(newSide);
        }
    }

    public static void getSideMainMenuOptionsUI(){
        ListUtils.genericMenuDisplay(SideMenuOption.values());
        // lists all side main menu options and values
        System.out.println();
    }

    public static void sideMainMenuDisplay(){
        SideMenuOption selectedChoice;
        // stores user's choice
        while (true){
            getSideMainMenuOptionsUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = SideMenuOption.fromCode(choice).orElse(null);
            // validates whether the inputted choice exists, if not returns null
            if (selectedChoice != null){
                sideMainMenuOptions(selectedChoice);
                return;
            }
            UIHelper.printError("Invalid Option. Please try again.");
        }
    }

    public static void sideMainMenuOptions(SideMenuOption choice){
        // used for clarity of other developers
        switch (choice){
            case COMPLIMENTARY_SIDES -> complimentarySides();
            case MAINS -> mainSidesDisplay();
            case EXIT -> {
                System.out.println("returning to previous menu");
            }
        }
    }

    public static void sidesUI(SideCategory sideCategory){
        for(SideType option : SideType.values()){
            if (option.getCategory() == sideCategory){
                // cycles through sides based on inputted category
                System.out.printf("   %d) %s - $%.2f%n",
                        option.getCode(),
                        option.getLabel(),
                        option.getCategory().getPrice()
                );
                System.out.println("      ✨ " + option.getDescription());
                // prints all sides and their descriptions
                System.out.println();

            }
        }
        System.out.println("0) Finish");
        System.out.println();
    }

    public static void complimentarySides(){
        // lets user pick through complimentary side options
        while (true){
            SideCategory complimentarySides = SideCategory.COMPLIMENTARY;
            sidesUI(complimentarySides);
            int selectedChoice = InputHelper.readIntInput("Select a side: ");

            switch(selectedChoice){
                case 1:
                    sideTypes.add(SideType.ORBIT_MACARON);
                    break;
                case 2:
                    sideTypes.add(SideType.GALAXY_CAKE_POP);
                    break;
                case 0:
                    UIHelper.printSuccess("Returning to previous menu");
                    return;
                default:
                    UIHelper.printError("Invalid Option. Please try again.");
            }
        }
    }

    public static void mainSidesDisplay(){
        // allows user to pick through main sides
        while (true){
            SideCategory mainSides = SideCategory.MAIN;
            sidesUI(mainSides);
            int selectedChoice = InputHelper.readIntInput("Select a side: ");

            switch(selectedChoice){
                case 1:
                    sideTypes.add(SideType.ECLIPSE_LAVA_CAKE);
                    break;
                case 2:
                    sideTypes.add(SideType.GALAXY_TIRAMISU);
                    break;
                case 3:
                    sideTypes.add(SideType.LUNAR_CHEESECAKE_SLICE);
                    break;
                case 4:
                    sideTypes.add(SideType.MILKY_WAY_PARFAIT);
                    break;
                case 5:
                    sideTypes.add(SideType.METEORITE_BROWNIE);
                    break;
                case 6:
                    sideTypes.add(SideType.COSMIC_CINNAMON_ROLL);
                    break;
                case 7:
                    sideTypes.add(SideType.STARFALL_SCONE);
                    break;
                case 8:
                    sideTypes.add(SideType.CRESCENT_MOON_CROISSANT);
                    break;
                case 9:
                    sideTypes.add(SideType.LUNAR_BLUEBERRY_MUFFIN);
                    break;
                case 0:
                    System.out.println("Returning to previous menu");
                    return;
                default:
                    UIHelper.printError("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
