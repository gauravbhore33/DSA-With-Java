public class RepeatedAlphabetTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            char ch = (char) ('A' + row - 1);

            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}