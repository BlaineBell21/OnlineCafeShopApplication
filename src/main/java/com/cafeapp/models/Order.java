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

    public void removeItem(MenuItem item){
        items.remove(item);
    }

    public void clearOrder(){
        items.clear();
    }

    public void getPrice(){
        for (MenuItem item : items){
            System.out.println(item.getItemLabel() + " " +
                    item.getBasePrice());

        }
    }


    public double calculateTotalPrice(){
        double totalAmountDue = 0;
        for (MenuItem item : items){
            if (item instanceof Drink drink){
                totalAmountDue += drink.calculatePrice();
            }
        }
        for(MenuItem item : items){
            if (item instanceof Side side){
                totalAmountDue += side.calculatePrice();
            }
        }
        return totalAmountDue;
    }

    public void displayOrder(){
        for (MenuItem item : items){
            System.out.println(item.getItemLabel());
        }
    }
}
