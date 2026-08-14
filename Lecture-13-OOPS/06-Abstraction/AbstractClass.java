/*
==========================================================
                    ABSTRACT CLASS
==========================================================

1. DEFINITION
----------------------------------------------------------
An abstract class is a class declared using the
`abstract` keyword.

It can contain:
- Abstract methods (without body)
- Concrete methods (with body)
- Variables
- Constructors

An abstract class cannot be directly instantiated.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Provides common structure to child classes
- Hides unnecessary implementation details
- Allows partial abstraction
- Forces child classes to implement required behavior
- Promotes code reusability


3. TYPES
----------------------------------------------------------
Abstract class can contain:

1. Abstract method
2. Concrete method


Abstract method:
    void sound();

Concrete method:
    void eat() {
        System.out.println("Eating");
    }


4. SYNTAX
----------------------------------------------------------

abstract class Parent {

    abstract void method();

    void normalMethod() {
        // implementation
    }
}

class Child extends Parent {

    @Override
    void method() {
        // implementation
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

abstract class Animal {

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClass {

    public static void main(String[] args) {

        // Animal a = new Animal();  // ❌ Not allowed

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}

/*
OUTPUT:

Dog barks
Animal is eating


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Consider a payment system:

             Payment
            /       \
           /         \
      CreditCard      UPI

Payment can define common behavior:

abstract class Payment {

    abstract void makePayment();

    void receipt() {
        System.out.println("Receipt generated");
    }
}

Each payment type provides its own implementation
of makePayment().


7. IMPORTANT KEYWORDS
----------------------------------------------------------
abstract
extends
@Override


abstract class
→ Creates an abstract class.

abstract method
→ Method without implementation.

extends
→ Used by child class to inherit the abstract class.

@Override
→ Used when implementing an abstract method.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

ABSTRACT CLASS
→ Can have abstract + concrete methods
→ Can have constructors
→ Can have instance variables
→ Extended using `extends`


NORMAL CLASS
→ Can be instantiated
→ All methods can have implementations


INTERFACE
→ Mainly used to define a contract
→ A class implements it using `implements`
→ Supports multiple interface inheritance


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. Can we create an object of an abstract class?

Answer:
No.

Example:

Animal a = new Animal();

❌ Not allowed.


Q2. Can an abstract class have a constructor?

Answer:
Yes.

The constructor is called when a child class object
is created.


Q3. Can an abstract class have normal methods?

Answer:
Yes.

It can contain both abstract and concrete methods.


Q4. Can an abstract class have variables?

Answer:
Yes.


Q5. Can an abstract class have zero abstract methods?

Answer:
Yes.

A class can be declared abstract even if it does not
contain an abstract method.


Q6. What happens if a child class does not implement all
abstract methods?

Answer:
The child class must also be declared abstract.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create:

abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

Then:

Vehicle v = new Car();

v.start();
v.stop();


11. COMMON MISTAKES
----------------------------------------------------------

❌ Trying to create an object of an abstract class.

❌ Forgetting to implement an abstract method in a
   concrete child class.

❌ Using `implements` with an abstract class.

Correct:

class Dog extends Animal


❌ Thinking abstract class can contain only abstract
   methods.

It can contain both abstract and concrete methods.


12. ONE-LINE REVISION
----------------------------------------------------------
Abstract Class = A partially implemented class that
provides common functionality and forces child classes
to implement required behavior.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"An abstract class is a class declared with the abstract
keyword that cannot be instantiated and can contain both
abstract and concrete methods. It is used to provide
partial abstraction and common functionality to subclasses."

==========================================================
*/