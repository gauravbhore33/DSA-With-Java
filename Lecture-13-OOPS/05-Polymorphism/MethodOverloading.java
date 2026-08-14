/*
==========================================================
                  METHOD OVERLOADING
==========================================================

1. DEFINITION
----------------------------------------------------------
Method overloading means having multiple methods with the
same name but different parameter lists in the same class.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Improves code readability
- Allows the same operation with different inputs
- Avoids creating different method names for similar work


3. TYPES
----------------------------------------------------------
A method can be overloaded by changing:

1. Number of parameters
2. Type of parameters
3. Order of parameters


4. SYNTAX
----------------------------------------------------------

add(int a, int b)

add(int a, int b, int c)

add(double a, double b)


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Calculator {

    // Two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Two double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {

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
A calculator can perform addition with different numbers:

add(10, 20)

add(10, 20, 30)

add(10.5, 20.5)

Same operation → different inputs.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
No special keyword is required for method overloading.

Important concept:

Method name + parameter list


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

METHOD OVERLOADING
→ Same method name
→ Different parameters
→ Compile-time polymorphism
→ Usually within the same class


METHOD OVERRIDING
→ Same method signature
→ Child class provides its own implementation
→ Runtime polymorphism
→ Requires inheritance


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is method overloading?

Answer:
Defining multiple methods with the same name but different
parameter lists in the same class.


Q2. Is method overloading compile-time or runtime
polymorphism?

Answer:
Compile-time polymorphism.


Q3. Can we overload a method by changing only its return
type?

Answer:
No.

Example:

int add(int a, int b)

double add(int a, int b)

❌ Not allowed because the parameter list is the same.


Q4. Can we overload a method by changing parameter names?

Answer:
No.

These are considered the same:

add(int a, int b)

add(int x, int y)


Q5. How can a method be overloaded?

Answer:

1. Change number of parameters
2. Change parameter types
3. Change order of parameters


10. MY OWN EXAMPLE
----------------------------------------------------------
Create a Student class with overloaded display methods:

display(String name)

display(String name, int age)

display(String name, int age, double marks)


11. COMMON MISTAKES
----------------------------------------------------------

❌ Changing only return type:

int add(int a, int b)

double add(int a, int b)

Not method overloading.


❌ Changing only parameter names:

add(int a, int b)

add(int x, int y)

Not method overloading.


12. ONE-LINE REVISION
----------------------------------------------------------
Method Overloading = Same method name + different
parameter list = Compile-time polymorphism.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Method overloading is compile-time polymorphism where
multiple methods have the same name but different parameter
lists."

==========================================================
*/