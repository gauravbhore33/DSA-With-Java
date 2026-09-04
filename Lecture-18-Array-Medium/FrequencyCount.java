public class FrequencyCount {
    public static void main(String[] args) {

        int arr[] = {10, 20, 10, 30, 10, 40, 20};

        int target = 10;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("10 Appears: " + count + " Times");
    }
}