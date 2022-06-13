package courseScanner;

import java.util.Scanner;

public class checkCondition1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter some data: ");

            String input = myScanner.nextLine();

            if (input == null || input.isEmpty()) {
                // User hit enter without any data. Display error message then back to top of loop
                System.out.println("You did not enter anything!");
            } else {
                // User
                // entered something, leave the loop
                break;
            }
        }
    }
}