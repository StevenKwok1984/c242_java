package MethodStudy;

public class MethodLecture {
    // Method Naming Conventions
    public static void printHiYa(){
        System.out.println("HiYa");
    }
    public static double calculatePi() {
        return 3.14159;
    }

    /*
        Input Parameters
     */
    public static int add1And1() {
        return 1 + 1;
    }

    public static int add1And2() {
        return 1 + 2;
    }

    public static int add1And3() {
        return 1 + 3;
    }
    /*
    public static int add(int a, int b) {
        return a + b;
    }
    */


    /*
        Method Forms
     */

    // No Return Value, No Parameters
    public static void doit() {
        System.out.println("Hello");
    }

    // Return Value, No Parameters
    public static int get5() {
        return 5;
    }

    // No Return Value, One or More Parameters
    public static void silly(int i) {
        System.out.println("My parameter is: " + i);
    }

    // Return Value, One or More Parameters
    public static int add(int a, int b) {
        return a + b;
    }










    public static void main(String[] args){

        // System.out.println(add1And1() + ", " + add1And2() + ", " + add1And3());
    }
}
