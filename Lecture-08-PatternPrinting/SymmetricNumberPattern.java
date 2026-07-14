public class SymmetricNumberPattern {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row + 1; col++)
                System.out.print(col + " ");

            for (int space = 1; space <= 2 * (row - 1); space++)
                System.out.print("  ");

            for (int col = n - row + 1; col >= 1; col--)
                System.out.print(col + " ");

            System.out.println();
        }
    }
}