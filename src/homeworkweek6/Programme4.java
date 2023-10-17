package homeworkweek6;

public class Programme4 {
    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     */
    //instance variable
    int a = 10;
    int b = 20;
    //static variable
    static int c = 30;
    static int d = 40;

    // Declare instance method
    public void abc() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    //static method
    public static void xyz() {
        Programme4 obj = new Programme4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(d);
    }

    //main method and called static and instance method in main method
    public static void main(String[] args) {
        Programme4 obj = new Programme4();
        obj.abc();
        xyz();
    }
}
