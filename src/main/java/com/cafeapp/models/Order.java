package com.cafeapp.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order(){
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void clearOrder(){
        items.clear();
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public double calculateTotalPrice(){
        // calculates price of all of user's items in cart
        double totalAmountDue = 0;

        for(MenuItem item : items){
            totalAmountDue += item.calculatePrice();
        }
        return totalAmountDue;
    }
    public void displayOrder(){
        // displays all items in user's cart
        for (MenuItem item : items){
            System.out.println(item);
        }
    }
    public String toString(){
        StringBuilder receipt = new StringBuilder();

        receipt.append("""
            ==================================
                 MOONBEAM CAFE RECEIPT
            ==================================
            
            """);
        for(MenuItem item : items) {
            receipt.append(item);
            receipt.append("\n\n");
        }
        receipt.append("""
            ----------------------------------
            """);
        receipt.append(
                String.format(
                        "Total: $%.2f%n",
                        calculateTotalPrice()
                )
        );
        receipt.append("""
            ==================================
            """);
        return receipt.toString();
    }
}
