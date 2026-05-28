package com.cafeapp.ui;

import com.cafeapp.enums.menus.Choice;
import com.cafeapp.models.Order;
import com.cafeapp.utils.ListUtils;

public class CheckoutScreen {
    public static void checkout(){
        Order items = OrderScreen.getOrder();
        System.out.println("Order Total: $" + items.calculateTotalPrice());
        items.clearOrder();

    }
    public static void displayDrinkInformation(){

    }

    public static void displaySideInformation(){

    }

    public static void displayOrderTotal(){

    }

    public static void editOrder(){

    }

    public static void confirmOrderUI(){
        ListUtils.genericMenuDisplay(Choice.values());
        System.out.println();
    }

//    public static void confirmOrder(){
//        confirmOrderUI();
//        do{
//
//        } while () {
//
//        }
//    }
}
