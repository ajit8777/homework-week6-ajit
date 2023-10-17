package homeworkweek6;

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {

        Scanner calculate = new Scanner(System.in);
        System.out.println("Enter first input :");
        double a = calculate.nextDouble();
        System.out.println("Enter second input :");
        double b = calculate.nextDouble();
        System.out.println("Enter third input :");
        double c = calculate.nextDouble();
        System.out.println("The average value is " + average(a, b, c) + "\n");
        calculate.close();
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}

