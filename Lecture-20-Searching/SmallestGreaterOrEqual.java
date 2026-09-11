public class SmallestGreaterOrEqual {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};
        int target = 21;

        int low = 0;
        int high = arr.length - 1;

        int answer = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                answer = arr[mid];
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if (answer != -1) {
            System.out.println("Smallest element >= " + target + " is: " + answer);
        }
        else {
            System.out.println("No element found");
        }
    }
}