package homeworkweek6;

import java.util.Scanner;

public class Programme19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        in.close();
    }
}
