public class NumberDiamond {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++)
                System.out.print("  ");

            for (int col = 1; col <= row; col++)
                System.out.print(col + " ");

            for (int col = row - 1; col >= 1; col--)
                System.out.print(col + " ");

            System.out.println();
        }

        // Lower Half
        for (int row = n - 1; row >= 1; row--) {

            for (int space = 1; space <= n - row; space++)
                System.out.print("  ");

            for (int col = 1; col <= row; col++)
                System.out.print(col + " ");

            for (int col = row - 1; col >= 1; col--)
                System.out.print(col + " ");

            System.out.println();
        }
    }
}