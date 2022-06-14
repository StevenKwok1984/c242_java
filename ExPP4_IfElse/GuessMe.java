package ExPP4_IfElse;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        // my choice
        int answer = 11;

        // Start guessing
        Scanner sc = new Scanner(System.in);
        System.out.println("I've chosen a number. Betcha can't guess it!");


        // User guess
        System.out.println("Your guess: ");
        String stringGuessNumber = sc.nextLine();
        int guessNumber = Integer.parseInt(stringGuessNumber);

        // Comparing guess
        if (guessNumber == answer) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (guessNumber < answer) {
            System.out.println( "Ha, nice try - too low! I chose "+ answer +".");
        } else if (guessNumber > answer) {
            System.out.println("Too bad, way too high. I chose " + answer + ".");
        }

    }
}
