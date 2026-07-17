public class MethodPractice {

    // ==========================================
    // BASIC METHODS
    // ==========================================

    // 1. Greeting
    static void greet() {
        System.out.println("Welcome to Java Programming!");
    }

    // 2. Print Name
    static void printName() {
        System.out.println("Gaurav Bhore");
    }

    // 3. Print Table of 7
    static void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }

    // ==========================================
    // MATHEMATICAL METHODS
    // ==========================================

    // 4. Square
    static int square(int number) {
        return number * number;
    }

    // 5. Cube
    static int cube(int number) {
        return number * number * number;
    }

    // 6. Addition
    static int add(int a, int b) {
        return a + b;
    }

    // 7. Maximum
    static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    // 8. Minimum
    static int minimum(int a, int b) {
        return (a < b) ? a : b;
    }

    // ==========================================
    // NUMBER CHECKING METHODS
    // ==========================================

    // 9. Even or Odd
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 10. Positive, Negative or Zero
    static void checkNumber(int n) {

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    // 11. Prime Number
    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    // 12. Armstrong Number
    static boolean isArmstrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == original;
    }

    // ==========================================
    // NUMBER OPERATIONS
    // ==========================================

    // 13. Factorial
    static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // 14. Sum of Digits
    static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    // 15. Reverse Number
    static int reverseNumber(int n) {

        int reverse = 0;

        while (n > 0) {

            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        return reverse;
    }

    // 16. Count Digits
    static int countDigits(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    // ==========================================
    // SERIES
    // ==========================================

    // 17. Fibonacci Series
    static void fibonacci(int terms) {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= terms; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    // ==========================================
    // GCD / LCM / POWER
    // ==========================================

    // 18. GCD
    static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // 19. LCM
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 20. Power
    static int power(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    // ==========================================
    // MAIN METHOD
    // ==========================================

    public static void main(String[] args) {

        System.out.println("========== BASIC METHODS ==========");
        greet();
        printName();
        printTable();

        System.out.println("\n========== MATHEMATICAL METHODS ==========");
        System.out.println("Square = " + square(5));
        System.out.println("Cube = " + cube(5));
        System.out.println("Addition = " + add(10, 40));
        System.out.println("Maximum = " + maximum(50, 40));
        System.out.println("Minimum = " + minimum(30, 29));

        System.out.println("\n========== NUMBER CHECKING ==========");
        System.out.println("Is Even : " + isEven(18));
        checkNumber(-10);
        System.out.println("Prime : " + isPrime(29));
        System.out.println("Armstrong : " + isArmstrong(153));

        System.out.println("\n========== NUMBER OPERATIONS ==========");
        System.out.println("Factorial = " + factorial(5));
        System.out.println("Sum of Digits = " + sumOfDigits(4567));
        System.out.println("Reverse Number = " + reverseNumber(12345));
        System.out.println("Count Digits = " + countDigits(987654));

        System.out.println("\n========== SERIES ==========");
        fibonacci(10);

        System.out.println("\n========== GCD / LCM / POWER ==========");
        System.out.println("GCD = " + gcd(24, 36));
        System.out.println("LCM = " + lcm(24, 36));
        System.out.println("Power = " + power(2, 5));
    }
}