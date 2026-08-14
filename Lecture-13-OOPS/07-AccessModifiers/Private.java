/*
==========================================================
                    PRIVATE ACCESS MODIFIER
==========================================================

1. DEFINITION
----------------------------------------------------------
`private` is an access modifier that restricts access to
the same class only.

It is the most restrictive access modifier in Java.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Provides data hiding
- Protects sensitive data
- Supports encapsulation
- Prevents direct access from other classes


3. TYPES
----------------------------------------------------------
Java has 4 access levels:

1. public
2. protected
3. default
4. private

private → Same class only


4. SYNTAX
----------------------------------------------------------

class Student {

    private int age;

    private void display() {
        System.out.println(age);
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

public class Private {

    private int age = 22;

    private void display() {
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {

        Private obj = new Private();

        obj.display();

        System.out.println(obj.age);
    }
}

/*
OUTPUT:

Age = 22
22


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
A bank account should protect its balance.

private double balance;

Other classes should not directly modify balance.

Instead, controlled methods can be provided:

public void deposit(double amount) {
    balance = balance + amount;
}

This is an important part of ENCAPSULATION.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
private
public

private:
→ Accessible only inside the same class.

public:
→ Can be used to provide controlled access through methods.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

private
→ Same class only


default
→ Same package


protected
→ Same package + subclass


public
→ Everywhere


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is private access modifier?

Answer:
`private` restricts access to the same class in which the
member is declared.


Q2. Can a private variable be accessed directly from
another class?

Answer:
No.


Q3. Can a private method be overridden?

Answer:
No.

Private methods are not inherited by subclasses.


Q4. Can a top-level class be private?

Answer:
No.

A top-level class cannot be private.


Q5. How can we access private variables?

Answer:
Usually through public getter and setter methods.


10. MY OWN EXAMPLE
----------------------------------------------------------

class Student {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

This provides controlled access to the private variable.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Trying to access a private variable directly:

Student s = new Student();

System.out.println(s.name);

Not allowed from outside Student.


❌ Making sensitive data public.

Prefer private variables with controlled access.


12. ONE-LINE REVISION
----------------------------------------------------------
private = Accessible only inside the same class.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"The private access modifier provides the highest level of
data hiding by allowing a member to be accessed only within
the class where it is declared."

==========================================================
*/