public class WhileLoop {

    public static void main(String[] args) {

        
        // Example 1: Print Numbers from 1 to 5
        
        System.out.println("Example 1: Print Numbers from 1 to 5");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println();


        
        // Example 2: Print Numbers from 10 to 1
        
        System.out.println("Example 2: Print Numbers from 10 to 1");

        int i1 = 10;

        while (i1 >= 1) {
            System.out.println(i1);
            i1--;
        }

        System.out.println();


        
        // Example 3: Print Even Numbers from 1 to 20
        
        System.out.println("Example 3: Even Numbers from 1 to 20");

        int m = 2;

        while (m <= 20) {
            System.out.println(m);
            m += 2;
        }

        System.out.println();


        
        // Example 4: Sum of Numbers from 1 to 5
        
        System.out.println("Example 4: Sum of Numbers from 1 to 5");

        int n = 1;
        int sum = 0;

        while (n <= 5) {
            sum += n;
            n++;
        }

        System.out.println("Sum = " + sum);
    }
}