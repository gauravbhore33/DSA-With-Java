public class StringPractice {

    public static void main(String[] args) {

        // =====================================================
        // 1. Count Length of String Without Using length()
        // =====================================================

        String str1 = "Gaurav";
        int length = 0;

        for (char ch : str1.toCharArray()) {
            length++;
        }

        System.out.println("1. Length = " + length);

        System.out.println();


        // =====================================================
        // 2. Count Vowels in a String
        // =====================================================

        String str2 = "Gaurav";
        int vowels = 0;

        for (int i = 0; i < str2.length(); i++) {

            char ch = str2.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowels++;
            }
        }

        System.out.println("2. Vowels = " + vowels);

        System.out.println();


        // =====================================================
        // 3. Print Each Character
        // =====================================================

        String str3 = "Programming";

        System.out.println("3. Characters:");

        for (int i = 0; i < str3.length(); i++) {
            System.out.println(str3.charAt(i));
        }

        System.out.println();


        // =====================================================
        // 4. Reverse a String
        // =====================================================

        String str4 = "Java";

        System.out.print("4. Reverse = ");

        for (int i = str4.length() - 1; i >= 0; i--) {
            System.out.print(str4.charAt(i));
        }

        System.out.println();
        System.out.println();


        // =====================================================
        // 5. Check Palindrome
        // =====================================================

        String str5 = "madam";
        String reverse = "";

        for (int i = str5.length() - 1; i >= 0; i--) {
            reverse += str5.charAt(i);
        }

        if (str5.equals(reverse)) {
            System.out.println("5. Palindrome");
        } else {
            System.out.println("5. Not Palindrome");
        }

        System.out.println();


        // =====================================================
        // 6. Count Consonants
        // =====================================================

        String str6 = "Programming";
        int consonants = 0;

        for (int i = 0; i < str6.length(); i++) {

            char ch = Character.toLowerCase(str6.charAt(i));

            if (ch >= 'a' && ch <= 'z') {

                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    consonants++;
                }
            }
        }

        System.out.println("6. Consonants = " + consonants);

        System.out.println();


        // =====================================================
        // 7. Convert to Uppercase Without Using Method
        // =====================================================

        String str7 = "gaurav";

        System.out.print("7. Uppercase = ");

        for (int i = 0; i < str7.length(); i++) {

            char ch = str7.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            System.out.print(ch);
        }

        System.out.println();
        System.out.println();


        // =====================================================
        // 8. Frequency of Each Character
        // =====================================================

        String str8 = "banana";

        System.out.println("8. Character Frequency:");

        for (int i = 0; i < str8.length(); i++) {

            char ch = str8.charAt(i);
            int count = 0;

            boolean printed = false;

            for (int k = 0; k < i; k++) {
                if (str8.charAt(k) == ch) {
                    printed = true;
                    break;
                }
            }

            if (printed)
                continue;

            for (int j = 0; j < str8.length(); j++) {
                if (str8.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }

        System.out.println();


        // =====================================================
        // 9. Remove All Spaces
        // =====================================================

        String str9 = "Java Programming Language";

        System.out.print("9. Without Spaces = ");

        for (int i = 0; i < str9.length(); i++) {

            if (str9.charAt(i) != ' ') {
                System.out.print(str9.charAt(i));
            }
        }

        System.out.println();
        System.out.println();


        // =====================================================
        // 10. Check Only Digits
        // =====================================================

        String str10 = "123456";

        boolean digits = true;

        for (int i = 0; i < str10.length(); i++) {

            char ch = str10.charAt(i);

            if (!(ch >= '0' && ch <= '9')) {
                digits = false;
                break;
            }
        }

        if (digits) {
            System.out.println("10. Contains Only Digits");
        } else {
            System.out.println("10. Contains Other Characters");
        }

        System.out.println();


        // =====================================================
        // 11. Count Words in a Sentence
        // =====================================================

        String sentence = "I Love Java Programming";

        int words = 1;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == ' ') {
                words++;
            }
        }

        System.out.println("11. Total Words = " + words);

    }
}