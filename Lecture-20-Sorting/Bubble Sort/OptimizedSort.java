public class OptimizedSort {
    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 4, 2};

        boolean swapped = false;

        for (int i = 0; i < arr.length - 1; i++) {

            // Assume no swap happens in this pass
            swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // A swap happened
                    swapped = true;
                }
            }

            // If no swap happened, array is already sorted
            if (swapped == false) {
                break;
            }
        }

        System.out.println("Ascending Order:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}