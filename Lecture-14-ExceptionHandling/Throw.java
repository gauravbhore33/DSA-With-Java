/*
==========================================================
                       THROW
==========================================================

1. DEFINITION
----------------------------------------------------------
`throw` is a Java keyword used to explicitly throw an
exception from a program.

It is used when we want to create an exception based on
our own condition.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- To explicitly throw an exception
- To validate user input
- To enforce business rules
- To create meaningful application errors


3. TYPES
----------------------------------------------------------
`throw` can be used with:

1. Checked exceptions
2. Unchecked exceptions
3. Custom exceptions


4. SYNTAX
----------------------------------------------------------

throw new ExceptionType("message");


Example:

throw new ArithmeticException("Invalid operation");


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

public class Throw {

    static void checkAge(int age) {

        if (age < 18) {

            throw new IllegalArgumentException(
                "Age must be 18 or above"
            );
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        checkAge(15);

        System.out.println("Program continues...");
    }
}

/*
OUTPUT:

Exception in thread "main"
java.lang.IllegalArgumentException:
Age must be 18 or above


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose a banking application does not allow withdrawal
when the balance is insufficient.

if (amount > balance) {

    throw new IllegalArgumentException(
        "Insufficient balance"
    );
}


7. IMPORTANT KEYWORDS
----------------------------------------------------------
throw
new


`throw`
→ Explicitly throws one exception object.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

throw
→ Used to explicitly throw an exception.

throws
→ Used in a method declaration to declare that a method
  may throw exceptions.


Example:

throw:

throw new Exception("Error");


throws:

void readFile() throws IOException {
}


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is throw?

Answer:
`throw` is used to explicitly throw an exception from
the program.


Q2. How many exceptions can be thrown using one throw
statement?

Answer:
One exception object at a time.


Q3. Can throw be used with custom exceptions?

Answer:
Yes.


Q4. Can throw be used with checked exceptions?

Answer:
Yes, but the checked exception must be handled or declared
appropriately.


Q5. Can we use throw inside an if condition?

Answer:
Yes.

Example:

if (age < 18) {
    throw new IllegalArgumentException("Invalid age");
}


10. MY OWN EXAMPLE
----------------------------------------------------------

static void checkMarks(int marks) {

    if (marks < 0 || marks > 100) {

        throw new IllegalArgumentException(
            "Marks must be between 0 and 100"
        );
    }

    System.out.println("Valid marks");
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Confusing throw with throws.

throw  → Actually throws an exception.
throws → Declares possible exceptions.


❌ Forgetting to create an exception object.

Correct:

throw new Exception("Error");


❌ Assuming throw automatically handles the exception.

It only throws the exception. It must be handled or allowed
to propagate according to Java's exception rules.


12. ONE-LINE REVISION
----------------------------------------------------------
throw = Explicitly throw an exception.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"The throw keyword is used to explicitly throw a single
exception object when a specific condition occurs."

==========================================================
*/