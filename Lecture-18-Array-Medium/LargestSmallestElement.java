public class LargestSmallestElement {
    public static void main(String[] args) {

        int arr[] = {25, 10, 45, 5, 30, 60, 15};

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
    }
}