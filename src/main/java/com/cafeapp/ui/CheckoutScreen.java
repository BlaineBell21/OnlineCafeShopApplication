package com.cafeapp.ui;

import com.cafeapp.enums.menus.Choice;
import com.cafeapp.models.Order;
import com.cafeapp.utils.FileUtils;
import com.cafeapp.utils.InputHelper;
import com.cafeapp.utils.ListUtils;

public class CheckoutScreen {
    private static final Order items = OrderScreen.getOrder();

    public static void confirmOrderUI(){
        ListUtils.genericMenuDisplay(Choice.values());
        // lists check out menu options and values
        System.out.println();
    }

    public static void confirmOrderDisplay(){

        Choice selectedChoice;
        // stores user's choice
        do{
            System.out.println("🌙 Confirm your order?");
            items.displayOrder();
            confirmOrderUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = Choice.fromCode(choice).orElse(null);
            // validates whether the inputted choice exists, if not returns null
            if (selectedChoice == null) {
                System.out.println("Invalid option. Please try again.");
                continue;
            }
            if (selectedChoice == Choice.YES){
                if (items.isEmpty() || items.calculateTotalPrice() <= 0){
                    // if cart is empty or total check out price is less than 0
                    // tells user to add drink and/or main dish
                    System.out.println("You must add a drink or side before checkout.");
                    return;
                } else {
                    FileUtils.receiptWriter(items);
                    // writes order to receipt file
                    System.out.println(items);
                    System.out.println("Order confirmed.\n" +
                            "Thank you for shopping at MoonBeam Cafe!");
                    clearOrder();
                    // clears order once confirmed for new orders
                    return;
                }
            }
        } while (selectedChoice != Choice.NO);
        System.out.println("↩ Returning to previous menu...");
    }
    public static void clearOrder(){
        items.clearOrder();
    }
}
