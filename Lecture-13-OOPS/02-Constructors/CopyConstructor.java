/*
==========================================================
                 COPY CONSTRUCTOR
==========================================================

1. DEFINITION
----------------------------------------------------------
A copy constructor is a constructor that creates a new
object by copying values from another object of the same
class.

Java does not provide a built-in copy constructor.
We create it manually.


2. WHY DO WE NEED IT?
----------------------------------------------------------
To create a new object with the same state/data as an
existing object.


3. TYPES
----------------------------------------------------------
In Java, we commonly create it manually:

Student(Student other) {
    this.name = other.name;
    this.age = other.age;
}


4. SYNTAX
----------------------------------------------------------

ClassName(ClassName other) {

    this.variable = other.variable;
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class CopyConstructor {

    public static void main(String[] args) {

        Student s1 = new Student("Gaurav", 23);

        // Copy s1's data into a new object
        Student s2 = new Student(s1);

        s1.display();

        System.out.println();

        s2.display();
    }
}

/*
OUTPUT:

Name: Gaurav
Age: 23

Name: Gaurav
Age: 23


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose we have an Employee object:

Employee e1 = new Employee("Gaurav", 101);

We want another Employee with the same initial data:

Employee e2 = new Employee(e1);


7. IMPORTANT KEYWORDS
----------------------------------------------------------
this
new


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

NORMAL CONSTRUCTOR:

Student(String name, int age)

→ Takes individual values.


COPY CONSTRUCTOR:

Student(Student other)

→ Takes another object and copies its values.


Example:

Student s1 = new Student("Gaurav", 23);

Student s2 = new Student(s1);


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. Does Java provide a built-in copy constructor?

Answer:
No. We need to define one manually if required.


Q2. What is a copy constructor?

Answer:
A constructor that initializes a new object using the
state of another object of the same class.


Q3. Is copy constructor the same as clone()?

Answer:
No.

A copy constructor is a constructor written by the
developer, while clone() is a method defined through
Java's cloning mechanism.


Q4. Does a copy constructor create a new object?

Answer:
Yes.

The new object gets its own identity.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create:

class Car {

    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    Car(Car other) {
        this.brand = other.brand;
        this.price = other.price;
    }
}

Create one Car and copy it into another Car object.


11. COMMON MISTAKES
----------------------------------------------------------

❌ This does NOT create a new object:

Student s2 = s1;

Both references point to the same object.


Correct copy constructor:

Student s2 = new Student(s1);

Now s2 is a separate object.


12. ONE-LINE REVISION
----------------------------------------------------------
Copy Constructor = Creates a new object by copying the
state of an existing object.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Java does not provide a built-in copy constructor. We can
define one ourselves to initialize a new object using the
state of another object of the same class."

==========================================================
*/