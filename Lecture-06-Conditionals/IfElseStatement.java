
import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int Score = 52;

        if(Score>50){
            System.out.println("Passed...");
        }
        else{
            System.out.println("Failed...");
        }

        // Second Example:

        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age= sc.nextInt();

        if(age>=18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }

    }
    
}
