/*
==========================================================
                   MULTIPLE CATCH
==========================================================

1. DEFINITION
----------------------------------------------------------
Multiple catch means using multiple `catch` blocks with
one `try` block to handle different types of exceptions.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Different exceptions require different handling
- Makes exception handling more specific
- Improves readability
- Prevents one exception handler from handling unrelated
  exceptions


3. TYPES
----------------------------------------------------------

1. Multiple catch blocks
2. Multi-catch block (Java 7+)

Multiple catch:

try {
}
catch (ArithmeticException e) {
}
catch (ArrayIndexOutOfBoundsException e) {
}


Multi-catch:

try {
}
catch (ArithmeticException | NullPointerException e) {
}


4. SYNTAX
----------------------------------------------------------

try {
    // risky code
}
catch (ExceptionType1 e) {
    // handling
}
catch (ExceptionType2 e) {
    // handling
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

public class MultipleCatch {

    public static void main(String[] args) {

        try {

            int[] numbers = {10, 20, 30};

            int a = 10;
            int b = 0;

            System.out.println(a / b);

            System.out.println(numbers[5]);

        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index");
        }

        System.out.println("Program continues...");
    }
}

/*
OUTPUT:

Cannot divide by zero
Program continues...


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose an application performs:

1. Database operation
2. File operation
3. Mathematical calculation

Different problems can occur.

Each exception can have its own catch block and handling
logic.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
try
catch
Exception


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

Multiple catch:

catch (ArithmeticException e)
catch (NullPointerException e)

→ Different handling for different exceptions.


Multi-catch:

catch (ArithmeticException | NullPointerException e)

→ Same handling for multiple exception types.


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. Can one try block have multiple catch blocks?

Answer:
Yes.

A single try block can have multiple catch blocks.


Q2. Which catch block executes?

Answer:
The first matching catch block executes.


Q3. Can we write a parent exception catch block before
a child exception catch block?

Answer:
No.

Example:

catch (Exception e) {
}
catch (ArithmeticException e) {
}

This causes a compilation error because ArithmeticException
is already covered by Exception.


Correct order:

catch (ArithmeticException e) {
}
catch (Exception e) {
}


Q4. What is multi-catch?

Answer:
Multi-catch allows multiple exception types to be handled
by a single catch block using `|`.

Example:

catch (ArithmeticException | NullPointerException e)


Q5. Which Java version introduced multi-catch?

Answer:

Java 7.


10. MY OWN EXAMPLE
----------------------------------------------------------

try {

    String name = null;

    System.out.println(name.length());

}
catch (NullPointerException e) {

    System.out.println("Name cannot be null");

}
catch (Exception e) {

    System.out.println("Some other exception occurred");
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Wrong order:

catch (Exception e)
catch (ArithmeticException e)

The specific exception must come before its parent.


❌ Writing unrelated exception types in multi-catch when
   one is a subclass of another.

Example:

catch (Exception | ArithmeticException e)

❌ Not understanding that only ONE matching catch block
   executes for a particular exception.


12. ONE-LINE REVISION
----------------------------------------------------------
Multiple Catch = One try + multiple catch blocks for
different exceptions.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Multiple catch blocks allow a single try block to handle
different types of exceptions separately. The first
matching catch block is executed."

==========================================================
*/