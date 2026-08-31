/*
==========================================================
                  CUSTOM EXCEPTION
==========================================================

1. DEFINITION
----------------------------------------------------------
A Custom Exception is a user-defined exception created
by extending an existing exception class.

It is used when Java's built-in exceptions do not clearly
represent a specific application/business problem.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Represents application-specific errors
- Makes error messages meaningful
- Helps enforce business rules
- Improves code readability
- Makes exception handling more organized


3. TYPES
----------------------------------------------------------

1. Custom Checked Exception
   → extends Exception

2. Custom Unchecked Exception
   → extends RuntimeException


4. SYNTAX
----------------------------------------------------------

class MyException extends Exception {

    MyException(String message) {
        super(message);
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                "Age must be 18 or above"
            );
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try {

            checkAge(15);

        }
        catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }
    }
}

/*
OUTPUT:

Age must be 18 or above


6. REAL-WORLD EXAMPLE
----------------------------------------------------------

Banking:

InsufficientBalanceException

Login:

InvalidLoginException

E-commerce:

OutOfStockException

Student system:

InvalidMarksException


Example:

class InsufficientBalanceException
        extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}


7. IMPORTANT KEYWORDS
----------------------------------------------------------

extends
Exception
RuntimeException
throw
throws
super


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

Built-in Exception:

Java already provides it.

Example:

ArithmeticException
NullPointerException
IOException


Custom Exception:

Developer creates it for a specific application need.

Example:

InvalidAgeException
InsufficientBalanceException


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is a custom exception?

Answer:
A custom exception is a user-defined exception created by
extending Exception or RuntimeException.


Q2. How do you create a custom checked exception?

Answer:

class MyException extends Exception {
}


Q3. How do you create a custom unchecked exception?

Answer:

class MyException extends RuntimeException {
}


Q4. Why use custom exceptions?

Answer:
They allow us to represent application-specific errors
with meaningful names and messages.


Q5. What is the difference between checked and unchecked
custom exceptions?

Answer:

extends Exception
→ Checked exception

extends RuntimeException
→ Unchecked exception


Q6. Why is super(message) used?

Answer:
It passes the error message to the parent Exception class,
which allows methods such as getMessage() to retrieve it.


10. MY OWN EXAMPLE
----------------------------------------------------------

class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}


static void checkMarks(int marks)
        throws InvalidMarksException {

    if (marks < 0 || marks > 100) {

        throw new InvalidMarksException(
            "Marks must be between 0 and 100"
        );
    }
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Forgetting to extend Exception or RuntimeException.

❌ Confusing throw and throws.

❌ Creating custom exceptions for every tiny problem.

❌ Forgetting to declare a checked custom exception with
   throws when it is not handled inside the method.


12. ONE-LINE REVISION
----------------------------------------------------------
Custom Exception = User-defined exception for
application-specific errors.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Custom exceptions allow developers to create meaningful,
application-specific error types by extending Exception
or RuntimeException."

==========================================================
*/