package com.cafeapp.services;

import com.cafeapp.enums.side.SideCategory;
import com.cafeapp.enums.side.SideType;
import com.cafeapp.enums.menus.SideMenuOption;
import com.cafeapp.models.Side;
import com.cafeapp.ui.OrderScreen;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;

import java.util.ArrayList;

public class SideService {

    private static ArrayList<SideType> sideTypes = new ArrayList<>();

    public static void addSideUI(){
        sideMainMenuDisplay();
        for (SideType sideType : sideTypes) {
            Side newSide = new com.cafeapp.models.Side(sideType.getLabel(), sideType.getCategory().getPrice(), sideType.getCategory());
            OrderScreen.getOrder().addItem(newSide);
        }
    }

    public static void getSideMainMenuOptionsUI(){
        ListUtils.genericMenuDisplay(SideMenuOption.values());
        System.out.println();
    }

    public static void sideMainMenuDisplay(){
        SideMenuOption selectedChoice;
        while (true){
            getSideMainMenuOptionsUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = SideMenuOption.fromCode(choice).orElse(null);
            if (selectedChoice != null){
                sideMainMenuOptions(selectedChoice);
                return;
            }
            System.out.println("invalid option try again");
        }
    }

    public static void sideMainMenuOptions(SideMenuOption choice){

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
                System.out.printf("%-1d ) %s - $%.2f%n", option.getCode(), option.getLabel(), option.getCategory().getPrice());
                System.out.println(option.getDescription());
            }
        }
        System.out.println("0) Finish");
        System.out.println();
    }

    public static void complimentarySides(){
        while (true){
            SideCategory complimentarySides = SideCategory.COMPLIMENTARY;
            sidesUI(complimentarySides);
            String selectedChoice = InputHelper.readStringInput("Enter the number of the side you want: ");

            switch(selectedChoice.trim()){
                case "1":
                    sideTypes.add(SideType.ORBIT_MACARON);
                    break;
                case "2":
                    sideTypes.add(SideType.GALAXY_CAKE_POP);
                    break;
                case "3":
                    sideTypes.add(SideType.STARFALL_SCONE);
                    break;
                case "4":
                    sideTypes.add(SideType.CRESCENT_MOON_CROISSANT);
                    break;
                case "5":
                    sideTypes.add(SideType.LUNAR_BLUEBERRY_MUFFIN);
                    break;
                case "0":
                    System.out.println("Returning to previous menu");
                    return;
            }
        }
    }


    public static void mainSidesDisplay(){
        while (true){
            SideCategory mainSides = SideCategory.MAIN;
            sidesUI(mainSides);
            String selectedChoice = InputHelper.readStringInput("Enter the number of the side you want: ");

            switch(selectedChoice){
                case "1":
                    sideTypes.add(SideType.ECLIPSE_LAVA_CAKE);
                    break;
                case "2":
                    sideTypes.add(SideType.GALAXY_TIRAMISU);
                    break;
                case "3":
                    sideTypes.add(SideType.LUNAR_CHEESECAKE_SLICE);
                    break;
                case "4":
                    sideTypes.add(SideType.MILKY_WAY_PARFAIT);
                    break;
                case "5":
                    sideTypes.add(SideType.METEORITE_BROWNIE);
                    break;
                case "6":
                    sideTypes.add(SideType.COSMIC_CINNAMON_ROLL);
                    break;
                case "0":
                    System.out.println("Returning to previous menu");
                    return;
            }
        }
    }
    public static ArrayList<SideType> getSides(){
        return sideTypes;
    }
}
