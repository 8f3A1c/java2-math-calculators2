package edu.kirkwood.view;

import static edu.kirkwood.view.UIUtility.displayMessage;

public class Messages {

    /**
     * Displays the application's welcome message.
     */
    public static void hello() {
        displayMessage("Welcome to the Kirkwood Calculators Application");
    }

    /**
     * Displays the application's farewell message.
     */
    public static void goodbye() {
        displayMessage("Goodbye");
    }

    /**
     * Displays instructions for using the fraction calculator.
     */
    public static void fractionGreet() {
        displayMessage("Welcome to Marc's Fraction Calculator");
        System.out.println("Enter calculations in the format: [fraction] [operator] [fraction]");
        System.out.println("Example: 1 1/2 + 3/4\n");
    }

    /**
     * Displays the fraction calculator's farewell message.
     */
    public static void fractionGoodbye() {
        displayMessage("Thank you for using Marc's Fraction Calculator");
    }

    /**
     * Displays instructions for using the interest calculator.
     */
    public static void interestGreet() {
        displayMessage("Welcome to Noah's Interest Calculator");
        System.out.println("\nThis program calculates how much interest will be earned from a investment. Pick an investment type:\n");
    }

    /**
     * Displays the interest calculator's farewell message.
     */
    public static void interestGoodbye() {
        displayMessage("Thank you for using Noah's Interest Calculator.");
    }
}
