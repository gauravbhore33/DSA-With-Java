public class LargestWord {
    public static void main(String[] args) {

        String str = "I love programming";

        String[] words = str.split(" ");

        String largest = "";

        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Largest word: " + largest);
    }
}