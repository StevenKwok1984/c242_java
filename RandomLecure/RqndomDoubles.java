package RandomLecure;

import java.util.Random;

public class RqndomDoubles {
    public static void main(String[] args) {
        Random rng = new Random();

        // this will generate a random double value from 0.0 (inclusive)
        // to 1.0 (exclusive)

        /*
        double randomValue = rng.nextDouble();
        // Here we use the less-than operator for a more
        // intuitive approach to our 50% probability.
        // If we had an unfair coin with only a 20% chance
        // of coming up heads, we'd want to use the value 0.2
        // and less-than rather than 0.8 and greater-than.

        boolean coinIsHeads = randomValue < 0.5;
         */

        // original method: customize interval value
        // max is 13.2
        // min is -7.5
        // double desiredOutput = rng.nextDouble() * (13.2 - -7.5) + -7.5;

        // easy-to-understand method
        double min = -7.5;
        double max = 13.2;

        double range = max - min;

        double zeroToOne = rng.nextDouble();

        double stepOne = zeroToOne * range;
        double stepTwo = stepOne + min;

        System.out.println(stepTwo);

    }
}
