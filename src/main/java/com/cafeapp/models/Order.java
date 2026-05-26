package com.cafeapp.models;

import java.util.ArrayList;

public class Order {
    private ArrayList<String> drinks;
    private ArrayList<String> sides;
    private ArrayList<Double> prices;
    private ArrayList<String> receiptInformation;

    public Order(ArrayList<String> drinks, ArrayList<String> sides, ArrayList<Double> prices, ArrayList<String> receiptInformation) {
        this.drinks = drinks;
        this.sides = sides;
        this.prices = prices;
        this.receiptInformation = receiptInformation;
    }

    public ArrayList<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<String> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<String> getSides() {
        return sides;
    }

    public void setSides(ArrayList<String> sides) {
        this.sides = sides;
    }

    public ArrayList<Double> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<Double> totals) {
        this.prices = totals;
    }

    public ArrayList<String> getReceiptInformation() {
        return receiptInformation;
    }

    public void setReceiptInformation(ArrayList<String> receiptInformation) {
        this.receiptInformation = receiptInformation;
    }
}
