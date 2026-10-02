public class PalindromeOrNot {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 1};

        int i = 0;
        int j = arr.length - 1;

        boolean isPalindrome = true;

        while (i < j) {

            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}