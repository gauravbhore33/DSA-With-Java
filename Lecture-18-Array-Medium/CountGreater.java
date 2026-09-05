public class CountGreater {
    public static void main(String[] args) {

        int arr[] = {10, 25, 15, 40, 30, 5, 50};
        int target = 20;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > target) {
                count++;
            }
        }

        System.out.println("Elements greater than " + target + ": " + count);
    }
}