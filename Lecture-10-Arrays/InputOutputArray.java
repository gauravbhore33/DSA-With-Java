import java.util.Scanner;

public class InputOutputArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array Declaration and Allocation
        int[] arr = new int[5];

        // Input
        System.out.println("Enter 5 Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for Index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.println("\nYour Array Contains:");

        for (int value : arr) {
            System.out.println(value);
        }

        sc.close();
    }
}