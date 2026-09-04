public class CountEvenandOdd {
    public static void main(String[] args) {

        int arr[] = {10, 23, 44, 51, 62, 77};

        int Even = 0;
        int Odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                Even++;
            } else {
                Odd++;
            }
        }

        System.out.println("Even Nos: " + Even + ", Odd Nos: " + Odd);
    }
}