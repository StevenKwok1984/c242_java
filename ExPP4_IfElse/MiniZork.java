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
            System.out.println("With a nice TV, a sofa, and a doubtful door.");
            System.out.println("You take a nap on the sofa.");
            System.out.println("You hear a weird noise");
            System.out.print("ignore it, or open the doubtful door?");

            action = userInput.nextLine();
            if (action.equals("ignore it")) {
                System.out.println("The noise come closer.");
                System.out.println("You feel scared.");
                // choice
                System.out.print("still ignore it, or open your eyes?");

                action = userInput.nextLine();
                if (action.equals("still ignore it")) {
                    System.out.println("You are no awareness of dangerous.");
                    System.out.println("You feel being pulled out of your bed.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("open your eyes")) {
                    System.out.println("You see the monster close to you.");
                    System.out.println("You run away from your sofa to the field");
                    System.out.println("You run away screaming across the house - looking very foolish");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("open the doubtful door")) {
                System.out.println("You saw a tunnel, seems going to somewhere.");
                System.out.println("You are passing through the tunnel.");
                System.out.println("You heard a voice coming behind you.");
                System.out.print("You keep running");

                // in Doctor Strange's centre
                System.out.println("You saw a beautiful, historical and mystery place");
                System.out.println("It seems a magical place.");
                System.out.println("Suddenly, you saw Doctor Strange.");
                System.out.println("He asked where are you from.");
                System.out.print("tell him the truth, or being evasive?");

                // choice
                action = userInput.nextLine();
                if (action.equals("tell him the truth")) {
                    System.out.println("Doctor Strange know all the details.");
                    System.out.println("He prepared well for the monster.");
                    System.out.println("He also hide you in a safe place.");
                    System.out.println("When the grue come, he kills the grue in a second.");
                    System.out.println("You thanks for his help.");
                    System.out.println("He sent you back to your house.");
                    System.out.println("You are alive, and have a good sleep.");
                } else if (action.equals("being evasive")) {
                    System.out.println("Doctor Strange not trust you.");
                    System.out.println("He want to send you back.");
                    System.out.println("When making the spell, a grue rush into the centre.");
                    System.out.println("It skills all of you.");
                }
            }
        }
    }
}
