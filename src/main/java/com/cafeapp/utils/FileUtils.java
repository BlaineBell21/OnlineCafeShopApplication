package com.cafeapp.utils;

import com.cafeapp.models.Order;

import java.io.*;

public class FileUtils {
    public static void receiptWriter(Order order){
        String fileName = DateUtils.currentDateAndTime() + ".txt";
        File folder = new File("src/main/java/data/receipts");
        if(!folder.exists()){
            System.out.println( "Missing directory: "+ folder.getName());
            if (folder.mkdirs()){
                System.out.println("Directories created");
            } else {
                System.out.println("Failed to create receipts folder.");
            }
        }

        File file = new File(folder, fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
           writer.write(order.toString());

        } catch(IOException e){
            throw new RuntimeException("Unable to write to directory.");
        }
        System.out.println("Receipt created");
    }
}
