package com.cafeapp.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    public static void receiptWriter() throws IOException {


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/receipts"))) {


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
