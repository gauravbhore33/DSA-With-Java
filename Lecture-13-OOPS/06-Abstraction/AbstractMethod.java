/*
==========================================================
                  ABSTRACT METHOD
==========================================================

1. DEFINITION
----------------------------------------------------------
An abstract method is a method declared with the
`abstract` keyword that has NO method body.

The child class must provide its implementation.

Example:

abstract void sound();


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Forces child classes to implement required behavior
- Provides abstraction
- Defines WHAT a class must do without defining HOW
- Useful when different child classes need different
  implementations


3. TYPES
----------------------------------------------------------
Abstract method is mainly used inside:

1. Abstract class
2. Interface

Example:

abstract class Animal {
    abstract void sound();
}


4. SYNTAX
----------------------------------------------------------

abstract class Parent {

    abstract void method();
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

    abstract void sound();
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

public class AbstractMethod {

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

abstract class Payment {

    abstract void makePayment();
}

Different payment methods implement it differently:

CreditCard → Card payment
UPI        → UPI payment
Cash       → Cash payment

The parent defines WHAT to do.
The child defines HOW to do it.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
abstract
extends
@Override


abstract
→ Declares an abstract method.

extends
→ Used when a child class inherits an abstract class.

@Override
→ Indicates that the child is implementing/overriding
  the abstract method.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

ABSTRACT METHOD:

abstract void sound();

→ No body
→ Must be implemented by concrete child class


CONCRETE METHOD:

void sound() {
    System.out.println("Sound");
}

→ Has a body
→ Implementation already exists


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is an abstract method?

Answer:
An abstract method is a method declared using the
abstract keyword without a body. Its implementation is
provided by the child class.


Q2. Can an abstract method have a body?

Answer:
No.

An abstract method does not have an implementation body.


Q3. Where can abstract methods be declared?

Answer:
They can be declared in abstract classes and interfaces.


Q4. Can we create an object of a class containing an
abstract method?

Answer:
If the class is abstract, we cannot directly create its
object.


Q5. What happens if a child class does not implement an
abstract method?

Answer:
The child class must also be declared abstract.


Q6. Can an abstract method be private?

Answer:
No.

A private method cannot be overridden, so it cannot be
abstract.


10. MY OWN EXAMPLE
----------------------------------------------------------

abstract class Vehicle {

    abstract void start();
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts");
    }
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Giving a body to an abstract method:

abstract void sound() {
    System.out.println("Sound");
}

Not allowed.


❌ Forgetting the abstract keyword:

void sound();

Not valid as an abstract method in a class.


❌ Creating an object directly:

Animal a = new Animal();

Not allowed if Animal is abstract.


12. ONE-LINE REVISION
----------------------------------------------------------
Abstract Method = A method without a body that forces
child classes to provide their own implementation.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"An abstract method is a method declared without an
implementation, and its concrete subclass must provide
the implementation."

==========================================================
*/