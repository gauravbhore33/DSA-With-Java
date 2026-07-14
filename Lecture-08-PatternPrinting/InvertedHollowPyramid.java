public class InvertedHollowPyramid {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Part 1: Spaces
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }

            // Part 2: Stars
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {

                if (row == 1 || col == 1 || col == 2 * (n - row) + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}