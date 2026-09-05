public class SecondSmallest {
    public static void main(String[] args) {

        int arr[] = {25, 10, 45, 5, 30, 60, 15};

        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}