package com.cafeapp.ui;

import com.cafeapp.enums.menus.OrderScreenOption;
import com.cafeapp.models.Order;
import com.cafeapp.services.DrinkBuilderService;
import com.cafeapp.services.SideService;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;


public class OrderScreen {
    private static Order currentOrder;

    public static void orderScreen(){
        System.out.println("Options: ");
    }
    public static void orderScreenUI(){
        ListUtils.genericMenuDisplay(OrderScreenOption.values());
        System.out.println();
    }

    public static void orderScreenDisplay(){
        currentOrder = new Order();
        orderScreen();
        OrderScreenOption selectedChoice;
        do{
           orderScreenUI();
           int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
           selectedChoice = OrderScreenOption.fromCode(choice).orElse(null);
           orderScreenOptions(selectedChoice);
        }while (selectedChoice != OrderScreenOption.CANCEL_ORDER);
        System.out.println("Returning to main menu.");
    }

    public static void orderScreenOptions(OrderScreenOption choice){
        if(choice == null){
            System.out.println("Invalid Option. Please try again.");
            return;
        }
        switch(choice) {
            case ADD_ITEM:
               DrinkBuilderService.addDrinkUI();
                break;
            case ADD_SEASONAL_ITEM:
                //DrinkBuilderService.addSignatureDrink();
                break;
            case ADD_SIDE:
                SideService.addSideUI();
                break;
            case CHECKOUT:
                CheckoutScreen.checkout();
                break;
            case CANCEL_ORDER:
        }
    }

    public static Order getOrder(){
        return currentOrder;
    }
}

