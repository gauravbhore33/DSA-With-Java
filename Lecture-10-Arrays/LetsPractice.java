

public class LetsPractice {

    public static void main(String[] args) {

        // ==========================================
        // 1. Print the Array Values
        // ==========================================

        int[] arr1 = {23, 54, 65, 76, 86};

        System.out.println("1. Print Array:");

        for (int value : arr1) {
            System.out.println(value);
        }

        // ==========================================
        // 2. Find Sum of Array Elements
        // ==========================================

        int[] arr2 = {1, 5, 5, 4};

        int sum = 0;

        for (int value : arr2) {
            sum += value;
        }

        System.out.println("\n2. Sum = " + sum);

        // ==========================================
        // 3. Multiply All Elements
        // ==========================================

        int[] arr3 = {2, 3, 10, 20};

        int mul = 1;

        for (int value : arr3) {
            mul *= value;
        }

        System.out.println("\n3. Multiplication = " + mul);

        // ==========================================
        // 4. Maximum Element
        // ==========================================

        int[] arr4 = {4, 2, -5, 21, 15};

        int max = arr4[0];

        for (int i = 1; i < arr4.length; i++) {

            if (arr4[i] > max) {
                max = arr4[i];
            }
        }

        System.out.println("\n4. Maximum Element = " + max);

        // ==========================================
        // 5. Minimum Element
        // ==========================================

        int[] arr5 = {4, 2, -5, 21, 15};

        int min = arr5[0];

        for (int i = 1; i < arr5.length; i++) {

            if (arr5[i] < min) {
                min = arr5[i];
            }
        }

        System.out.println("\n5. Minimum Element = " + min);

        //6. Count Numbers

        int[] arr6 = { 2, 4, 5, 7, 9};
    
        System.out.println("\6. Total Numbers = " + arr6.length);

        // Count Even Numbers

        int[] arr7 = { 2, 1, 4, 5, 6,10};

        for ( int value : arr7){
            if (value % 2==0){
            
                System.out.println(value);
            }
        }

        // Count Odd Numbers

        int[] arr8= { 23, 43,42,53,76};

        for ( int value : arr8){
            if ( value % 2!=0){

                System.out.println("Odd Numbers: "+value);
            }
        }


}
}