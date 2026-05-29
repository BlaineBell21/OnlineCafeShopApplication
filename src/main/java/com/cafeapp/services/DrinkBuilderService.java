package com.cafeapp.services;

import com.cafeapp.enums.drink.DrinkSize;
import com.cafeapp.enums.drink.DrinkBase;
import com.cafeapp.enums.drink.DrinkSpecialization;
import com.cafeapp.enums.menus.Choice;
import com.cafeapp.enums.drink.topping.ToppingCategory;
import com.cafeapp.enums.drink.topping.ToppingType;
import com.cafeapp.models.Drink;
import com.cafeapp.ui.OrderScreen;
import com.cafeapp.utils.Color;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;
import com.cafeapp.utils.UIHelper;

import java.util.ArrayList;

public class DrinkBuilderService {

    private static ArrayList<ToppingType> toppings = new ArrayList<>();
    // array that stores user's toppings

    public static void addDrinkUI(){
        UIHelper.printGradientHeader("DRINK LAB", "Craft your celestial beverage");
        DrinkSize size = drinkSizeDisplay();
        DrinkBase type = drinkBaseDisplay();
        toppingType();

        DrinkSpecialization specialization = itemSpecializationDisplay();
        Drink newDrink = new Drink(type.getLabel(),size.getBaseCost(),size,type, toppings, specialization);
        // creates a new drink object that stores the drink label (name),
        // base cost (based on cup size), size of cup, type of drink and an array of toppings
        OrderScreen.getOrder().addItem(newDrink);// adds new drink into order object to be stored for later
    }

    public static void drinkSizeUI(){
        ListUtils.genericMenuDisplay(DrinkSize.values());
        System.out.println();
    }

    public static DrinkSize drinkSizeDisplay(){
        UIHelper.printHeader("STEP 1: SIZE SELECTION");
        UIHelper.printDivider();
        DrinkSize selectedChoice;
        //stores user's choice
        while (true){
            drinkSizeUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = DrinkSize.fromCode(choice).orElse(null);
            //checks if user's choice is a valid input in the DrinkSize enum otherwise returns null
            if (selectedChoice != null) {
                drinkSizeOptions(selectedChoice);
                //takes user's input to drink size options
                return selectedChoice;
            }
            System.out.println("Invalid choice, try again");
        }
    }

    public static void drinkSizeOptions(DrinkSize choice){
        //tells user what size cup was selected
        switch (choice) {
            case SMALL -> {
                System.out.println("Small selected");
            }
            case MEDIUM ->{
                System.out.println("Medium selected");
            }
            case LARGE ->{
                System.out.println("Large selected");
            }
        }
    }

    public static void drinkBaseUI(){
        ListUtils.genericMenuDisplay(DrinkBase.values());
        // prints DrinkBase values
        System.out.println();
    }

    public static DrinkBase drinkBaseDisplay(){
        UIHelper.printHeader("STEP 2: DRINK BASE");
        UIHelper.printDivider();
        DrinkBase selectedChoice;
        //stores user's choice
        while (true){
            drinkBaseUI();
            int choice = InputHelper.readIntInput("Enter your choice: ");
            selectedChoice = DrinkBase.fromCode(choice).orElse(null);
            //checks if user's choice is a valid input in the DrinkBase enum otherwise returns null
            if (selectedChoice != null) {
                drinkBaseOptions(selectedChoice);
                // takes user's input to drink base options
                return selectedChoice;
                // returns selected base
            }
        }
    }

    public static void drinkBaseOptions(DrinkBase choice){
        // tells user what drink base is selected
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
        UIHelper.printHeader("STEP 3: TOPPINGS (COSMIC ADD-ONS)");
        UIHelper.printDivider();
        System.out.println("1) Premium");
        System.out.println("2) Regular");
        System.out.println("3) Booster");
    }

    public static void toppingType(){

        while (true){
            chooseToppingTypeUI();
            int selectedChoice = InputHelper.readIntInput("Enter in the number of your choice:");
            switch(selectedChoice) {
                case 1:
                    premiumToppings();
                    break;
                case 2:
                    regularToppings();
                    break;
                case 3:
                    boosterToppings();
                    break;
                default:
                    UIHelper.printError("Invalid Option. Please try again.");
                    continue;
            }

            while (true) {
                System.out.println("Add more toppings? (1 = Yes, 2 = No)");

                int choice = InputHelper.readIntInput("Enter choice: ");

                if (choice == 2) {
                    return;
                }
                break;
            }
        }
    }
    public static void toppingUI(ToppingCategory category){
        for(ToppingType option : ToppingType.values()){
            if (option.getCategory() == category){
                // loops through premium, regular, or booster toppings based on which is inputted
                System.out.printf("   %d) %s%n", option.getCode(), option.getLabel());
            }
        }
        System.out.println("   0) Finish selection");
        System.out.println();
    }

    public static void premiumToppings(){

        while(true){
            toppingUI(ToppingCategory.PREMIUM);
            //sets topping category to premium to loop through premium toppings in toppingUI
            int selectedChoice = InputHelper.readIntInput("Enter the number of one of the following toppings: ");

            switch(selectedChoice){
                case 1:
                    toppings.add(ToppingType.BOBA_PEARLS);
                    break;
                case 2:
                    toppings.add(ToppingType.CHEESE_FOAM);
                    break;
                case 3:
                    toppings.add(ToppingType.MATCHA_FOAM);
                    break;
                case 4:
                    toppings.add(ToppingType.OREO_COOKIE_CRUMBLE);
                    break;
                case 0:
                    System.out.println("Returning to previous menu");
                    return;
                default:
                    UIHelper.printError("Invalid Option. Please try again.");
            }
        }
    }

    public static void regularToppings(){

        while(true){
            toppingUI(ToppingCategory.REGULAR);
            //sets topping category to regular to loop through regular toppings in toppingUI
            int selectedChoice = InputHelper.readIntInput("Enter the number of one of the following toppings: ");

            switch(selectedChoice){
                case 1:
                    toppings.add(ToppingType.VANILLA_SYRUP);
                    break;
                case 2:
                    toppings.add(ToppingType.HAZELNUT_SYRUP);
                    break;
                case 3:
                    toppings.add(ToppingType.BROWN_SUGAR_SYRUP);
                    break;
                case 4:
                    toppings.add(ToppingType.LAVENDER_SYRUP);
                    break;
                case 5:
                    toppings.add(ToppingType.CARAMEL_SYRUP);
                    break;
                case 6:
                    toppings.add(ToppingType.PEPPERMINT_SYRUP);
                    break;
                case 7:
                    toppings.add(ToppingType.CINNAMON_POWDER);
                    break;
                case 8:
                    toppings.add(ToppingType.COCOA_POWDER);
                    break;
                case 9:
                    toppings.add(ToppingType.NUTMEG);
                    break;
                case 0:
                    System.out.println("Returning to previous menu");
                    return;
                default:
                    UIHelper.printError("Invalid Option. Please try again.");
            }
        }
    }

    public static void boosterToppings(){

        while(true){
            toppingUI(ToppingCategory.BOOSTER);
            //sets topping category to booster to loop through booster toppings in toppingUI
            int selectedChoice = InputHelper.readIntInput("Enter the number of one of the following toppings: ");

            switch(selectedChoice){
                case 1:
                    toppings.add(ToppingType.EXTRA_ESPRESSO_SHOT);
                    break;
                case 2:
                    toppings.add(ToppingType.ENERGY_BOOST_SYRUP);
                    break;
                case 3:
                    toppings.add(ToppingType.BLONDE_ESPRESSO_SHOT);
                    break;
                case 4:
                    toppings.add(ToppingType.NITRO_SHOT);
                    break;
                case 5:
                    toppings.add(ToppingType.PROTEIN_FOAM);
                    break;
                case 6:
                    toppings.add(ToppingType.COLLAGEN_ADD_IN);
                    break;
                case 0:
                    System.out.println("Returning to previous menu");
                    return;
                default:
                    UIHelper.printError("Invalid Option. Please try again.");
            }
        }
    }

    public static void itemSpecializationUI(){
        UIHelper.printHeader("STEP 4: SPECIAL INFUSION");
        UIHelper.printDivider();
        ListUtils.genericMenuDisplay(DrinkSpecialization.values());
        System.out.println();
    }

    public static DrinkSpecialization itemSpecializationDisplay(){
        //allows user to add a set specialization option to drink
        DrinkSpecialization selectedChoice;
        while(true){
            itemSpecializationUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = DrinkSpecialization.fromCode(choice).orElse(null);
            if(selectedChoice != null){
                drinkSpecializationOptions(selectedChoice);

                Choice confirmSpecial;
                System.out.println("Confirm your selection.");
                ListUtils.genericMenuDisplay(Choice.values());
                int selectedSpecial = InputHelper.readIntInput("Enter in the number of your choice: ");
                confirmSpecial = Choice.fromCode(selectedSpecial).orElse(null);

                if (confirmSpecial == Choice.NO) {
                    continue;
                } else if (confirmSpecial == null) {
                    UIHelper.printError("Invalid option. Please try again.");
                    continue;
                }
                return selectedChoice;
            }
        }
    }

    public static void drinkSpecializationOptions(DrinkSpecialization choice){
        // prints specialization options
        UIHelper.printGradientHeader("Drink Specialization", "Cosmic enhancements for your beverage");

        String title = "";
        String description = "";
        String effect = "";

        switch (choice) {
            case NONE -> {
                title = "Standard Preparation";
                description = """
                    Standard drink preparation with no
                    specialty enhancements.
                    """;

                effect = "Balanced • Classic • Smooth";
            }
            case MOON_FOAM -> {
                title = "Moon Foam ☾";
                description = """
                    A smooth layer of flavored cream foam
                    that gives the drink a soft, cloud-like
                    finish inspired by moonlight.
                    """;

                effect = "Creamy • Airy • Sweet";
            }
            case GALAXY_SWIRL -> {
                title = "Galaxy Swirl ✦";
                description = """
                    A vibrant syrup swirl blended throughout
                    the drink to create a colorful cosmic
                    effect with extra sweetness.
                    """;

                effect = "Vibrant • Sweet • Colorful";
            }
            case NITRO_INFUSION -> {
                title = "Nitro Infusion ⚡";
                description = """
                    Infused with nitro for a creamy texture
                    and velvety finish with a subtle
                    sparkling sensation.
                    """;

                effect = "Velvety • Bold • Smooth";
            }
        }
        System.out.println(Color.BOLD + "Selected Specialization:" + Color.RESET);
        System.out.println(Color.CYAN + "➜ " + title + Color.RESET);

        UIHelper.printDivider();

        System.out.println(Color.YELLOW + "Description:" + Color.RESET);
        System.out.println(description);

        UIHelper.printSeparator();

        System.out.println(Color.GREEN + "Flavor Profile:" + Color.RESET);
        System.out.println("✧ " + effect);

        UIHelper.printBorder();
        System.out.println();
    }
}
