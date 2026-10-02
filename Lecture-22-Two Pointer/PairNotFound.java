public class PairNotFound {
    public static void main(String[] args) {

        int arr[] = {2, 5, 7, 9, 12};
        int target = 20;

        int i = 0;
        int j = arr.length - 1;

        boolean found = false;

        while (i < j) {

            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Pair Found: " + arr[i] + " " + arr[j]);
                found = true;
                break;
            }
            else if (sum > target) {
                j--;
            }
            else {
                i++;
            }
        }

        if (!found) {
            System.out.println("Pair Not Found");
        }
    }
}