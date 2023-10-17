package homeworkweek6;

import java.util.Scanner;

public class Programme18 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Input first number:");
        int a = abc.nextInt();
        System.out.println("Input second number;");
        int b = abc.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));
        abc.close();
    }
}
