public class AlphabetDiamond {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            for (char ch = 'A'; ch < 'A' + row; ch++) {
                System.out.print(ch + " ");
            }

            for (char ch = (char) ('A' + row - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = n - 1; row >= 1; row--) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            for (char ch = 'A'; ch < 'A' + row; ch++) {
                System.out.print(ch + " ");
            }

            for (char ch = (char) ('A' + row - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}