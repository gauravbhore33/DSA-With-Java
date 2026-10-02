public class RemoveDuplicate {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};

        int i = 0;
        int j = 1;

        while (j < arr.length) {

            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }

            j++;
        }

        System.out.println("Number of Unique Elements: " + (i + 1));

        System.out.println("Unique Elements:");

        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}