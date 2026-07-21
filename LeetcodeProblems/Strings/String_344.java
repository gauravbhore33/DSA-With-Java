public class String_344 {

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        System.out.print("Reversed String: ");

        for (char ch : s) {
            System.out.print(ch + " ");
        }
    }
}