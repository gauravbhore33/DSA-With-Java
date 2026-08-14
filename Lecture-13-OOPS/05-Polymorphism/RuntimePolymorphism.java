/*
==========================================================
                RUNTIME POLYMORPHISM
==========================================================

1. DEFINITION
----------------------------------------------------------
Runtime polymorphism occurs when the method to be executed
is decided at runtime based on the actual object.

It is mainly achieved using METHOD OVERRIDING.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Provides flexibility
- Supports dynamic method dispatch
- Allows parent reference to hold child objects
- Makes code easier to extend
- Very important in real-world Java applications


3. TYPES
----------------------------------------------------------
Runtime polymorphism is mainly achieved through:

1. Method Overriding
2. Dynamic Method Dispatch


4. SYNTAX
----------------------------------------------------------

Parent reference = new Child();

parentReference.method();


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

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}

/*
OUTPUT:

Dog barks
Cat meows


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Payment system:

            Payment
            /     \
           /       \
      CreditCard   UPI

Both classes override:

makePayment()


Payment p;

p = new CreditCard();
p.makePayment();

p = new UPI();
p.makePayment();

The method executed depends on the actual object.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
extends
@Override
new

Important concept:

Dynamic Method Dispatch


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

COMPILE-TIME POLYMORPHISM
→ Method Overloading
→ Decision at compile time


RUNTIME POLYMORPHISM
→ Method Overriding
→ Decision at runtime


Example:

Compile-time:

add(10, 20)
add(10, 20, 30)


Runtime:

Animal a = new Dog();
a.sound();

Animal a = new Cat();
a.sound();


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is runtime polymorphism?

Answer:
Runtime polymorphism is a mechanism where the method call
is resolved at runtime based on the actual object.


Q2. How is runtime polymorphism achieved in Java?

Answer:
Using method overriding and dynamic method dispatch.


Q3. What is dynamic method dispatch?

Answer:
It is the mechanism by which a call to an overridden
method is resolved at runtime based on the actual object.


Q4. Can a parent reference hold a child object?

Answer:
Yes.

Example:

Animal a = new Dog();


Q5. Which method is called here?

Animal a = new Dog();
a.sound();

Answer:
The overridden `Dog.sound()` method is called.


Q6. Why is runtime polymorphism useful?

Answer:
It allows the same parent reference to work with different
child objects and execute their specific implementations.


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
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts");
    }
}

Use:

Vehicle v;

v = new Car();
v.start();

v = new Bike();
v.start();


11. COMMON MISTAKES
----------------------------------------------------------

❌ Thinking method selection always happens at compile time.

For overridden instance methods, the implementation is
selected at runtime based on the actual object.


❌ Writing:

Dog d = new Dog();

This alone does not demonstrate runtime polymorphism.

Better:

Animal a = new Dog();


❌ Confusing overloading and overriding.

Overloading  → Compile time
Overriding   → Runtime


12. ONE-LINE REVISION
----------------------------------------------------------
Runtime Polymorphism = Parent reference + Child object +
Method overriding → method decided at runtime.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Runtime polymorphism is achieved through method overriding,
where a parent reference can refer to a child object and
the overridden method is selected at runtime based on the
actual object."

==========================================================
*/