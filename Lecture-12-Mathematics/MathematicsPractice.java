public class MathematicsPractice {

    public static void main(String[] args) {

        // ============================================
        // 1. Perfect Number
        // ============================================

        int perfect = 28;
        int sum = 0;

        for (int i = 1; i < perfect; i++) {
            if (perfect % i == 0) {
                sum += i;
            }
        }

        if (sum == perfect) {
            System.out.println(perfect + " is a Perfect Number");
        } else {
            System.out.println(perfect + " is Not a Perfect Number");
        }

        System.out.println();


        // ============================================
        // 2. Strong Number
        // ============================================

        int strong = 145;
        int original = strong;
        int strongSum = 0;

        while (strong != 0) {

            int digit = strong % 10;

            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            strongSum += fact;

            strong = strong / 10;
        }

        if (strongSum == original) {
            System.out.println(original + " is a Strong Number");
        } else {
            System.out.println(original + " is Not a Strong Number");
        }

        System.out.println();


        // ============================================
        // 3. Automorphic Number
        // ============================================

        int autoNum = 25;

        int square = autoNum * autoNum;

        if (square % 100 == autoNum) {
            System.out.println(autoNum + " is an Automorphic Number");
        } else {
            System.out.println(autoNum + " is Not an Automorphic Number");
        }

        System.out.println();


        // ============================================
        // 4. Neon Number
        // ============================================

        int neon = 9;

        int sq = neon * neon;

        int digitSum = 0;

        while (sq != 0) {

            digitSum += sq % 10;

            sq = sq / 10;
        }

        if (digitSum == neon) {
            System.out.println(neon + " is a Neon Number");
        } else {
            System.out.println(neon + " is Not a Neon Number");
        }

        System.out.println();


        // ============================================
        // 5. Fibonacci Series
        // ============================================

        int n = 10;

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series : ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;

            second = next;
        }

    }
}