/*
==========================================================
                     TRY-CATCH
==========================================================

1. DEFINITION
----------------------------------------------------------
try-catch is used to handle exceptions in Java.

The `try` block contains code that may cause an exception,
and the `catch` block handles that exception.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Prevents abnormal program termination
- Handles runtime exceptions
- Allows the program to continue execution
- Displays meaningful error messages


3. TYPES
----------------------------------------------------------
Common exception handling structures:

1. try-catch
2. try-catch-finally
3. try-finally
4. Multiple catch


4. SYNTAX
----------------------------------------------------------

try {
    // risky code
}
catch (ExceptionType e) {
    // handling code
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

public class TryCatch {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
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
Suppose a banking application performs:

balance / numberOfTransactions

If numberOfTransactions is zero, an exception can occur.

The try-catch block can handle the problem and show a
meaningful message instead of terminating the program.


7. IMPORTANT KEYWORDS
----------------------------------------------------------

try
→ Contains risky code.

catch
→ Handles the exception.

Exception object
→ Provides information about the exception.

Example:

catch (ArithmeticException e)


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

try
→ Code that may cause exception


catch
→ Handles the exception


finally
→ Executes cleanup code whether exception occurs or not


throw
→ Explicitly creates/throws an exception


throws
→ Declares possible exceptions in a method


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is try-catch?

Answer:
try-catch is an exception-handling mechanism where the
try block contains risky code and the catch block handles
the exception.


Q2. Can we have a try block without catch?

Answer:
Yes, if it is followed by a finally block.

Example:

try {
    // code
}
finally {
    // cleanup
}


Q3. Can we have catch without try?

Answer:
No.

A catch block must be associated with a try block.


Q4. Can one try block have multiple catch blocks?

Answer:
Yes.

Example:

try {
    // risky code
}
catch (ArithmeticException e) {
}
catch (NullPointerException e) {
}


Q5. What happens after catch handles an exception?

Answer:
The program continues with the statement after the
try-catch structure, assuming no other exception occurs.


Q6. What is the purpose of the exception object `e`?

Answer:
It contains information about the exception, such as
its message and stack trace.


10. MY OWN EXAMPLE
----------------------------------------------------------

try {

    int[] numbers = {10, 20, 30};

    System.out.println(numbers[5]);

}
catch (ArrayIndexOutOfBoundsException e) {

    System.out.println("Invalid array index");
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Using a catch block without try.

❌ Catching the wrong exception type.

❌ Putting normal code that does not need protection
   unnecessarily inside try.

❌ Using an overly broad catch such as Exception everywhere
   without understanding what is being handled.


12. ONE-LINE REVISION
----------------------------------------------------------
try = risky code

catch = handles the exception

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"The try block contains code that may throw an exception,
while the catch block handles the exception so the program
can continue normally."

==========================================================
*/