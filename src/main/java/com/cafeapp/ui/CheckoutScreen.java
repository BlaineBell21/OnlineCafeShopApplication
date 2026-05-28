package com.cafeapp.ui;

import com.cafeapp.models.Order;

public class CheckoutScreen {
    public static void checkout(){
        Order items = OrderScreen.getOrder();
        System.out.println("Order Total: $" + items.calculateTotalPrice());
        items.clearOrder();

    }
}
