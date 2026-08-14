/*
==========================================================
                    ENCAPSULATION
==========================================================

1. DEFINITION
----------------------------------------------------------
Encapsulation means wrapping data (variables) and methods
together inside a class and restricting direct access to
the data.

In Java, encapsulation is mainly achieved using:

    private variables
    public getter/setter methods


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Protects data from direct access
- Provides controlled access
- Improves security
- Makes code easier to maintain
- Allows validation before changing data


3. TYPES
----------------------------------------------------------
Encapsulation is generally implemented using:

1. Private variables
2. Public getter methods
3. Public setter methods


4. SYNTAX
----------------------------------------------------------

class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    // Private data
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Gaurav");
        s1.setAge(23);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

/*
OUTPUT:

Name: Gaurav
Age: 23


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Bank Account:

We should not allow anyone to directly change the balance.

private double balance;

Instead:

deposit()
withdraw()
getBalance()

can control how the balance is accessed or modified.

Example:

if (amount > 0) {
    balance += amount;
}


7. IMPORTANT KEYWORDS
----------------------------------------------------------
private
public
getter
setter
this


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

ENCAPSULATION
→ Hides and protects data
→ Achieved using private variables + public methods


ABSTRACTION
→ Hides implementation details
→ Shows only essential functionality


Example:

Encapsulation:
private int balance;

Abstraction:
withdraw() hides the internal withdrawal logic.


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is encapsulation?

Answer:
Encapsulation is the process of wrapping data and methods
together in a class and restricting direct access to the
data.


Q2. How is encapsulation achieved in Java?

Answer:
Using private variables and public getter/setter methods.


Q3. Why are variables made private?

Answer:
To prevent direct access and provide controlled access
through methods.


Q4. What is a getter?

Answer:
A method used to read/access the value of a private
variable.


Q5. What is a setter?

Answer:
A method used to modify/update the value of a private
variable.


Q6. What is the main benefit of encapsulation?

Answer:
Data hiding and controlled access to data.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create a BankAccount class:

private double balance;

Create:

deposit()
withdraw()
getBalance()

Allow withdrawal only when sufficient balance exists.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Making variables public:

public int age;

This allows direct modification.

Better:

private int age;


❌ Setter without validation:

public void setAge(int age) {
    this.age = age;
}

You can add validation when required.


❌ Thinking encapsulation means only using private.

Encapsulation is about:

DATA + CONTROLLED ACCESS

Private variables + appropriate methods are the common
implementation.


12. ONE-LINE REVISION
----------------------------------------------------------
Encapsulation = Data hiding + controlled access.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Encapsulation is an OOP principle that bundles data and
methods into a class and restricts direct access to the
data, typically using private variables and public
getter/setter methods."

==========================================================
*/