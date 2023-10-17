package homeworkweek6;

import java.util.Scanner;

public class Programme7Temperature {
    /**
     * static variable - class
     * scope - within the class
     * Memory allocation - when class os loaded
     * sore - non heap memory
     */
    public static void main(String[] args) {
        float f;
        int a = 32;
        int b = 5;
        int c = 9;
        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter Temperature value in degree Fahrenheit");
        f = temperature.nextFloat();
        System.out.print((f - a) * b / c);
        System.out.println("°C");
        temperature.close();
    }
}
