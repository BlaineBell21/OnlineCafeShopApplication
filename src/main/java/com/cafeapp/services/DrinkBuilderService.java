package com.cafeapp.services;

import com.cafeapp.enums.drink.DrinkSize;
import com.cafeapp.enums.drink.DrinkBase;
import com.cafeapp.enums.topping.ToppingCategory;
import com.cafeapp.enums.topping.ToppingType;
import com.cafeapp.models.Drink;
import com.cafeapp.ui.OrderScreen;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;

import java.util.ArrayList;

public class DrinkBuilderService {

    private static ArrayList<ToppingType> toppings = new ArrayList<>();

    public static void addDrinkUI(){
        DrinkSize size = drinkSizeDisplay();
        DrinkBase type = drinkBaseDisplay();
        toppingType();
        Drink newDrink = new Drink(type.getLabel(),size.getBaseCost(),size,type, toppings);
        OrderScreen.getOrder().addItem(newDrink);
    }

    public static void drinkSizeUI(){
        ListUtils.genericMenuDisplay(DrinkSize.values());
        System.out.println();
    }

    public static DrinkSize drinkSizeDisplay(){
        System.out.println("Select your drink size: ");
        DrinkSize selectedChoice;
        while (true){
            drinkSizeUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = DrinkSize.fromCode(choice).orElse(null);
            if (selectedChoice != null) {
                drinkSizeOptions(selectedChoice);
                return selectedChoice;
            }
            System.out.println("Invalid choice, try again");
        }
    }

    public static void drinkSizeOptions(DrinkSize choice){

        switch (choice) {
            case SMALL -> {
                System.out.println("small selected");
            }
            case MEDIUM ->{
                System.out.println("medium selected");
            }
            case LARGE ->{
            }
        }
    }

    public static void drinkBaseUI(){
        ListUtils.genericMenuDisplay(DrinkBase.values());
        System.out.println();
    }

    public static DrinkBase drinkBaseDisplay(){
        System.out.println("Select your drink base: ");
        DrinkBase selectedChoice;
        while (true){
            drinkBaseUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = DrinkBase.fromCode(choice).orElse(null);
            if (selectedChoice != null) {
                drinkBaseOptions(selectedChoice);
                return selectedChoice;
            }
        }
    }

    public static void drinkBaseOptions(DrinkBase choice){

        switch (choice) {
            case LATTE -> {
                System.out.println("latte selected");
            }
            case ESPRESSO -> {
                System.out.println("espresso selected");
            }
            case BLACK_TEA -> {
                System.out.println("black tea selected");
            }
            case GREEN_TEA -> {
                System.out.println("green tea selected");
            }
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
    public static void toppingUI(ToppingCategory category){
        for(ToppingType option : ToppingType.values()){
            if (option.getCategory() == category){
                System.out.printf("%-1d ) %s%n", option.getCode(), option.getLabel());
            }
        }
        System.out.println("0) Finish");
        System.out.println();
    }

    public static void premiumToppings(){

        while(true){
            ToppingCategory category = ToppingCategory.PREMIUM;
            toppingUI(category);
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

    public static void regularToppings(){

        while(true){
            ToppingCategory category = ToppingCategory.REGULAR;
            toppingUI(category);
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

    public static void boosterToppings(){

        while(true){
            ToppingCategory category = ToppingCategory.BOOSTER;
            toppingUI(category);
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

    public static void itemSpecializationUI(){

    }

    public static void itemSpecializationDisplay(){

    }
}
