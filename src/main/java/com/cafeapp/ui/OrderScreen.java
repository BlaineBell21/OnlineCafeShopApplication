package com.cafeapp.ui;

import com.cafeapp.enums.menus.OrderScreenOption;
import com.cafeapp.models.Order;
import com.cafeapp.services.DrinkBuilderService;
import com.cafeapp.services.SideService;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;
import com.cafeapp.utils.UIHelper;


public class OrderScreen {
    private static Order currentOrder;
    // created a main order object to store user's items in

    private static void orderScreenUI(){
        UIHelper.printHeader("CURRENT ORDER", "Build your cosmic creation");

        if (currentOrder == null || currentOrder.isEmpty()) {
            System.out.println("✨ Your order is currently empty.");
        } else {
            System.out.println("✨ Items in your order:");
            currentOrder.displayOrder();
        }

        UIHelper.printDivider();

        UIHelper.printHeader("ORDER OPTIONS");
        ListUtils.genericMenuDisplay(OrderScreenOption.values());

        System.out.println();
    }

    public static void orderScreenDisplay(){
        // creates new order
        currentOrder = new Order();
        OrderScreenOption selectedChoice;
        //stores user's choice
        do{
           orderScreenUI();
           int choice = InputHelper.readIntInput("Enter your choice: ");
           selectedChoice = OrderScreenOption.fromCode(choice).orElse(null);
           //checks if user's choice is a valid input in the OrderScreenOption enum otherwise returns null
           handleOrderScreenChoice(selectedChoice);
           //takes user's input to order screen options
        }while (selectedChoice != OrderScreenOption.CANCEL_ORDER);
        // loop continues as long as user doesn't cancel order
        System.out.println("Returning to main menu.");
    }

    private static void handleOrderScreenChoice(OrderScreenOption choice){
        if(choice == null){
            // if choice is null, says input is invalid and returns to previous screen
          UIHelper.printError("Invalid Option. Please try again.");
            return;
        }
        switch(choice) {
            case ADD_DRINK:
                // takes user to menu to add a drink to their order
               DrinkBuilderService.addDrinkUI();
                UIHelper.printSuccess("Drink added to your order ✨");
                break;
            case ADD_SIDE:
                // takes user to menu to add sides to their order
                SideService.addSideUI();
                UIHelper.printSuccess("Side added to your order ✨");
                break;
            case CHECKOUT:
                //takes user to check out to finalize and confirm order
                CheckoutScreen.confirmOrderDisplay();
                break;
            case CANCEL_ORDER:
                CheckoutScreen.clearOrder();
                UIHelper.printSuccess("Order cleared ✨");
                break;
        }
    }

    public static Order getOrder(){
        // getter to pass around order object
        return currentOrder;
    }
}

