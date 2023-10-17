package homeworkweek6;

import java.util.Scanner;

public class Programme6CircleArea {
    /**
     * static variable - class
     * scope - within the class
     * Memory allocation - when class os loaded
     * sore - non heap memory
     */
    public static void main(String[] args) {
        double a = Math.PI;
        int r;
        Scanner area = new Scanner(System.in);
        System.out.println(a);
        System.out.println("Enter the value of radius");
        r = area.nextInt();
        System.out.println(a * r * r);
        area.close();
    }
}

