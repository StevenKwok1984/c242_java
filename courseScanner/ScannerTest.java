package courseScanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String name;
        int age;
        int numComputers;
        String hometown;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = sc.nextLine();
        System.out.println("Please enter your age:");
        age = sc.nextInt();
        System.out.println("Enter number of computers:");
        numComputers = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your hometown: ");
        hometown = sc.nextLine();


        System.out.println("You said: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Num Computers: " + numComputers);
        System.out.println("Hometown: " + hometown);
    }
}
