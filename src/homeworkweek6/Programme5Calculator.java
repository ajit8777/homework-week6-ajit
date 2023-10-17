package homeworkweek6;

import java.util.Scanner;

public class Programme5Calculator {
    /**
     * static variable - class
     * scope - within the class
     * Memory allocation - when class os loaded
     * sore - non heap memory
     */
    public static void main(String[] args) {
        int a;
        int b;
        Scanner abc = new Scanner(System.in);
        System.out.println("Please enter int a value");
        a = abc.nextInt();
        System.out.println("Please enter int b value");
        b = abc.nextInt();
        //Concatenation
        System.out.println("Addition of two numbers " + a + " and " + b + " is : " + (a + b));
        System.out.println("Subtraction of two numbers " + b + " and " + a + " is : " + (b - a));
        Programme5Calculator obj = new Programme5Calculator();
        obj.multiplication();
        abc.close();
    }

    /**
     * Scope - within the class
     * Memory allocation - when object is created
     * memory - heap
     */
    public void multiplication() {
        int a;
        int b;
        Scanner abc = new Scanner(System.in);
        System.out.println("Please enter int a value");
        a = abc.nextInt();
        System.out.println("Please enter int b value");
        b = abc.nextInt();
        //Concatenation
        System.out.println("Multiplication of two numbers " + a + " and " + b + " is : " + (a * b));
        System.out.println("Division of two numbers " + a + " and " + b + " is : " + (b / a));
    }
}




