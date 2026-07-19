public class Array_1480 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        int[] runningSum = new int[nums.length];

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            runningSum[i] = sum;
        }

        System.out.print("Running Sum: ");

        for (int value : runningSum) {
            System.out.print(value + " ");
        }
    }
}