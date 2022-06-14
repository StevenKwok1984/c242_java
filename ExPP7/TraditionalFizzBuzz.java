package ExPP7;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many units of fizzing and buzzing do you need in your life? ");
        String stringInputLimit = sc.nextLine();
        int inputLimit = Integer.parseInt(stringInputLimit);
        int i = 0;
        int counter = 0;

        while(counter < inputLimit){
            if (i == 0) {
                System.out.println(0);
                i++;
            }
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("fizz buzz");
                counter ++;
                i++;
            } else if (i % 3 ==0) {
                System.out.println("fizz");
                counter ++;
                i++;
            } else if (i % 5 == 0) {
                System.out.println("buzz");
                counter ++;
                i++;
            } else {
                System.out.println(i);
                i++;
            }
        }
        System.out.println("TRADITION!!!!!");

    }
}
