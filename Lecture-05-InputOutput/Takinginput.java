
import java.math.BigInteger;
import java.util.Scanner;

public class Takinginput {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter FirstNum:");
        int FirstNum=sc.nextInt();
        System.out.println("Enter SecondNum:");
        int SecondNum=sc.nextInt();
        
        int ans=FirstNum+SecondNum;
        System.out.println("Answer is:"+ans);

        // Various Values like integers:

        System.out.println("Enter Value for Big Interger:");
        BigInteger bg=sc.nextBigInteger();
        System.out.println("Enter value for Flag:");
        Boolean Flag=sc.nextBoolean();
        System.out.println("Enter a Short Value:");
        Short shortval=sc.nextShort();
        System.out.println("Enter a Float Value:");
        Float floatvalue=sc.nextFloat();

        System.out.println("Big Integer is:"+bg);
        System.out.println("Flag is:"+Flag);
        System.out.println("Short Value is:"+shortval);
        System.out.println("Float Value is:"+floatvalue);
    }
}
