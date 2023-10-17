package homeworkweek6;

import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner swap = new Scanner(System.in);
        System.out.println("Input the first number :");
        a = swap.nextInt();
        System.out.println("Input the second number :");
        b = swap.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("Swapped values are :" + a + " and " + b);
        swap.close();
    }
}
