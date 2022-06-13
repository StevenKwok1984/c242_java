package courseScanner;
import java.util.Scanner;

public class checkCondition2 {

    public static void main(String[] args) {
        boolean isValid = false;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Enter some data: ");
            String input = myScanner.nextLine();

            if(input == null || input.isEmpty()) {
                System.out.println("You did not enter anything!");
            } else {
                isValid = true;
            }

        } while(!isValid);
    }
}
