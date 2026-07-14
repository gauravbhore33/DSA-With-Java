public class NumberPyramid {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Print Spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            // Ascending Numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            // Descending Numbers
            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}