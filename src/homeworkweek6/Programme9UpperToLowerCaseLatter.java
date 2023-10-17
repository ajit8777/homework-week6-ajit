package homeworkweek6;

import java.util.Scanner;

public class Programme9UpperToLowerCaseLatter {
    /**
     * static variable - class
     * scope - within the class
     * Memory allocation - when class os loaded
     * sore - non heap memory
     */
    public static void main(String[] args) {
        char ch, ch2;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter character in upper case :");
        ch = abc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            ch2 = Character.toLowerCase(ch);
            System.out.println("Lowercase " + ch2);
        }
        abc.close();
    }
}


