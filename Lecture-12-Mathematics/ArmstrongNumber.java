public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 1634;
        int original = num;

        // Count digits
        int count = 0;
        int temp = num;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = num;

        while (temp != 0) {

            int digit = temp % 10;

            sum += (int) Math.pow(digit, count);

            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is Not an Armstrong Number");
        }
    }
}