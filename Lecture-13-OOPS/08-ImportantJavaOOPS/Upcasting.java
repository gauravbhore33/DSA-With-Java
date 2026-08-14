/*
==========================================================
                      UPCASTING
==========================================================

1. DEFINITION
----------------------------------------------------------
Upcasting means converting a child class reference into a
parent class reference.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Supports runtime polymorphism
- Provides flexibility
- Allows parent references to hold child objects


3. TYPES
----------------------------------------------------------
Implicit upcasting:

Parent p = new Child();


4. SYNTAX
----------------------------------------------------------
Parent p = new Child();


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog runs");
    }
}

public class Upcasting {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();

        // a.run();  // ❌ Not accessible through Animal reference
    }
}

/*
OUTPUT:

Dog barks


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Animal a = new Dog();

A Dog IS-A Animal, so a Dog object can be referred to by
an Animal reference.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
extends
new


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
Upcasting:
Child → Parent

Downcasting:
Parent reference → Child reference


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. Is upcasting automatic?

Answer:
Yes.

Example:

Animal a = new Dog();


10. MY OWN EXAMPLE
----------------------------------------------------------
Vehicle v = new Car();


11. COMMON MISTAKES
----------------------------------------------------------
❌ Thinking the object becomes a parent object.

The actual object is still Dog.

Only the reference type is Animal.


12. ONE-LINE REVISION
----------------------------------------------------------
Upcasting = Child object referred to by Parent reference.

INTERVIEW LINE:
"Upcasting is assigning a child object to a parent
reference, and it is commonly used for runtime
polymorphism."
==========================================================
*/