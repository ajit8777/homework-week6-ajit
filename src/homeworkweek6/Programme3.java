package homeworkweek6;

public class Programme3 {
    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */
    // Declare instance variable
    int a = 10;
    // Declare static variable
    static String name = "Ajit";

    //Declare instance method
    public void xyz() {
        System.out.println(a);
        System.out.println(name);
    }

    // Declare static method
    public static void m1() {
        Programme3 obj = new Programme3();
        System.out.println(obj.a);
        System.out.println(name);
    }
//Declare the Main method and Call both instance and static methods into the Main method
    public static void main(String[] args) {
        m1();
        Programme3 obj = new Programme3();
        obj.xyz();
    }
}
