public class SwitchStatement {
    public static void main(String[] args) {

        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("You selected Tea ");
                break;

            case 2:
                System.out.println("You selected Coffee ");
                break;

            case 3:
                System.out.println("You selected Juice ");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}