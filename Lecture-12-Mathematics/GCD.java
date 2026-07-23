public class GCD {

    public static void main(String[] args) {

        // ---------------- Method 1 : Brute Force ----------------
        int a = 12;
        int b = 18;

        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("Method 1 (Brute Force) GCD = " + gcd);

        System.out.println();

        // ---------------- Method 2 : Euclidean Algorithm ----------------
        int x = 12;
        int y = 18;

        while (y != 0) {

            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("Method 2 (Euclidean) GCD = " + x);
    }
}