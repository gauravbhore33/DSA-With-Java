/*
==========================================================
                    FINAL KEYWORD
==========================================================

1. DEFINITION
----------------------------------------------------------
final is used to restrict modification.

It can be used with:
- Variable
- Method
- Class


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Prevents changing a value
- Prevents method overriding
- Prevents class inheritance


3. TYPES
----------------------------------------------------------
1. final variable → value cannot be changed
2. final method   → cannot be overridden
3. final class    → cannot be inherited


4. SYNTAX
----------------------------------------------------------
final int x = 10;

final void display() {
}

final class A {
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Parent {

    final int value = 100;

    final void display() {
        System.out.println("Final method");
    }
}

final class FinalClass {
}

public class FinalKeyword {

    public static void main(String[] args) {

        final int number = 10;

        System.out.println(number);

        // number = 20;   // ❌ Not allowed
    }
}

/*
6. REAL-WORLD EXAMPLE
----------------------------------------------------------
PI should not be changed:

final double PI = 3.14159;


7. IMPORTANT KEYWORDS
----------------------------------------------------------
final


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
final variable → cannot reassign
final method   → cannot override
final class    → cannot extend


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. Can a final variable be changed?

Answer:
No, once initialized, it cannot be reassigned.


10. MY OWN EXAMPLE
----------------------------------------------------------
final int MAX_MARKS = 100;


11. COMMON MISTAKES
----------------------------------------------------------
❌ Thinking final means the object itself cannot change.

For a final reference, the reference cannot point to
another object, but the object's internal state may
still be changed.


12. ONE-LINE REVISION
----------------------------------------------------------
final = Restriction: variable cannot change, method cannot
be overridden, class cannot be inherited.

INTERVIEW LINE:
"final is used to restrict modification, overriding and
inheritance depending on where it is applied."
==========================================================
*/