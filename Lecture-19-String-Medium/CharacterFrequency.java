public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "gaurav";
        char target = 'a';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == target) {
                count++;
            }
        }

        System.out.println("'" + target + "' appears " + count + " times");
    }
}