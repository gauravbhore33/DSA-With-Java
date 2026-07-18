public class ArrayBasics {

    public static void main(String[] args) {

        // 1. Declaration
        int[] arr;

        // 2. Allocation
        arr = new int[4];

        // 3. Initialization
        arr[0] = 93;
        arr[1] = 49;
        arr[2] = 20;
        arr[3] = 75;

        // Accessing Elements
        System.out.println("Value of Index 0: " + arr[0]);
        System.out.println("Value of Index 1: " + arr[1]);
        System.out.println("Value of Index 2: " + arr[2]);
        System.out.println("Value of Index 3: " + arr[3]);

        System.out.println();

        // Traversal using for loop
        System.out.println("Traversal using for loop:");

        int n = arr.length;

        for (int index = 0; index < n; index++) {
            System.out.println(arr[index]);
        }

        System.out.println();

        // Traversal using enhanced for loop
        System.out.println("Traversal using for-each loop:");

        for (int value : arr) {
            System.out.println(value);
        }
    }
}