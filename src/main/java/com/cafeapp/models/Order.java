package com.cafeapp.models;

import java.util.ArrayList;

public class Order {
    private ArrayList<String> drinks;
    private ArrayList<String> sides;
    private ArrayList<Double> totals;
    private ArrayList<String> receiptInformation;

    public Order(ArrayList<String> drinks, ArrayList<String> sides, ArrayList<Double> totals, ArrayList<String> receiptInformation) {
        this.drinks = drinks;
        this.sides = sides;
        this.totals = totals;
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

    public ArrayList<Double> getTotals() {
        return totals;
    }

    public void setTotals(ArrayList<Double> totals) {
        this.totals = totals;
    }

    public ArrayList<String> getReceiptInformation() {
        return receiptInformation;
    }

    public void setReceiptInformation(ArrayList<String> receiptInformation) {
        this.receiptInformation = receiptInformation;
    }
}
