public class Array_1295 {

    // Method to count the number of digits
    static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        int evenDigitCount = 0;

        for (int value : nums) {

            int digits = countDigits(value);

            if (digits % 2 == 0) {
                evenDigitCount++;
            }
        }

        System.out.println("Numbers with Even Digits = " + evenDigitCount);
    }
}