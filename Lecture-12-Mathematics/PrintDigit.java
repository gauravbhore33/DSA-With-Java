public class PrintDigit {
    public static void main(String[] args) {
        int num = 2133;

        while ( num!=0 ){
            int digit = num%10;

            System.out.println(digit);

            num=num/10;
        }
        
        
    } 
    
}
