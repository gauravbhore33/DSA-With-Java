public class SearchInsertPosition {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int target = 35;

        int low = 0;
        int high = arr.length - 1;

        int answer = arr.length;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] >= target) {

                answer = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        System.out.println("Insert position: " + answer);
    }
}