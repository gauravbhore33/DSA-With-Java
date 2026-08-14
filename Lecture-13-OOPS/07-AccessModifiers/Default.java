/*
==========================================================
                  DEFAULT ACCESS MODIFIER
==========================================================

1. DEFINITION
----------------------------------------------------------
When no access modifier is specified, Java uses the
default (package-private) access level.

A default member can be accessed only within the same
package.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Keeps members accessible within the package
- Provides package-level data hiding
- Useful when classes in the same package need to
  communicate with each other


3. TYPES
----------------------------------------------------------
Java has 4 access levels:

public     → Everywhere
protected  → Same package + subclasses
default    → Same package
private    → Same class


4. SYNTAX
----------------------------------------------------------

class Student {

    int age = 22;       // default

    void display() {    // default
        System.out.println(age);
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    int age = 22;   // default

    void display() {    // default
        System.out.println("Age = " + age);
    }
}

public class Default {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.age);
        s.display();
    }
}

/*
OUTPUT:

22
Age = 22


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose we have two classes in the same package:

Student.java
Teacher.java

If Student has:

String name = "Gaurav";

Teacher can access name because both classes belong to
the same package.

A class from another package cannot directly access it.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
No keyword is required.

Default access is used simply by NOT writing:

public
private
protected


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

private
→ Same class only


default
→ Same package only


protected
→ Same package + subclasses


public
→ Everywhere


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is the default access modifier?

Answer:
When no access modifier is specified, the member gets
default (package-private) access.


Q2. Where can default members be accessed?

Answer:
Only within the same package.


Q3. Can a default member be accessed from another package?

Answer:
No.


Q4. Can a top-level class have default access?

Answer:
Yes.

Example:

class Student {
}


Q5. What is another name for default access?

Answer:
Package-private.


Q6. Is "default" a keyword used to declare default access?

Answer:
No.

You simply don't write an access modifier.


10. MY OWN EXAMPLE
----------------------------------------------------------

class Employee {

    String name = "Gaurav";

    void displayName() {
        System.out.println(name);
    }
}

class Test {

    public static void main(String[] args) {

        Employee e = new Employee();

        System.out.println(e.name);
        e.displayName();
    }
}

If both classes are in the same package, this works.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Writing:

default int age;

This is NOT how default access is declared.

Correct:

int age;


❌ Thinking default means accessible everywhere.

Default means SAME PACKAGE ONLY.


❌ Confusing default with protected.

default   → Same package
protected → Same package + subclass access


12. ONE-LINE REVISION
----------------------------------------------------------
Default = No modifier + accessible only within the same
package.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Default access, also called package-private access, is
applied when no access modifier is specified, and the
member can be accessed only within the same package."

==========================================================
*/