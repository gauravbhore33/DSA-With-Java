/*
==========================================================
                  SUPER KEYWORD
==========================================================

1. DEFINITION
----------------------------------------------------------
`super` refers to the immediate parent class object.

It is mainly used to access members of the parent class.


2. WHY DO WE NEED IT?
----------------------------------------------------------
We use `super` when we need to:

1. Access parent class variable
2. Call parent class method
3. Call parent class constructor


3. TYPES
----------------------------------------------------------
1. super.variable
2. super.method()
3. super()


4. SYNTAX
----------------------------------------------------------

super.variable;

super.method();

super();


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Animal {

    String name = "Animal";

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    String name = "Dog";

    void display() {

        // Child class variable
        System.out.println("Child: " + name);

        // Parent class variable
        System.out.println("Parent: " + super.name);

        // Parent class method
        super.sound();
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.display();
    }
}

/*
OUTPUT:

Child: Dog
Parent: Animal
Animal makes sound


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose:

Employee
   ↓
Manager

Both classes have a `salary` variable.

If Manager wants to access the Employee's salary:

super.salary;


7. IMPORTANT KEYWORDS
----------------------------------------------------------
super
extends
this

Important difference:

this  → current class object
super → immediate parent class object


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

this
→ Refers to current class object.

super
→ Refers to immediate parent class object.


Example:

this.name
→ Current class variable

super.name
→ Parent class variable


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is `super` in Java?

Answer:
`super` is a reference keyword used to access members of
the immediate parent class.


Q2. What are the three uses of `super`?

Answer:

super.variable
super.method()
super()


Q3. Can `super()` and `this()` be used together in the
same constructor?

Answer:
No. Both must be the first statement of a constructor.


Q4. Which parent does `super` refer to?

Answer:
Only the immediate parent class.


10. MY OWN EXAMPLE
----------------------------------------------------------

Create:

class Vehicle {

    int speed = 100;

    void display() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {

    int speed = 200;

    void show() {

        System.out.println(speed);
        System.out.println(super.speed);

        super.display();
    }
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Confusing `this` and `super`.

this → current class
super → parent class


❌ Thinking `super` refers to any ancestor.

It refers only to the immediate parent.


❌ Using `super()` anywhere inside a constructor.

It must be the FIRST statement.


12. ONE-LINE REVISION
----------------------------------------------------------
super = Used to access the immediate parent class's
variable, method, or constructor.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"`super` is a reference keyword used to access the immediate
parent class's variables, methods, and constructor."

==========================================================
*/