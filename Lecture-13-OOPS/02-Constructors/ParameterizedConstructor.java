/*
==========================================================
             PARAMETERIZED CONSTRUCTOR
==========================================================

1. DEFINITION
----------------------------------------------------------
A parameterized constructor is a constructor that accepts
parameters to initialize an object's instance variables.


2. WHY DO WE NEED IT?
----------------------------------------------------------
It allows us to create objects with different initial
values directly during object creation.


3. TYPES
----------------------------------------------------------
Constructors:

1. No-argument constructor
2. Parameterized constructor


4. SYNTAX
----------------------------------------------------------

ClassName(dataType parameter) {

    this.variable = parameter;
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

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {

        Student s1 = new Student("Gaurav", 23);
        Student s2 = new Student("Rahul", 22);

        s1.display();

        System.out.println();

        s2.display();
    }
}

/*
OUTPUT:

Name: Gaurav
Age: 23

Name: Rahul
Age: 22


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
When creating an Employee, we can provide employee details
at the time of object creation.

Employee e1 = new Employee("Gaurav", 101, 600000);


7. IMPORTANT KEYWORDS
----------------------------------------------------------
this
new

this.variable = parameter;


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

DEFAULT / NO-ARGUMENT CONSTRUCTOR
→ Takes no parameters

Student s = new Student();


PARAMETERIZED CONSTRUCTOR
→ Takes parameters

Student s = new Student("Gaurav", 23);


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is a parameterized constructor?

A constructor that accepts parameters to initialize the
instance variables of an object.


Q2. Why is `this` commonly used in a parameterized
constructor?

To distinguish instance variables from constructor
parameters when they have the same name.

Example:

this.name = name;


Q3. Can a class have multiple constructors?

Yes. This is called constructor overloading.


Q4. What happens if we define only a parameterized
constructor?

Java will NOT automatically provide a default constructor.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create:

class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

Create two Employee objects with different values.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Wrong:

Student(String name, int age) {

    name = name;
    age = age;
}

This does not initialize the instance variables correctly.

Correct:

this.name = name;
this.age = age;


❌ Adding a return type:

void Student(String name) { }

This becomes a method, not a constructor.


12. ONE-LINE REVISION
----------------------------------------------------------
Parameterized constructor = Constructor that initializes an
object using values supplied during object creation.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"A parameterized constructor accepts arguments and uses
them to initialize the state of an object at the time of
object creation."

==========================================================
*/