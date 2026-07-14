public class HollowPyramidPattern {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Part 1: Print Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Part 2: Print Stars and Inner Spaces
            for (int col = 1; col <= (2 * row - 1); col++) {

                if (col == 1 || col == (2 * row - 1) || row == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Part 3: Next Line
            System.out.println();
        }
    }
}