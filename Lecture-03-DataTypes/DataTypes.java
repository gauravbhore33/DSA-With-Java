public class DataTypes {
    static void main(){
        
        // Type Casting
        long value1= 222324343;
        int value2=(int)value1;
        System.out.println("Value 2 is="+value2);

        // Numeric D/T
        byte num1 = 127; 
        // Implicit Conversion
        long newnum = num1;
        System.out.println(num1);
        System.out.println("Newnum"+num1);
 
        short num2 = 32767;
        System.out.println(num2);

        int num3 = 40000;
        long num4 = 802839039;
        System.out.println(num3);
        System.out.println(num4);
        
        // Floating D/Ts
        float num5 = 3.14f;
        System.out.println(num5);
         
        double num6 = 2.3729897389;
        System.out.println(num6);

        // Other D/Ts
        boolean eligibletovote = true;
        System.out.println(eligibletovote);

        char name='a';
        System.out.println(name);
    }
}
