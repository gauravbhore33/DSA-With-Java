public class RightAlignedTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Print Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Print Stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}