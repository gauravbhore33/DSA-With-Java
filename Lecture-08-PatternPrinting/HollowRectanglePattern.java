public class HollowRectanglePattern {

    public static void main(String[] args) {

        int rows = 4;
        int cols = 6;

        for (int row = 1; row <= rows; row++) {

            for (int col = 1; col <= cols; col++) {

                if (row == 1 || row == rows) {
                    System.out.print("* ");
                }
                else if (col == 1 || col == cols) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}