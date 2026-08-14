/*
==========================================================
              COMPILE-TIME POLYMORPHISM
==========================================================

1. DEFINITION
----------------------------------------------------------
Compile-time polymorphism means the method to be executed
is decided by the compiler during compilation.

In Java, it is mainly achieved through METHOD OVERLOADING.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Same operation can work with different inputs
- Improves readability
- Provides flexibility
- Method call is resolved at compile time


3. TYPES
----------------------------------------------------------
Compile-time polymorphism is mainly achieved using:

1. Method Overloading
2. Constructor Overloading


4. SYNTAX
----------------------------------------------------------

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));

        System.out.println(c.add(10, 20, 30));

        System.out.println(c.add(10.5, 20.5));
    }
}

/*
OUTPUT:

30
60
31.0


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
A calculator's add() operation can accept different inputs:

add(10, 20)
add(10, 20, 30)
add(10.5, 20.5)

The compiler decides which add() method should be called
based on the arguments.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
No special keyword is required.

Important concept:

Method Overloading


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

COMPILE-TIME POLYMORPHISM
→ Method Overloading
→ Decision made by compiler
→ Different parameter list


RUNTIME POLYMORPHISM
→ Method Overriding
→ Decision made at runtime
→ Parent-child relationship


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is compile-time polymorphism?

Answer:
Compile-time polymorphism is a type of polymorphism where
the method call is resolved by the compiler during
compilation.


Q2. How is compile-time polymorphism achieved in Java?

Answer:
Mainly through method overloading and constructor
overloading.


Q3. Why is method overloading called compile-time
polymorphism?

Answer:
Because the compiler determines which overloaded method
to call based on the number, type, and order of arguments.


Q4. Can method overloading happen by changing only the
return type?

Answer:
No.

The parameter list must be different.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create a Printer class:

print(int number)

print(String text)

print(String text, int copies)

Call all three methods from main().


11. COMMON MISTAKES
----------------------------------------------------------

❌ Thinking overriding is compile-time polymorphism.

Overriding → Runtime polymorphism.


❌ Changing only return type:

int add(int a, int b)

double add(int a, int b)

Not valid overloading.


12. ONE-LINE REVISION
----------------------------------------------------------
Compile-Time Polymorphism = Method Overloading =
method call decided by the compiler.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Compile-time polymorphism is achieved mainly through
method overloading, where the compiler decides which
method to execute based on the method arguments."

==========================================================
*/