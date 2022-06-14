package ExPP4_IfElse;

import java.util.Scanner;

public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // location
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        // action: open the mailbox
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            // look inside the mailbox
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("It is not a wise choice to put your hand in an unknown place.");
                System.out.println("Your hands was caught.");
                System.out.println("Your whole body was pulling inside the mailbox.");
                System.out.println("You've been eaten by a grue.");
            }
          // In the house
        } else if (action.equals("go to the house")) {
            System.out.println("You are standing in a living room of the house.");
            System.out.println("With a nice TV, a sofa, and a security path to a mystery place.");
            System.out.println("You take a nap on the sofa.");
            System.out.println("You hear a weird noise");
            System.out.print("Ignore it, or enter the security path?");

            action = userInput.nextLine();
            if (action.equals("Ignore it")) {
                System.out.println(" ");
            }
        }
    }
}
