/*
==========================================================
                  PROTECTED ACCESS MODIFIER
==========================================================

1. DEFINITION
----------------------------------------------------------
`protected` allows a member to be accessed:

1. Within the same class
2. Within the same package
3. In a subclass from another package


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Allows controlled access to child classes
- Useful in inheritance
- Allows subclasses to reuse parent class members
- Provides more access than private but less than public


3. TYPES
----------------------------------------------------------
Java has 4 access levels:

public     → Everywhere
protected  → Same package + subclasses
default    → Same package
private    → Same class


4. SYNTAX
----------------------------------------------------------

class Parent {

    protected int value = 10;

    protected void display() {
        System.out.println(value);
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Parent {

    protected int value = 100;

    protected void display() {
        System.out.println("Value = " + value);
    }
}

class Child extends Parent {

    void show() {

        // Accessible because Child extends Parent
        System.out.println(value);

        display();
    }
}

public class Protected {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.show();
    }
}

/*
OUTPUT:

100
Value = 100


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose we have:

class Vehicle {

    protected int speed;
}

class Car extends Vehicle {

    void increaseSpeed() {
        speed = speed + 10;
    }
}

The child class can directly use the protected member
because it inherits from Vehicle.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
protected
extends

protected
→ Provides access to the same package and subclasses.

extends
→ Creates inheritance between parent and child classes.


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

Q1. What is protected access modifier?

Answer:
`protected` allows access within the same package and also
allows subclasses to access the member.


Q2. Can a protected member be accessed from another package?

Answer:
Yes, but a subclass in that other package can access it
through inheritance.


Q3. Can protected members be accessed by non-subclasses
from another package?

Answer:
No, not through ordinary direct access.


Q4. Why is protected commonly used with inheritance?

Answer:
It allows child classes to access and reuse parent class
members while keeping them less accessible than public.


Q5. Can a protected method be overridden?

Answer:
Yes.

A protected method can be overridden by a child class.


10. MY OWN EXAMPLE
----------------------------------------------------------

class Employee {

    protected double salary = 30000;
}

class Developer extends Employee {

    void showSalary() {
        System.out.println(salary);
    }
}

The Developer class can access salary because it extends
Employee.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Thinking protected means "accessible everywhere".

It is NOT the same as public.


❌ Thinking protected is accessible directly from any
class in another package.

It is not.


❌ Forgetting the inheritance relationship when accessing
a protected member from another package.


12. ONE-LINE REVISION
----------------------------------------------------------
protected = Same package + subclass access.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"The protected access modifier allows a member to be
accessed within the same package and by subclasses, even
when those subclasses are in a different package."

==========================================================
*/