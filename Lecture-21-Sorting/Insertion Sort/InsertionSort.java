public class InsertionSort {
    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 4, 2};

        for (int i = 1; i < arr.length; i++) {

            // Element we want to insert
            int key = arr[i];

            // Previous element
            int j = i - 1;

            // Move larger elements one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Put key in its correct position
            arr[j + 1] = key;
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}