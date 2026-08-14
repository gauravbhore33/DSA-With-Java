/*
==========================================================
                      INTERFACE
==========================================================

1. DEFINITION
----------------------------------------------------------
An interface is a blueprint/contract that defines what a
class must do.

A class uses the `implements` keyword to implement an
interface.

It is mainly used to achieve abstraction and multiple
inheritance in Java.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Provides abstraction
- Defines a common contract
- Supports multiple inheritance
- Reduces dependency between classes
- Makes code flexible and easier to maintain


3. TYPES
----------------------------------------------------------
An interface can contain:

1. Abstract methods
2. default methods
3. static methods
4. constants

Important:
Interface variables are public, static and final by
default.


4. SYNTAX
----------------------------------------------------------

interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interface {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}

/*
OUTPUT:

Dog barks


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose we have a Payment interface:

interface Payment {

    void pay();
}

Different payment systems implement it:

CreditCard
UPI
NetBanking

Each class must provide its own implementation of pay().

The interface defines WHAT to do.
The implementing class defines HOW to do it.


7. IMPORTANT KEYWORDS
----------------------------------------------------------

interface
→ Used to create an interface.

implements
→ Used by a class to implement an interface.

default
→ Used to provide a default method implementation.

static
→ Used to create a static interface method.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

INTERFACE
→ Implemented using `implements`
→ Supports multiple interfaces
→ Used for abstraction/contracts
→ Interface cannot be directly instantiated


ABSTRACT CLASS
→ Extended using `extends`
→ Can have constructors and instance variables
→ Can contain abstract + concrete methods
→ A class can extend only one class


Example:

interface A { }
interface B { }

class C implements A, B {
}

✅ Multiple interfaces are allowed.


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is an interface?

Answer:
An interface is a blueprint or contract that defines
behavior that implementing classes must provide.


Q2. Which keyword is used to implement an interface?

Answer:

implements


Q3. Can a class implement multiple interfaces?

Answer:

Yes.

Example:

class Smartphone implements Camera, MusicPlayer {
}


Q4. Can we create an object of an interface?

Answer:

No.

We cannot directly instantiate an interface.


Q5. Are interface methods public by default?

Answer:

Abstract methods in an interface are public by default.


Q6. Are interface variables changeable?

Answer:

No.

Interface variables are public, static and final by
default.


Q7. Can an interface contain concrete methods?

Answer:

Yes.

Modern Java interfaces can contain `default` and `static`
methods with implementations.


10. MY OWN EXAMPLE
----------------------------------------------------------

interface Vehicle {

    void start();

    void stop();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Using `extends` to implement an interface:

class Dog extends AnimalInterface

Wrong when AnimalInterface is an interface.

Correct:

class Dog implements AnimalInterface


❌ Forgetting `public` when implementing an interface
method.

Interface methods are public, so the implementation cannot
reduce the visibility.


❌ Trying to create an interface object:

Animal a = new Animal();

Not allowed.


12. ONE-LINE REVISION
----------------------------------------------------------
Interface = A contract that defines required behavior,
implemented by classes using the `implements` keyword.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"An interface is a contract that provides abstraction and
defines behavior that implementing classes must provide.
A class can implement multiple interfaces, which is one
way Java supports multiple inheritance."

==========================================================
*/