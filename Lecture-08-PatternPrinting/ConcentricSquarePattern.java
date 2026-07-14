public class ConcentricSquarePattern {

    public static void main(String[] args) {

        int n = 5;

        int size = 2 * n - 1;

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                int top = row;
                int left = col;
                int right = size - 1 - col;
                int bottom = size - 1 - row;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }
}