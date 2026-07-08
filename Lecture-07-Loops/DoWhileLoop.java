public class DoWhileLoop {

    public static void main(String[] args) {

        // Example 1: Print Numbers from 1 to 5
        System.out.println("Example 1: Print Numbers from 1 to 5");

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        System.out.println();


        // Example 2: Print Even Numbers from 2 to 20
        System.out.println("Example 2: Even Numbers from 2 to 20");

        int n = 2;

        do {
            System.out.println(n);
            n += 2;
        } while (n <= 20);

        System.out.println();


        // Example 3: Sum of Numbers from 1 to 5
        System.out.println("Example 3: Sum of Numbers from 1 to 5");

        int m = 1;
        int sum = 0;

        do {
            sum += m;
            System.out.println("Current Sum = " + sum);
            m++;
        } while (m <= 5);

        System.out.println("Final Sum = " + sum);
    }
}