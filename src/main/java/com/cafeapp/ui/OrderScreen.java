package com.cafeapp.ui;

import com.cafeapp.enums.menus.OrderScreenOption;
import com.cafeapp.models.Order;
import com.cafeapp.services.DrinkBuilderService;
import com.cafeapp.services.SideService;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;

import java.io.IOException;


public class OrderScreen {
    private static Order currentOrder;
    // created an order object to store user's items in

    public static void orderScreen(){
        System.out.println("Options: ");
    }
    public static void orderScreenUI(){
        ListUtils.genericMenuDisplay(OrderScreenOption.values());
        // prints options from order screen options
        System.out.println();
    }

    public static void orderScreenDisplay() throws IOException {
        // creates new order
        currentOrder = new Order();
        orderScreen();
        OrderScreenOption selectedChoice;
        //stores user's choice
        do{
           orderScreenUI();
           int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
           selectedChoice = OrderScreenOption.fromCode(choice).orElse(null);
           //checks if user's choice is a valid input in the OrderScreenOption enum otherwise returns null
           orderScreenOptions(selectedChoice);
           //takes user's input to order screen options
        }while (selectedChoice != OrderScreenOption.CANCEL_ORDER);
        // loop continues as long as user doesn't cancel order
        System.out.println("Returning to main menu.");
    }

    public static void orderScreenOptions(OrderScreenOption choice) throws IOException {
        if(choice == null){
            // if choice is null, says input is invalid and returns to previous screen
            System.out.println("Invalid Option. Please try again.");
            return;
        }
        switch(choice) {
            case ADD_DRINK:
                // takes user to menu to add a drink to their order
               DrinkBuilderService.addDrinkUI();
                break;
            case ADD_SEASONAL_ITEM:
                //DrinkBuilderService.addSignatureDrink();
                break;
            case ADD_SIDE:
                // takes user to menu to add sides to their order
                SideService.addSideUI();
                break;
            case CHECKOUT:
                //takes user to checkout to finalize and confirm order
                CheckoutScreen.confirmOrderDisplay();
                break;
            case CANCEL_ORDER:
                CheckoutScreen.clearOrder();
                break;
        }
    }

    public static Order getOrder(){
        // getter to pass around order object
        return currentOrder;
    }
}

