public class MoveZeros {
    public static void main(String[] args) {

        int arr[] = {0, 10, 0, 20, 30, 0, 40};

        int index = 0;

        // Put all non-zero elements at the beginning
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Put zeros in the remaining positions
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}