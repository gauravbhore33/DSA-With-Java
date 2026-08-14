/*
==========================================================
                     DOWNCASTING
==========================================================

1. DEFINITION
----------------------------------------------------------
Downcasting means converting a parent reference into a
child class reference.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Allows access to child-specific methods
- Useful when the actual object is a child object


3. TYPES
----------------------------------------------------------
Explicit downcasting:

Child c = (Child) parentReference;


4. SYNTAX
----------------------------------------------------------
Parent p = new Child();

Child c = (Child) p;


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

public class Downcasting {

    public static void main(String[] args) {

        Animal a = new Dog();

        Dog d = (Dog) a;

        d.sound();
        d.run();
    }
}

/*
OUTPUT:

Dog barks
Dog runs


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Animal a = new Dog();

If we need a Dog-specific method:

a.run();       // ❌

Dog d = (Dog) a;
d.run();       // ✅


7. IMPORTANT KEYWORDS
----------------------------------------------------------
(Child)
instanceof


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
Upcasting:
Child → Parent
Usually automatic


Downcasting:
Parent reference → Child
Explicit cast required


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. What happens if we downcast an object to the wrong
child type?

Answer:
A ClassCastException occurs at runtime.


Example:

Animal a = new Cat();

Dog d = (Dog) a;   // ❌ ClassCastException


10. MY OWN EXAMPLE
----------------------------------------------------------
Vehicle v = new Car();

Car c = (Car) v;

Use c to access Car-specific methods.


11. COMMON MISTAKES
----------------------------------------------------------
❌ Downcasting without checking the actual object.

Use:

if (a instanceof Dog) {
    Dog d = (Dog) a;
}


❌ Thinking downcasting changes the actual object.

It only changes the reference type.


12. ONE-LINE REVISION
----------------------------------------------------------
Downcasting = Converting a parent reference into a child
reference using explicit casting.

INTERVIEW LINE:
"Downcasting allows us to access child-specific members,
but it is safe only when the actual object is an instance
of that child class."
==========================================================
*/