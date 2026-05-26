package com.cafeapp.ui;

import com.cafeapp.enums.DrinkSize;
import com.cafeapp.enums.DrinkType;
import com.cafeapp.enums.ToppingType;
import com.cafeapp.models.Drink;
import com.cafeapp.utils.InputHelper;

import java.util.ArrayList;

public class DrinkBuilderScreen {

    private static final ArrayList<ToppingType> toppings = new ArrayList<>();

    public static void addDrinkUI(){
        DrinkSize size = drinkSizeDisplay();
        DrinkType type = drinkTypeDisplay();
        toppingType();
        Drink newDrink = new Drink(size,type, toppings);
        System.out.println(newDrink);
    }

    public static void drinkSizeUI(){
        for(DrinkSize option : DrinkSize.values()){
            System.out.printf("%-1d ) %s%n", option.getCode(), option.getLabel());
        }
        System.out.println();
    }

    public static DrinkSize drinkSizeDisplay(){
        System.out.println("Select your drink size: ");
        DrinkSize selectedChoice;
        while (true){
            drinkSizeUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = DrinkSize.fromCode(choice).orElse(null);
            selectedChoice = drinkSizeOptions(selectedChoice);
            if (selectedChoice != null) {
                return selectedChoice;
            }
            System.out.println("Invalid choice, try again.");
        }
    }

    public static DrinkSize drinkSizeOptions(DrinkSize choice){
        if(choice == null){
            System.out.println("Invalid Option. Please try again.");
            return null;
        }
        return switch (choice) {
            case SMALL -> DrinkSize.SMALL;
            case MEDIUM -> DrinkSize.MEDIUM;
            case LARGE -> DrinkSize.LARGE;
        };
    }

    public static void drinkTypeUI(){
        for(DrinkType option : DrinkType.values()){
            System.out.printf("%-1d ) %s%n", option.getCode(), option.getLabel());
        }
        System.out.println();
    }

    public static DrinkType drinkTypeDisplay(){
        System.out.println("Select your drink type: ");
        DrinkType selectedChoice;
        while (true){
            drinkTypeUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = DrinkType.fromCode(choice).orElse(null);
            selectedChoice = drinkTypeOptions(selectedChoice);
            if (selectedChoice != null) {
                return selectedChoice;
            }
            System.out.println("Invalid choice, try again.");
        }
    }

    public static DrinkType drinkTypeOptions(DrinkType choice){
        if(choice == null){
            System.out.println("Invalid Option. Please try again.");
            return null;
        }
        return switch (choice) {
            case LATTE -> DrinkType.LATTE;
            case ESPRESSO -> DrinkType.ESPRESSO;
            case BLACK_TEA -> DrinkType.BLACK_TEA;
            case GREEN_TEA -> DrinkType.GREEN_TEA;
        };
    }

    public static void chooseToppingTypeUI(){
        System.out.println("Choose which premium, booster, or regular topping you'd like to add.\n" +
                "1) Premium\n" +
                "2) Regular\n" +
                "3) Booster");
    }

    public static void toppingType(){

        while (true){
            chooseToppingTypeUI();
            String selectedChoice = InputHelper.readStringInput("Enter in the number of your choice:");
            switch(selectedChoice.trim()) {
                case "1":
                    premiumToppings();
                    break;
                case "2":
                    regularToppings();
                    break;
                case "3":
                    boosterToppings();
                    break;
            }
            System.out.println("Add more toppings?");
            int choice = InputHelper.choice().getCode();
            if (choice == 2){
                return;
            }
        }
    }
    public static void premiumToppingUI(){
        for(ToppingType option : ToppingType.values()){
            if (option.getType().equals("Premium")){
                System.out.printf("%-1d ) %s%n", option.getCode(), option.getLabel());
            }
        }
        System.out.println("0) Finish");
        System.out.println();
    }

    public static void premiumToppings(){

        while(true){
            premiumToppingUI();
            String selectedChoice = InputHelper.readStringInput("Enter the number of one of the following toppings: ");

            switch(selectedChoice.trim()){
                case "1":
                    toppings.add(ToppingType.BOBA_PEARLS);
                    break;
                case "2":
                    toppings.add(ToppingType.CHEESE_FOAM);
                    break;
                case "3":
                    toppings.add(ToppingType.MATCHA_FOAM);
                    break;
                case "4":
                    toppings.add(ToppingType.OREO_COOKIE_CRUMBLE);
                    break;
                case "0":
                    System.out.println("Returning to previous menu");
                    return;
            }
        }
    }

    public static void regularToppingUI(){
        for(ToppingType option : ToppingType.values()){
            if (option.getType().equals("Regular")){
                System.out.printf("%-1d ) %s%n", option.getCode(), option.getLabel());
            }
        }
        System.out.println("0) Finish");
        System.out.println();
    }

    public static void regularToppings(){

        while(true){
            regularToppingUI();
            String selectedChoice = InputHelper.readStringInput("Enter the number of one of the following toppings: ");

            switch(selectedChoice.trim()){
                case "1":
                    toppings.add(ToppingType.VANILLA_SYRUP);
                    break;
                case "2":
                    toppings.add(ToppingType.HAZELNUT_SYRUP);
                    break;
                case "3":
                    toppings.add(ToppingType.BROWN_SUGAR_SYRUP);
                    break;
                case "4":
                    toppings.add(ToppingType.LAVENDER_SYRUP);
                    break;
                case "5":
                    toppings.add(ToppingType.CARAMEL_SYRUP);
                    break;
                case "6":
                    toppings.add(ToppingType.PEPPERMINT_SYRUP);
                    break;
                case "7":
                    toppings.add(ToppingType.CINNAMON_POWDER);
                    break;
                case "8":
                    toppings.add(ToppingType.COCOA_POWDER);
                    break;
                case "9":
                    toppings.add(ToppingType.NUTMEG);
                    break;
                case "0":
                    System.out.println("Returning to previous menu");
                    return;
            }
        }
    }
    public static void boosterToppingUI(){
        for(ToppingType option : ToppingType.values()){
            if (option.getType().equals("Booster")){
                System.out.printf("%-1d ) %s%n", option.getCode(), option.getLabel());
            }
        }
        System.out.println("0) Finish");
        System.out.println();
    }

    public static void boosterToppings(){

        while(true){
            boosterToppingUI();
            String selectedChoice = InputHelper.readStringInput("Enter the number of one of the following toppings: ");

            switch(selectedChoice.trim()){
                case "1":
                    toppings.add(ToppingType.EXTRA_ESPRESSO_SHOT);
                    break;
                case "2":
                    toppings.add(ToppingType.ENERGY_BOOST_SYRUP);
                    break;
                case "3":
                    toppings.add(ToppingType.BLONDE_ESPRESSO_SHOT);
                    break;
                case "4":
                    toppings.add(ToppingType.NITRO_SHOT);
                    break;
                case "5":
                    toppings.add(ToppingType.PROTEIN_FOAM);
                    break;
                case "6":
                    toppings.add(ToppingType.COLLAGEN_ADD_IN);
                    break;
                case "0":
                    System.out.println("Returning to previous menu");
                    return;
            }
        }
    }

    public static void addSignatureDrink(){
        System.out.println("add sig");
    }
    public static void addSide(){
        System.out.println("add side");
    }
    public static ArrayList<ToppingType> getToppings(){
        return toppings;
    }
}
