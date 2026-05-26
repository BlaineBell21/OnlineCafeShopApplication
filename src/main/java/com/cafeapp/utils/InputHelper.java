package com.cafeapp.utils;


import com.cafeapp.enums.menus.Choice;

import java.util.Scanner;

public class InputHelper {
     private static final Scanner scanner = new Scanner(System.in);

    public static void choiceUI(){

        for(Choice option : Choice.values()){
            System.out.printf("%-1d ) %s%n", option.getCode(), option.getLabel());
        }
        System.out.println();
    }

    public static Choice choice(){
        Choice selectedChoice;
        while (true){
            choiceUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = Choice.fromCode(choice).orElse(null);
            if (selectedChoice != null) {
                return selectedChoice;
            }
            invalidInput();
        }
    }

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

    public static void invalidInput(){
        System.out.println("Invalid choice, try again.");
    }
}
