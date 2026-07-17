public class CallByValue {

    static void changeValue(int number) {

        number = 100;

        System.out.println("Inside Method : " + number);
    }

    public static void main(String[] args) {

        int num = 50;

        System.out.println("Before Method Call : " + num);

        changeValue(num);

        System.out.println("After Method Call : " + num);
    }
}