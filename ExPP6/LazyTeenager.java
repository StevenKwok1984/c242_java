package ExPP6;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        Random randomizer = new Random();
        float probability = 0.1f;
        boolean cleanRoom = false;
        int counter = 1;

        do {
            if (counter > 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            System.out.println("Clean your room!! (x"+counter+")");
            cleanRoom = randomizer.nextFloat() <= probability;
            probability += 0.1f;
            counter = counter + 1;
            if (cleanRoom == true) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            }
        } while(cleanRoom==false);

    }
}
