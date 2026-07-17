public class ReturnMethods {

    // Example 1: Return the square of a number
    static int square(int n) {
        return n * n;
    }

    // Example 2: Return the cube of a number
    static int cube(int n) {
        return n * n * n;
    }

    // Example 3: Return the sum of two numbers
    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }

    // Main Method
    public static void main(String[] args) {

        // Example 1: Square
        System.out.println("Example 1: Square");
        System.out.println("The Square is: " + square(5));

        System.out.println();

        // Example 2: Cube
        System.out.println("Example 2: Cube");
        System.out.println("The Cube is: " + cube(5));

        System.out.println();

        // Example 3: Addition
        System.out.println("Example 3: Addition");
        int result = add(12, 13);
        System.out.println("Result: " + result);
    }
}