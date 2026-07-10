public class InvertedPyramidPattern {

    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            // Part 1: Print Spaces
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }

            // Part 2: Print Stars
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("* ");
            }

            // Part 3: Next Line
            System.out.println();
        }
    }
}