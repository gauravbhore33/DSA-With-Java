/*
==========================================================
                 METHOD OVERRIDING
==========================================================

1. DEFINITION
----------------------------------------------------------
Method overriding occurs when a child class provides its
own implementation of a method that is already defined
in the parent class.

The method must have the same name and same parameters.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Allows a child class to provide its own behavior
- Supports runtime polymorphism
- Makes code flexible and extensible
- Allows parent references to execute child behavior


3. TYPES
----------------------------------------------------------
Method overriding is mainly associated with:

Runtime Polymorphism
        ↓
Method Overriding


4. SYNTAX
----------------------------------------------------------

class Parent {

    void display() {
        // parent implementation
    }
}

class Child extends Parent {

    @Override
    void display() {
        // child implementation
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();
    }
}

/*
OUTPUT:

Dog barks
Cat meows


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose we have:

Payment
   ↓
CreditCardPayment
   ↓
UPIPayment

Each payment type can have its own implementation of:

makePayment()


7. IMPORTANT KEYWORDS
----------------------------------------------------------
extends
@Override
super


@Override
→ Indicates that the child class is overriding a parent
  class method.


super.method()
→ Can be used when we want to call the parent version.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

METHOD OVERLOADING
→ Same method name
→ Different parameters
→ Compile-time polymorphism


METHOD OVERRIDING
→ Same method name
→ Same parameters
→ Parent-child relationship
→ Runtime polymorphism


Example:

Overloading:

add(int a, int b)
add(int a, int b, int c)


Overriding:

Animal.sound()
Dog.sound()


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is method overriding?

Answer:
Method overriding occurs when a child class provides its
own implementation of a method already defined in the
parent class.


Q2. Is method overriding compile-time or runtime
polymorphism?

Answer:
Runtime polymorphism.


Q3. What is the purpose of @Override?

Answer:
It tells the compiler that the method is intended to
override a parent class method. It also helps detect
mistakes in the method signature.


Q4. Can a static method be overridden?

Answer:
No.

Static methods are hidden, not overridden.


Q5. Can a final method be overridden?

Answer:
No.

A final method cannot be overridden.


Q6. Can a private method be overridden?

Answer:
No.

Private methods are not accessible to child classes.


Q7. Can we reduce the access level while overriding?

Answer:
No.

The child method cannot have more restrictive access than
the parent method.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create:

class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

Create a Car object and call start().


11. COMMON MISTAKES
----------------------------------------------------------

❌ Different parameters:

Parent:
void display(int a)

Child:
void display(String a)

This is NOT overriding.
It is overloading.


❌ Different method name:

Parent:
void display()

Child:
void show()

Not overriding.


❌ Removing inheritance:

Overriding requires a parent-child relationship.


12. ONE-LINE REVISION
----------------------------------------------------------
Method Overriding = Same method signature + inheritance +
different implementation in child class.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Method overriding is a runtime polymorphism mechanism in
which a child class provides its own implementation of a
method defined in its parent class."

==========================================================
*/