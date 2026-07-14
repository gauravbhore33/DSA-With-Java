public class PascalsTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }

            int number = 1;

            for (int col = 0; col <= row; col++) {
                System.out.print(number + "   ");
                number = number * (row - col) / (col + 1);
            }

            System.out.println();
        }
    }
}