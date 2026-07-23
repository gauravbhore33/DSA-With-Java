public class LCM {

    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        // ===============================
        // Method 1 : Brute Force
        // ===============================

        int max = Math.max(a, b);

        while (true) {

            if (max % a == 0 && max % b == 0) {
                System.out.println("Method 1 (Brute Force)");
                System.out.println("LCM = " + max);
                break;
            }

            max++;
        }

        System.out.println();

        // ===============================
        // Method 2 : Using GCD
        // ===============================

        int x = a;
        int y = b;

        // Find GCD using Euclidean Algorithm
        while (y != 0) {

            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;

        int lcm = (a * b) / gcd;

        System.out.println("Method 2 (Using GCD)");
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}