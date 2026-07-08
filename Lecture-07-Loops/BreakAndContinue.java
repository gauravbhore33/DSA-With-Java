public class BreakAndContinue {

    public static void main(String[] args) {

        // BREAK STATEMENT EXAMPLES
        

        // Example 1: Break when i becomes 5
        System.out.println("========== Example 1: Break at 5 ==========");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println();

        // Example 2: Break when i becomes 7
        System.out.println("========== Example 2: Break at 7 ==========");

        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

        System.out.println();

        // Example 3: Find the First Multiple of 9
        System.out.println("========== Example 3: First Multiple of 9 ==========");

        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.println("First multiple of 9 is: " + i);
                break;
            }
        }

        System.out.println();


        
        // CONTINUE STATEMENT EXAMPLES
    

        // Example 1: Skip Number 5
        System.out.println("========== Example 1: Skip Number 5 ==========");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        // Example 2: Print Only Even Numbers
        System.out.println("========== Example 2: Print Only Even Numbers ==========");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        // Example 3: Skip Multiples of 3
        System.out.println("========== Example 3: Skip Multiples of 3 ==========");

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}