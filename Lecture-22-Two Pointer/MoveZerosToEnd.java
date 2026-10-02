public class MoveZerosToEnd {
    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 3, 12};

        int i = -1;
        int j = 0;

        while (j < arr.length) {

            if (arr[j] != 0) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            j++;
        }

        System.out.println("Array after moving zeros:");

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}