/*
==========================================================
                 SINGLE INHERITANCE
==========================================================

1. DEFINITION
----------------------------------------------------------
Inheritance is an OOP concept where one class acquires
the properties and methods of another class.

Single inheritance means one child class inherits from
one parent class.

Parent  →  Child
Animal  →  Dog


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Code reusability
- Avoids duplicate code
- Creates a parent-child relationship
- Supports method overriding
- Helps achieve runtime polymorphism


3. TYPES
----------------------------------------------------------
Java supports:

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance

Java does NOT support multiple inheritance through
classes.


4. SYNTAX
----------------------------------------------------------

class Parent {
    // properties and methods
}

class Child extends Parent {
    // additional properties and methods
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

public class SingleInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();

        // Inherited method
        d.eat();

        // Child's own method
        d.bark();
    }
}

/*
OUTPUT:

Animal is eating
Dog is barking


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Parent class:

Vehicle

Common method:

start()


Child class:

Car

Additional method:

drive()


Car inherits the common functionality of Vehicle.

Vehicle
   ↓
  Car


7. IMPORTANT KEYWORDS
----------------------------------------------------------
extends
super
this

`extends` is the main keyword used for inheritance.

Example:

class Dog extends Animal


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

INHERITANCE
→ "IS-A" relationship
→ Child inherits from parent

Example:

Dog IS-A Animal


COMPOSITION
→ "HAS-A" relationship
→ One class contains another object

Example:

Car HAS-A Engine


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is inheritance?

Answer:
Inheritance is a mechanism where a child class acquires
properties and methods of a parent class.


Q2. Which keyword is used for inheritance?

Answer:
`extends`


Q3. What is single inheritance?

Answer:
When one child class inherits from one parent class.


Q4. Does Java support multiple inheritance using classes?

Answer:
No. Java does not support multiple inheritance through
classes because it can create ambiguity.


Q5. What are the benefits of inheritance?

Answer:
Code reusability, reduced duplication, method overriding,
and establishing an IS-A relationship.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create:

class Person {

    void speak() {
        System.out.println("Person can speak");
    }
}

class Student extends Person {

    void study() {
        System.out.println("Student is studying");
    }
}

Create a Student object and call both methods.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Using `extends` with objects.

Correct:

class Dog extends Animal


❌ Thinking private members are directly accessible
inside the child class.

Private members belong to the parent class and cannot be
directly accessed by the child.


❌ Confusing IS-A and HAS-A.

Dog IS-A Animal       → Inheritance
Car HAS-A Engine      → Composition


12. ONE-LINE REVISION
----------------------------------------------------------
Single Inheritance = One child class inherits from one
parent class using `extends`.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Single inheritance is a type of inheritance in which one
child class extends one parent class to reuse its
properties and methods."

==========================================================
*/