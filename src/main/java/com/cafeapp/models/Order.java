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

    public void clearItems(MenuItem item){
        items.clear();
    }

    public void displayOrder(){
        for (MenuItem item : items){
            System.out.println(item);
        }
    }
    public String toString(){

    }
}
