/*
==========================================================
             HIERARCHICAL INHERITANCE
==========================================================

1. DEFINITION
----------------------------------------------------------
Hierarchical inheritance occurs when multiple child classes
inherit from the same parent class.

Example:

             Animal
             /    \
           Dog     Cat


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Reuse common code
- Avoid duplicate code
- Share common properties and methods
- Allow each child to have its own behavior


3. TYPES
----------------------------------------------------------
One parent → Multiple children

        A
       / \
      B   C


4. SYNTAX
----------------------------------------------------------

class Parent {
}

class Child1 extends Parent {
}

class Child2 extends Parent {
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();    // Inherited from Animal
        d.bark();   // Dog's own method

        System.out.println();

        Cat c = new Cat();

        c.eat();    // Inherited from Animal
        c.meow();   // Cat's own method
    }
}

/*
OUTPUT:

Animal is eating
Dog is barking

Animal is eating
Cat is meowing


6. REAL-WORLD EXAMPLE
----------------------------------------------------------

             Employee
             /      \
        Developer   Tester

Employee:
    name
    salary
    work()

Developer:
    writeCode()

Tester:
    testSoftware()

Both Developer and Tester reuse common functionality
from Employee.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
extends
super


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

SINGLE:

A
↓
B


MULTILEVEL:

A
↓
B
↓
C


HIERARCHICAL:

      A
     / \
    B   C


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is hierarchical inheritance?

Answer:
When multiple child classes inherit from the same parent
class.


Q2. Does Java support hierarchical inheritance?

Answer:
Yes.


Q3. Give an example.

Answer:

        Animal
        /    \
      Dog    Cat


Q4. What is the main benefit?

Answer:
Common functionality can be written once in the parent
class and reused by multiple child classes.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create:

        Vehicle
        /     \
      Car     Bike

Vehicle:
    start()

Car:
    drive()

Bike:
    ride()


11. COMMON MISTAKES
----------------------------------------------------------

❌ Confusing hierarchical with multilevel.

Hierarchical:

        A
       / \
      B   C

Multilevel:

        A
        ↓
        B
        ↓
        C


12. ONE-LINE REVISION
----------------------------------------------------------
Hierarchical Inheritance = Multiple child classes inherit
from the same parent class.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Hierarchical inheritance occurs when multiple subclasses
inherit common properties and methods from a single
superclass."

==========================================================
*/