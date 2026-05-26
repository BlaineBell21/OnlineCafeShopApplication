package com.cafeapp.ui;


import com.cafeapp.enums.menus.OrderScreenOption;
import com.cafeapp.models.Drink;
import com.cafeapp.utils.InputHelper;

public class OrderScreen {
    public static void orderScreen(){
        System.out.println("Options: ");
    }
    public static void orderScreenUI(){
        for(OrderScreenOption option : OrderScreenOption.values()){
            System.out.printf("%-3d - %s%n", option.getCode(), option.getLabel());
        }
        System.out.println();
    }

    public static void orderScreenDisplay(){
        System.out.println("order screen");
        orderScreen();
        OrderScreenOption selectedChoice;
        do{
           orderScreenUI();
           int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
           selectedChoice = OrderScreenOption.fromCode(choice).orElse(null);
           orderScreenOptions(selectedChoice);
        }while (selectedChoice != OrderScreenOption.CANCEL_ORDER);
        System.out.println("Canceling Order, returning to main menu.");
    }
    public static void orderScreenOptions(OrderScreenOption choice){
    if(choice == null){
        System.out.println("Invalid Option. Please try again.");
        return;
    }

        while (true){
            switch(choice) {
                case ADD_ITEM:
                    DrinkBuilderScreen.addDrinkUI();
                    return;
                case ADD_SEASONAL_DRINK:
                    DrinkBuilderScreen.addSignatureDrink();
                    return;
                case ADD_SIDE:
                    DrinkBuilderScreen.addSide();
                    return;
                case CHECKOUT:
                    CheckoutScreen.checkout();
                    return;
                case CANCEL_ORDER:
                    DrinkBuilderScreen.getToppings().clear();
                    return;
            }
        }
    }
}

