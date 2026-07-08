public class ForLoop {
    public static void main(String[] args) {
    
    // 1 TO 5 Numbers
        for (int i=1; i<=5; i++){
            System.out.println(i);
        }

        System.out.println();
    // Even Number between 1 to 20
        
        for (int i=2; i<=20; i=i+2){
            System.out.println(i);
        }

        System.out.println();
    // Reverse Counting from 1 To 10

        for (int i=10;i>=1;i--){
            System.out.println(i);
        }


        System.out.println();
    // Print Name for 5 times
    
        for(int i=1;i<=5;i++){
            System.out.println("Gaurav Bhore");
        }

        System.out.println();
    // Sum of Numbers 1 to 5
        int sum=0;
            for(int i=1;i<=5;i++){
                sum=sum+i;
                System.out.println(sum);
            }

        System.out.println();
    // Multiplication Table of 5
        for(int i=5;i<=50;i=i+5){
            System.out.println(i);
        }
    }
    
}
