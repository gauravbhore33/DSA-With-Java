public class PassByValue {

    static void changeValue(int number) {
        System.out.println("Inside Method (Before): " + number);

        number = 100;

        System.out.println("Inside Method (After): " + number);
    }

    public static void main(String[] args) {

        int num = 50;

        System.out.println("Before Method Call: " + num);

        changeValue(num);

        System.out.println("After Method Call: " + num);
    }
}