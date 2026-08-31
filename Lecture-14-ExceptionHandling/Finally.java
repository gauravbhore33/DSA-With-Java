/*
==========================================================
                       FINALLY
==========================================================

1. DEFINITION
----------------------------------------------------------
`finally` is a block used in exception handling that is
generally executed whether an exception occurs or not.

It is mainly used for cleanup operations.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Used for cleanup
- Closing files/resources
- Closing database connections
- Releasing resources
- Ensures important cleanup code is attempted


3. TYPES
----------------------------------------------------------

Common structures:

1. try-catch-finally
2. try-finally


4. SYNTAX
----------------------------------------------------------

try {
    // risky code
}
catch (Exception e) {
    // handle exception
}
finally {
    // cleanup code
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

public class Finally {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

            System.out.println(result);

        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        }
        finally {

            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");
    }
}

/*
OUTPUT:

Cannot divide by zero
Finally block executed
Program continues...


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose a program opens a file.

The file should be closed after the operation whether
the operation succeeds or an exception occurs.

finally can be used for cleanup.

Example:

try {
    // file operation
}
catch (Exception e) {
    // handle error
}
finally {
    // close resource
}


7. IMPORTANT KEYWORDS
----------------------------------------------------------
finally
try
catch


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

catch
→ Handles an exception.


finally
→ Used mainly for cleanup and generally executes whether
  an exception occurs or not.


final
→ Restricts variable, method or class.


finalize()
→ Old Object method related to garbage collection;
  deprecated and should not be used for cleanup.


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is finally?

Answer:
finally is a block used for cleanup code and is generally
executed whether an exception occurs or not.


Q2. Is finally always executed?

Answer:
Normally, yes. However, there are exceptional situations,
such as JVM termination using System.exit(), where it may
not execute.


Q3. Can we use finally without catch?

Answer:
Yes.

Example:

try {
    // code
}
finally {
    // cleanup
}


Q4. Can we have try without catch?

Answer:
Yes, if it is followed by finally.


Q5. Can finally block return a value?

Answer:
Technically yes, but returning from finally is strongly
discouraged because it can override a return or exception
from the try/catch.


Q6. What is the difference between final, finally and
finalize()?

Answer:

final
→ Keyword used for restriction.

finally
→ Exception-handling block used for cleanup.

finalize()
→ Deprecated method from Object; should not be relied
  upon for resource cleanup.


10. MY OWN EXAMPLE
----------------------------------------------------------

try {

    System.out.println("Opening file");

}
catch (Exception e) {

    System.out.println("Error occurred");

}
finally {

    System.out.println("Closing file");
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Thinking finally means the code will execute under
   absolutely every possible condition.

`System.exit()` can terminate the JVM before finally runs.


❌ Confusing final with finally.

final   → restriction
finally → cleanup block


❌ Using finally as a replacement for proper resource
   management in modern Java.

For many resources, try-with-resources is preferred.


12. ONE-LINE REVISION
----------------------------------------------------------
finally = Cleanup block that normally executes whether
an exception occurs or not.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"The finally block is generally used for cleanup
operations such as releasing resources, and it normally
executes whether an exception occurs or not."

==========================================================
*/