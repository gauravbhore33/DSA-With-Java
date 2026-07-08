public class NestedWhileLoop {

    public static void main(String[] args) {

        
        // Example 1: Print Values of i and j
        System.out.println("Example 1: Print Values of i and j");

        int i = 1;

        while (i <= 2) {

            int j = 1;

            while (j <= 3) {
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }

            i++;
        }

        System.out.println();


        // Example 2: Print 3 × 3 Hash Pattern
        System.out.println("Example 2: 3 x 3 Hash Pattern");

        int a = 1;

        while (a <= 3) {

            int b = 1;

            while (b <= 3) {
                System.out.print("# ");
                b++;
            }

            System.out.println();
            a++;
        }

        System.out.println();


        // Example 3: Print Number Square Pattern
        System.out.println("Example 3: Number Square Pattern");

        int x = 1;

        while (x <= 5) {

            int y = 1;

            while (y <= 5) {
                System.out.print(y + " ");
                y++;
            }

            System.out.println();
            x++;
        }
    }
}