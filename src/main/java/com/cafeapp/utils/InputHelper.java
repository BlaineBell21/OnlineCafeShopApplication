package com.cafeapp.utils;

import java.util.Scanner;

public class InputHelper {
     private static final Scanner scanner = new Scanner(System.in);

    public static String readStringInput(String prompt){
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()){
                System.out.println("Please enter in valid character input.");
            } else {
                return input;
            }
        }
    }

    public static int readIntInput(String prompt){
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number.");
            }
        }
    }
}
