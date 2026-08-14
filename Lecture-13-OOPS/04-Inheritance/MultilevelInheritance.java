/*
==========================================================
                MULTILEVEL INHERITANCE
==========================================================

1. DEFINITION
----------------------------------------------------------
Multilevel inheritance occurs when a class inherits from
another child class, forming a chain of inheritance.

Example:

Animal
   ↓
Dog
   ↓
Puppy


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Code reusability
- Avoids duplicate code
- Creates a hierarchical relationship
- Allows a class to reuse features from multiple levels


3. TYPES
----------------------------------------------------------
Inheritance chain:

Grandparent → Parent → Child


4. SYNTAX
----------------------------------------------------------

class A {
}

class B extends A {
}

class C extends B {
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

class Puppy extends Dog {

    void play() {
        System.out.println("Puppy is playing");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();   // From Animal
        p.bark();  // From Dog
        p.play();  // From Puppy
    }
}

/*
OUTPUT:

Animal is eating
Dog is barking
Puppy is playing


6. REAL-WORLD EXAMPLE
----------------------------------------------------------

Person
   ↓
Employee
   ↓
Manager

Person:
    name

Employee:
    employeeId

Manager:
    teamSize

Manager can access features inherited from both
Employee and Person.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
extends
super


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

SINGLE INHERITANCE:

A
↓
B

One parent → one child


MULTILEVEL INHERITANCE:

A
↓
B
↓
C

Inheritance happens through multiple levels.


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is multilevel inheritance?

Answer:
Multilevel inheritance is a type of inheritance where a
class inherits from another derived class, forming an
inheritance chain.

Q2. Does Java support multilevel inheritance?

Answer:
Yes.

Q3. Give an example.

Answer:

Animal
   ↓
Dog
   ↓
Puppy

Q4. How many classes can be involved?

Answer:
There is no fixed limit to the number of inheritance
levels, although excessive inheritance can make code
difficult to maintain.


10. MY OWN EXAMPLE
----------------------------------------------------------

Create:

Person
   ↓
Student
   ↓
MCAStudent

Person:
    speak()

Student:
    study()

MCAStudent:
    code()


11. COMMON MISTAKES
----------------------------------------------------------

❌ Confusing multilevel with multiple inheritance.

Multilevel:

A → B → C


Multiple:

A + B → C

Java does not support multiple inheritance using classes.


12. ONE-LINE REVISION
----------------------------------------------------------
Multilevel Inheritance = A chain where a class inherits
from a class that already inherits from another class.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Multilevel inheritance is an inheritance hierarchy in
which a derived class becomes the parent of another class,
forming a chain such as A → B → C."

==========================================================
*/