public class StringBasics {

    public static void main(String[] args) {

        String firstName = "Gaurav";
        String lastName = new String("Bhore");

        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Full Name  : " + firstName + " " + lastName);
        System.out.println("The lenght of Gaurav is: "+firstName.length());
        System.out.println("The lenght of Bhore is: "+lastName.length());
    }
}