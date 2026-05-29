package com.cafeapp.utils;

public class UIHelper {
    private static final String BORDER = "========================================";
    private static final String DIVIDER = "----------------------------------------";

    public static void printHeader(String title) {
        printHeader(title, "");
    }

    public static void printHeader(String title, String flavorText) {
        System.out.println("\n" + BORDER);
        System.out.println("   🌙 " + title + " ☕");
        if(flavorText != null && !flavorText.isEmpty()){
            System.out.println("✨ " + flavorText + " ✨");
        }
        System.out.println(BORDER + "\n");
    }

    public static void printDivider() {
        System.out.println(DIVIDER);
    }
    public static void printBorder(){
        System.out.println(BORDER);
    }

    public static void printPrompt(String message) {
        System.out.print("👉 " + message);
    }

    public static void printError(String message) {
        System.out.println("⚠ " + message + "\n");
    }

    public static void printSuccess(String message) {
        System.out.println("✔ " + message + "\n");
    }

    public static void printMenuTitle(String title) {
        System.out.println("🌌 " + title);
        System.out.println(DIVIDER);
    }
}
