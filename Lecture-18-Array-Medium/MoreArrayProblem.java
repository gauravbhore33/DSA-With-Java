public class MoreArrayProblem {

    public static void main(String[] args) {

        countSmallerThanTarget();
        findAverage();
        differenceLargestSmallest();
        secondLargestSmallestWithDuplicates();
        leftRotateByOne();
        rightRotateByOne();
        commonElements();
        pairWithGivenSum();
        basicSubarraySum();
    }

    // 1. Count elements smaller than target
    static void countSmallerThanTarget() {

        int arr[] = {10, 25, 15, 40, 30, 5, 50};
        int target = 20;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                count++;
            }
        }

        System.out.println("1. Elements smaller than " + target + ": " + count);
    }


    // 2. Find average of array
    static void findAverage() {

        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("2. Average: " + average);
    }


    // 3. Find difference between largest and smallest
    static void differenceLargestSmallest() {

        int arr[] = {25, 10, 45, 5, 30, 60, 15};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int difference = largest - smallest;

        System.out.println("3. Difference: " + difference);
    }


    // 4. Second largest and second smallest with duplicates handled
    static void secondLargestSmallestWithDuplicates() {

        int arr[] = {10, 20, 10, 40, 30, 40, 5};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Second Largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

            // Second Smallest
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("4. Second Largest: " + secondLargest);
        System.out.println("   Second Smallest: " + secondSmallest);
    }


    // 5. Left rotate array by 1
    static void leftRotateByOne() {

        int arr[] = {10, 20, 30, 40, 50};

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        System.out.print("5. Left Rotate: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    // 6. Right rotate array by 1
    static void rightRotateByOne() {

        int arr[] = {10, 20, 30, 40, 50};

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.print("6. Right Rotate: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    // 7. Find common elements in two arrays
    static void commonElements() {

        int arr1[] = {10, 20, 30, 40, 50};
        int arr2[] = {20, 40, 60, 80};

        System.out.print("7. Common Elements: ");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }

        System.out.println();
    }

    // 9. Find a pair with a given sum
    static void pairWithGivenSum() {

        int arr[] = {10, 20, 30, 40, 50};
        int target = 70;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println("9. Pair with sum " + target
                            + ": " + arr[i] + " + " + arr[j]);

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("9. No pair found");
        }
    }


    // 10. Basic subarray sum
    static void basicSubarraySum() {

        int arr[] = {10, 20, 30, 40, 50};

        int start = 1;
        int end = 3;

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum = sum + arr[i];
        }

        System.out.println("10. Subarray Sum: " + sum);
    }
}

