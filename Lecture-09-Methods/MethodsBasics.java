public class MethodsBasics {

    // Function or Method 1
    static void greet() {
        System.out.println("Welcome to Java!");
    }

    // Function or Method 2
    static void print2Katable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("2 x " + i + " = " + ans);
        }
    }

    // Calling Functions or Methods
    public static void main(String[] args) {

        greet();

        System.out.println("HI");

        print2Katable();

        System.out.println("BYE");
    }
}