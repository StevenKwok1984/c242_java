package example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter a number: ");
            int i = s.nextInt();
            int n = getFib(i);
            System.out.println(i + "th value in the series is: " + n);
        }
    }

    public static  int getFib(int n) {
        if (n <= 1) {
            return n;
        }
        return getFib(n-1) + getFib(n-2);
    }
}
