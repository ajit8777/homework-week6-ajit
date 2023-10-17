package homeworkweek6;

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input number");
        int num1 = input.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + "x" + (i + 1) + "=" + (num1 * (i + 1)));
            input.close();
        }
    }
}