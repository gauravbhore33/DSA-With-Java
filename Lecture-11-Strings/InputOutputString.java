import java.util.Scanner;

public class InputOutputString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Provide the String Content: ");

        String str = sc.nextLine();
        System.out.println("Value of nextLine(): " + str);

        String str2 = sc.next();
        System.out.println("Value of next(): " + str2);

        sc.close();
    }
}