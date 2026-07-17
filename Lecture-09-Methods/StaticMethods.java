public class StaticMethods {

    // Example 1
    static void greet() {
        System.out.println("Welcome to Java!");
    }

    // Example 2
    static void printMessage() {
        System.out.println("Learning Static Methods");
    }

    // Example 3
    static int square(int number) {
        return number * number;
    }

    // Example 4
    static void printWelcome() {
        System.out.println("Welcome - Gaurav Bhore...");
    }

    // Example 5
    static boolean isEligibleForBadge(int streakDays) {
        return streakDays >= 30;
    }

    public static void main(String[] args) {

        System.out.println("Example 1: Greeting");
        greet();

        System.out.println();

        System.out.println("Example 2: Message");
        printMessage();

        System.out.println();

        System.out.println("Example 3: Square");
        int result = square(6);
        System.out.println("Square = " + result);

        System.out.println();

        System.out.println("Example 4: Welcome Message");
        printWelcome();

        System.out.println();

        System.out.println("Example 5: Badge Eligibility");
        boolean eligible = isEligibleForBadge(35);
        System.out.println("Badge Eligible: " + eligible);
    }
}