package ExPP5_Random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {
        // saving an answer from -100 to 100
        Random randomizer = new Random();
        int answer = randomizer.nextInt(200) - 100;
        // prepare to guess
        Scanner sc = new Scanner(System.in);

        // Start guessing
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        System.out.print("Your guess: ");
        String stringGuess = sc.nextLine();
        int guess = Integer.parseInt(stringGuess);
        System.out.println();

        // loop if not correct
        do {
            if (guess < answer) {
                System.out.println("Ha, nice try - too low! Try again!");
                System.out.print("Your guess: ");
                stringGuess = sc.nextLine();
                guess = Integer.parseInt(stringGuess);
                System.out.println();
            } else if (guess > answer) {
                System.out.println("Ha, nice try - too low! Try again!");
                System.out.print("Your guess: ");
                stringGuess = sc.nextLine();
                guess = Integer.parseInt(stringGuess);
                System.out.println();
            }
        } while (guess==answer);

        System.out.println("Wow, nice guess! That was it!");
    }
}
