package homeworkweek6;
/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2 {

//Declare two static variable.
    static int a = 10;
    static String name = "Ajit";

    //  Declare static method.
    public static void M1() {

        System.out.println(Programme2.a);
        System.out.println(name);
    }

    //main method and called both static method inside the main method.
    public static void main(String[] args) {
        M1();
    }
}
