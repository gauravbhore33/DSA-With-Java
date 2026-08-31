/*
==========================================================
                       THROWS
==========================================================

1. DEFINITION
----------------------------------------------------------
`throws` is a Java keyword used in a method declaration
to declare that the method may throw one or more exceptions.

It tells the caller:
"This method may produce this exception."


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Declares possible exceptions
- Used mainly with checked exceptions
- Passes responsibility to the caller
- Makes method behavior clear


3. TYPES
----------------------------------------------------------
`throws` can declare:

1. One exception
2. Multiple exceptions


Example:

void readFile() throws IOException {
}

void test() throws IOException, SQLException {
}


4. SYNTAX
----------------------------------------------------------

returnType methodName() throws ExceptionType {
    // code
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

import java.io.IOException;

public class Throws {

    static void readFile() throws IOException {

        throw new IOException("File not found");
    }

    public static void main(String[] args) {

        try {

            readFile();

        }
        catch (IOException e) {

            System.out.println("Exception handled: "
                    + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

/*
OUTPUT:

Exception handled: File not found
Program continues...


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
A method that reads a file may encounter IOException.

Instead of handling it inside the method, we can declare:

static void readFile() throws IOException {
    // file operation
}

Then the caller can decide how to handle it.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
throws
IOException
try
catch


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

throw
----------------------------------------------------------
Actually throws an exception.

Example:

throw new IOException("File not found");


throws
----------------------------------------------------------
Declares that a method may throw an exception.

Example:

void readFile() throws IOException {
}


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is throws?

Answer:
`throws` is used in a method declaration to declare
exceptions that the method may throw.


Q2. Can throws declare multiple exceptions?

Answer:
Yes.

Example:

void test()
    throws IOException, SQLException {
}


Q3. Is throws mainly used with checked exceptions?

Answer:
Yes.

It is commonly used to declare checked exceptions.


Q4. Can throws be used with unchecked exceptions?

Answer:
Yes.

It can declare unchecked exceptions too, although it is
usually unnecessary.


Q5. Does throws handle the exception?

Answer:
No.

It only declares the exception.

The caller must handle it or further declare it.


Q6. Can main() use throws?

Answer:
Yes.

Example:

public static void main(String[] args)
        throws IOException {
}


10. MY OWN EXAMPLE
----------------------------------------------------------

static void withdraw(double balance, double amount)
        throws Exception {

    if (amount > balance) {

        throw new Exception("Insufficient balance");
    }

    System.out.println("Withdrawal successful");
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Thinking `throws` handles an exception.

It only declares it.


❌ Confusing:

throw
vs
throws


❌ Forgetting that checked exceptions must eventually be
   handled or declared.


12. ONE-LINE REVISION
----------------------------------------------------------
throws = Declares that a method may throw an exception.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"The throws keyword is used in a method declaration to
inform the caller that the method may throw one or more
exceptions, and the caller is responsible for handling
or further declaring them."

==========================================================
*/