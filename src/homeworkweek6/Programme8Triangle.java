package homeworkweek6;

import java.util.Scanner;

public class Programme8Triangle {
    /**
     * static variable - class
     * scope - within the class
     * Memory allocation - when class os loaded
     * sore - non heap memory
     */
    public static void main(String[] args) {
        float a;
        float b;
        // a = height of triangle, b = base of triangle
        Scanner Area = new Scanner(System.in);
        System.out.println("Enter height of triangle");
        a = Area.nextFloat();
        System.out.println("Enter base of triangle");
        b = Area.nextFloat();
        System.out.println(0.5 * a * b);
        Area.close();
    }


}
