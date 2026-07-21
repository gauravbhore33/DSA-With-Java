public class String_709 {

    public static void main(String[] args) {

        String s = "Gaurav Bhore";

        String answer = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            answer += ch;
        }

        System.out.println(answer);
    }
}