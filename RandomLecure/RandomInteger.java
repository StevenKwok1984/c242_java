package RandomLecure;

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        Random rng = new Random();
        // generate 10 numbers, each between 0 and 9
        for (int i=0; i<=10; i++) {
            int randomNumber = rng.nextInt(10) + 1;
            System.out.println(randomNumber);
        }

        // Select randomly of array
        String[] names = new String[] {"Alice", "Bob", "Clarice", "David", "Elizabeth"};
        int randomIndex = rng.nextInt(names.length);
        String randomName = names[randomIndex];
        System.out.println(randomName);

    }
}
