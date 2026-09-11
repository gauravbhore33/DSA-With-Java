public class BSCountOccurrences {
    public static void main(String[] args) {

        int arr[] = {10, 20, 20, 20, 30, 40, 50};
        int target = 20;

        // Find First Occurrence
        int low = 0;
        int high = arr.length - 1;
        int first = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if (target > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Find Last Occurrence
        low = 0;
        high = arr.length - 1;
        int last = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if (target > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Calculate count
        if (first != -1) {

            int count = last - first + 1;

            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            System.out.println("Total occurrences: " + count);

        }
        else {
            System.out.println("Element not found");
        }
    }
}