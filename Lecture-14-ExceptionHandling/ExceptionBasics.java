/*
==========================================================
                  EXCEPTION BASICS
==========================================================

1. DEFINITION
----------------------------------------------------------
An exception is an unwanted event that occurs during
program execution and interrupts the normal flow of
the program.

Example:
Dividing a number by zero causes ArithmeticException.


2. WHY DO WE NEED EXCEPTION HANDLING?
----------------------------------------------------------
- Prevents abnormal program termination
- Maintains normal program flow
- Helps handle runtime problems
- Makes applications more reliable
- Provides meaningful error messages


3. TYPES OF EXCEPTIONS
----------------------------------------------------------

1. Checked Exception
   → Checked by compiler
   → Example: IOException, SQLException

2. Unchecked Exception
   → Occurs at runtime
   → Example: ArithmeticException,
              NullPointerException,
              ArrayIndexOutOfBoundsException


4. EXCEPTION HIERARCHY
----------------------------------------------------------

              Throwable
                 |
        ┌────────┴────────┐
        ↓                 ↓
      Error           Exception
                          |
                    RuntimeException
                          |
             ┌────────────┼─────────────┐
             ↓            ↓             ↓
       Arithmetic     NullPointer    ArrayIndex
       Exception       Exception     OutOfBounds


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

public class ExceptionBasics {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        // This causes ArithmeticException
        int result = a / b;

        System.out.println(result);
    }
}

/*
OUTPUT:

Exception in thread "main"
java.lang.ArithmeticException: / by zero


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose a banking application tries to withdraw more money
than available.

Instead of allowing the program to crash, the exception
can be handled and a meaningful message can be displayed:

"Insufficient balance"


7. IMPORTANT KEYWORDS
----------------------------------------------------------

try
→ Contains code that may cause an exception.

catch
→ Handles the exception.

finally
→ Executes cleanup code.

throw
→ Explicitly throws an exception.

throws
→ Declares that a method may throw an exception.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

EXCEPTION
→ Usually represents a condition that an application may
  handle.

ERROR
→ Serious problem generally not intended to be handled
  by application code.

Example:

Exception → ArithmeticException
Error     → OutOfMemoryError


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is an exception?

Answer:
An exception is an event that occurs during program
execution and disrupts the normal flow of the program.


Q2. What is exception handling?

Answer:
Exception handling is a mechanism used to handle
runtime problems so that the normal flow of the program
can continue.


Q3. What is the difference between checked and unchecked
exceptions?

Answer:

Checked:
→ Checked by compiler.
→ Must generally be handled or declared.
→ Example: IOException.

Unchecked:
→ Runtime exceptions.
→ Example: ArithmeticException.


Q4. What is the parent class of exceptions?

Answer:

Throwable.


Q5. What happens if an exception is not handled?

Answer:
The exception propagates up the call stack. If it remains
unhandled, the JVM terminates the current thread and
prints the exception information.


10. MY OWN EXAMPLE
----------------------------------------------------------

int marks = 100;
int students = 0;

int average = marks / students;

This causes:

ArithmeticException


11. COMMON MISTAKES
----------------------------------------------------------

❌ Thinking every exception is checked by the compiler.

❌ Confusing Exception with Error.

❌ Ignoring exceptions instead of handling them properly.

❌ Thinking exception handling prevents every possible
   program error.


12. ONE-LINE REVISION
----------------------------------------------------------
Exception = An event during execution that disrupts the
normal flow of a program.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"An exception is an abnormal condition that occurs during
program execution and disrupts the normal flow. Java
provides exception-handling mechanisms such as try, catch,
finally, throw and throws to handle such situations."

==========================================================
*/