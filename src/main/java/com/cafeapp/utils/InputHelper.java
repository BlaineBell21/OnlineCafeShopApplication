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
        // method for user to input yes/no
        Choice selectedChoice;
        while (true){
            choiceUI();
            int choice = InputHelper.readIntInput("Enter in the number of your choice: ");
            selectedChoice = Choice.fromCode(choice).orElse(null);
            // validates if user's input is a value that exists
            if (selectedChoice != null) {
                return selectedChoice;
            }
            UIHelper.printError("Invalid option. Please try again.");
        }
    }
    public static int readIntInput(String prompt){
        //used to gather int input
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
