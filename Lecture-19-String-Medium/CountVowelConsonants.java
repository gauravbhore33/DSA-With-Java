public class CountVowelConsonants {
    public static void main(String[] args) {

        String name = "gaurav";

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels are: " + vowels);
        System.out.println("Consonants are: " + consonants);
    }
}