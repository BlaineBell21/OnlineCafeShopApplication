package com.cafeapp.models;

import java.util.ArrayList;

public class Receipt {
    private ArrayList<String> receipts;

    public Receipt(ArrayList<String> receipts) {
        this.receipts = receipts;
    }

    public ArrayList<String> getReceipts() {
        return receipts;
    }

    public void setReceipts(ArrayList<String> receipts) {
        this.receipts = receipts;
    }
}
