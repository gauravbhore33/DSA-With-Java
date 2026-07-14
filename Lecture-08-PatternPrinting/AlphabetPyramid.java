public class AlphabetPyramid {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            // Ascending
            for (char ch = 'A'; ch < 'A' + row; ch++) {
                System.out.print(ch + " ");
            }

            // Descending
            for (char ch = (char) ('A' + row - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}