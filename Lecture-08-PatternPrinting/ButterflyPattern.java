public class ButterflyPattern {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            // Left Wing
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // Spaces
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }

            // Right Wing
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = n - 1; row >= 1; row--) {

            // Left Wing
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // Spaces
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }

            // Right Wing
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}