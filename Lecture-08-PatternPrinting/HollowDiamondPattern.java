public class HollowDiamondPattern {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {

                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // Lower Half
        for (int row = n - 1; row >= 1; row--) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {

                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}