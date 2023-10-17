package homeworkweek6;

public class Programme1 {
    /**
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */
    //Declare instance variables.
    int a = 10;
    int b = 20;

    //Declare instance method.
    public void abc() {
        System.out.println(a);
        System.out.println(b);
    }

    //Declare main method and called both instance method in to main method
    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        obj.abc();
    }
}
