
import java.util.Scanner;

public class ifelseif_ladder{
    public static void main(String[] args) {
        int accuracy = 34;

        if (accuracy>=90){
            System.out.println("Clever");
        }
        else if (accuracy>=70){
            System.out.println("Excellent");
        }
        else if (accuracy>=50){
            System.out.println("Good");
        }
        else if (accuracy>=35){
            System.out.println("Average");
        }
        else{
            System.out.println("Needs Improvement...");
        }

        // SECOND EXAMPLE

        System.out.println("Enter Your Marks To Check Your Garde");
        Scanner sc = new Scanner(System.in);
        int Marks= sc.nextInt();


        if (Marks>=90){
            System.out.println("A+");
        }
        else if (Marks>=80){
            System.out.println("A");
        }
        else if (Marks>=70){
            System.out.println("B+");
        }
        else if (Marks>=60){
            System.out.println("B");
        }
        else if (Marks>=50){
            System.out.println("C+");
        }
        else if (Marks>=40){
            System.out.println("C");
        }
        else{
            System.out.println("Your Marks Are Less, Needs Improvemet...");
        }
    }
}