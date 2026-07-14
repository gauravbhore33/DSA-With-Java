public class AlphabetTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            char ch = 'A';

            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}