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
        calculateTotalPrice();
    }
    public String toString(){
        StringBuilder receipt = new StringBuilder();

        receipt.append("""
            ==================================
                 🌙 MOONBEAM CAFE RECEIPT
            ==================================
            
            """);
        receipt.append("\u001B[36mITEMS:\u001B[0m\n");
        for(MenuItem item : items) {
            receipt.append("\u001B[33m").append(item).append("\u001B[0m\n\n");
        }
        receipt.append("""
            ----------------------------------
            """);
        receipt.append("\u001B[32mTOTAL:\u001B[0m ");
        receipt.append(
                String.format(
                        "Total: $%.2f%n",
                        calculateTotalPrice()
                )
        );
        receipt.append("""
        ========================================
           ✨ Thank you for visiting MoonBeam ✨
        ========================================
        """);
        return receipt.toString();
    }

    // removed color tags to properly print into txt file
    public String toReceiptString() {
        StringBuilder receipt = new StringBuilder();

        receipt.append("""
        ==================================
             MOONBEAM CAFE RECEIPT
        ==================================

        """);

        receipt.append("ITEMS:\n");

        for (MenuItem item : items) {
            receipt.append(item).append("\n\n");
        }

        receipt.append("""
        ----------------------------------
        """);

        receipt.append(String.format(
                "TOTAL: $%.2f%n",
                calculateTotalPrice()
        ));

        receipt.append("""
        ==================================
           Thank you for visiting MoonBeam
        ==================================
        """);

        return receipt.toString();
    }
}
