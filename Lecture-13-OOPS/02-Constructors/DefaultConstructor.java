/*
==========================================================
              DEFAULT CONSTRUCTOR
==========================================================

1. DEFINITION
----------------------------------------------------------
A default constructor is a constructor with no parameters.

If we do not write any constructor in a class, Java
automatically provides a default constructor.

It initializes instance variables with their default values.


2. WHY DO WE NEED IT?
----------------------------------------------------------
It allows us to create an object without providing values.

Example:

Student s = new Student();


3. TYPES
----------------------------------------------------------
Constructors commonly include:

1. Default / no-argument constructor
2. Parameterized constructor

Note:
If you write no constructor, Java provides a default
constructor automatically.


4. SYNTAX
----------------------------------------------------------

class Student {

    Student() {
        // constructor body
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    String name;
    int age;

    // No-argument constructor
    Student() {
        System.out.println("Constructor called");
    }
}

public class DefaultConstructor {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}

/*
OUTPUT:

Constructor called
Name: null
Age: 0


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose a Student object should be created first and its
details will be assigned later.

Student s1 = new Student();

s1.name = "Gaurav";
s1.age = 23;


7. IMPORTANT KEYWORDS
----------------------------------------------------------
Constructor:
- Same name as class
- No return type
- Called automatically when object is created
- Used to initialize objects

new:
Creates the object and invokes its constructor.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

DEFAULT CONSTRUCTOR
→ No parameters
→ Can be automatically provided by Java

PARAMETERIZED CONSTRUCTOR
→ Accepts parameters
→ Used to initialize an object with specific values


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is a constructor?

A constructor is a special member of a class used to
initialize an object. It has the same name as the class
and does not have a return type.


Q2. Does a constructor have a return type?

No. Not even void.


Q3. When is a constructor called?

It is called automatically when an object is created.


Q4. What happens if we don't write any constructor?

Java provides a default constructor automatically.


Q5. What is the difference between a constructor and
a method?

Constructor:
→ Initializes an object
→ Same name as class
→ No return type
→ Automatically called during object creation

Method:
→ Performs an operation/behavior
→ Can have any valid name
→ Has a return type or void
→ Called explicitly


10. MY OWN EXAMPLE
----------------------------------------------------------
Create:

class Car {

    String brand;
    int speed;

    Car() {
        System.out.println("Car object created");
    }
}

Create two Car objects and verify that the constructor
runs automatically.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Writing a return type:

void Student() { }

This is a method, NOT a constructor.

Correct:

Student() { }


❌ Constructor name different from class name.

class Student {

    Student() { }  // Correct
}


❌ Thinking constructor is called manually.

new Student();

automatically calls the constructor.


12. ONE-LINE REVISION
----------------------------------------------------------
Constructor = Special block automatically called when an
object is created to initialize the object.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"A constructor is a special member of a class that has the
same name as the class, has no return type, and is invoked
automatically when an object is created."

==========================================================
*/