package courseScanner;

import java.util.Scanner;

public class AdderVersion3 {
    public static void main(String[] args) {
        // declare the number variables and initialize to 0
        int sum = 0;
        int operand1 = 0;
        int operand2 = 0;
        boolean isValid = false;

        // declare and initialize a Scanner object - the Scanner reads
        // input from the console
        Scanner myScanner = new Scanner(System.in);

        // declare and initialize String (text) variables to hold the
        // values that the user types in - the Console only accepts
        // text, it knows nothing about numbers
        String stringOperand1 = "";
        String stringOperand2 = "";

        // ask the user to input the first operand


        do {
            try {
                // input number 1
                System.out.println("Please enter the first number to be added:");
                stringOperand1 = myScanner.nextLine();
                operand1 = Integer.parseInt(stringOperand1);
                if (operand1 >= 1 && operand1 <= 1000) {
                    isValid = true;
                }
            } catch (NumberFormatException ex) {
                // Think of this kind of like an 'else' block for now. This is the code that will run
                // if the user doesn't enter a number.
                System.out.println("Input could not be parsed into an integer");
            }
            isValid = true;
        } while(!isValid);

        do {
            try {
                System.out.println("Please enter the second number to be added:");
                stringOperand2 = myScanner.nextLine();
                operand2 = Integer.parseInt(stringOperand2);
3
                if (operand2 >= 1 && operand2 <= 1000) {
                    isValid = true;
                }
            } catch (NumberFormatException ex) {
                // Think of this kind of like an 'else' block for now. This is the code that will run
                // if the user doesn't enter a number.
                System.out.println("Input could not be parsed into an integer");
            }
        } while(!isValid);

        // assign the sum of operand1 and operand2 to sum
        sum = operand1 + operand2;

        // print the sum to the console
        System.out.println("Sum is: " + sum);
    }
}
