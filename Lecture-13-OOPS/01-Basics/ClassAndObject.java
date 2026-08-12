/*
==========================================================
                 CLASS AND OBJECT
==========================================================

1. DEFINITION
----------------------------------------------------------
Class:
A class is a blueprint/template used to create objects.
It defines the data (variables) and behavior (methods)
that an object can have.

Object:
An object is an instance of a class. It represents a
real entity and contains its own data/state.

----------------------------------------------------------

2. WHY DO WE NEED IT?
----------------------------------------------------------
We use classes and objects to:

1. Organize related data and methods together.
2. Represent real-world entities in programs.
3. Make code reusable.
4. Make large applications easier to maintain.
5. Implement Object-Oriented Programming.

Example:
Student → Class
Gaurav  → Object

----------------------------------------------------------

3. TYPES
----------------------------------------------------------
There are no separate "types" of classes/objects that
you need to memorize at this basic level.

Important classifications of classes in Java include:
- Concrete class
- Abstract class
- Final class
- Inner class

For beginners, first understand:
Class → blueprint
Object → instance of class

----------------------------------------------------------

4. SYNTAX
----------------------------------------------------------

class ClassName {

    // Variables
    dataType variable;

    // Method
    returnType methodName() {
        // code
    }
}

Creating an object:

ClassName objectName = new ClassName();

----------------------------------------------------------

5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    // Data / State
    String name;
    int age;

    // Behavior / Method
    void study() {
        System.out.println(name + " is studying.");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        // Creating an object
        Student student1 = new Student();

        // Assigning values
        student1.name = "Gaurav";
        student1.age = 23;

        // Calling methods
        student1.displayDetails();
        student1.study();
    }
}

/*
OUTPUT:

Name: Gaurav
Age: 23
Gaurav is studying.


----------------------------------------------------------
6. REAL-WORLD EXAMPLE
----------------------------------------------------------

Think about a Student.

A student has:

STATE / DATA:
- name
- age
- rollNumber
- course

BEHAVIOR:
- study()
- attendLecture()
- giveExam()

So we can represent it as:

                 Student
                    |
        +-----------+-----------+
        |                       |
      DATA                    METHODS
        |                       |
      name                    study()
      age                     attendExam()
      course                  attendLecture()

Student is the CLASS.

Gaurav, Rahul, Priya etc. can be OBJECTS.

Example:

Student student1 = new Student();
Student student2 = new Student();

student1 and student2 are two different objects
created from the same Student class.


----------------------------------------------------------
7. IMPORTANT KEYWORDS
----------------------------------------------------------

class
    → Used to define a class.

new
    → Used to create an object.

this
    → Refers to the current object.
      (Will be studied separately.)

static
    → Belongs to the class rather than individual objects.
      (Will be studied separately.)

Example:

Student student1 = new Student();

Student → class/reference type
student1 → reference variable
new → creates object
Student() → constructor call


IMPORTANT:

Student student1 = new Student();

There are two things to understand:

1. Reference variable
   student1

2. Object
   new Student()


----------------------------------------------------------
8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

CLASS vs OBJECT

Class:
- Blueprint/template.
- Logical entity.
- Does not represent one particular instance.
- Used to create objects.

Object:
- Instance of a class.
- Represents a particular entity.
- Has its own state.
- Created using new.


Example:

class Student {
    String name;
}

Student s1 = new Student();

Here:

Student → Class
s1      → Reference variable
new Student() → Object


Easy way to remember:

CLASS = Blueprint
OBJECT = Actual thing created from blueprint


Example from real life:

House Plan  → Class
Actual House → Object


----------------------------------------------------------
9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is a class?

Answer:
A class is a blueprint or template that defines the
data and behavior that objects created from it can have.


Q2. What is an object?

Answer:
An object is an instance of a class. It represents a
specific entity and has its own state and behavior.


Q3. What is the difference between a class and an object?

Answer:
A class is a blueprint used to create objects, whereas
an object is an actual instance of that class.


Q4. How do you create an object in Java?

Answer:

Student s1 = new Student();

The new keyword creates an object of the Student class.


Q5. What is the difference between an object and a
reference variable?

Answer:
The object is the actual instance created in memory,
while the reference variable stores a reference to that
object.


Q6. Can we create multiple objects from one class?

Answer:
Yes. A single class can be used to create multiple
objects, and each object can have its own state.

Example:

Student s1 = new Student();
Student s2 = new Student();


Q7. Where is the object created?

Answer:
When we use the new keyword, an object is created in
heap memory, while the reference variable holds a
reference to that object.


----------------------------------------------------------
10. MY OWN EXAMPLE
----------------------------------------------------------

Practice this yourself.

Create a class called Car.

Requirements:

Data:
- brand
- color
- price

Methods:
- start()
- drive()
- displayDetails()

Then create TWO objects:

Car car1
Car car2

Give them different values.

Example idea:

Car car1 = new Car();
Car car2 = new Car();

car1.brand = "BMW";
car1.color = "Black";

car2.brand = "Toyota";
car2.color = "White";

Then display their details.

IMPORTANT:
Do not simply copy this example.

Write it yourself in VS Code.


----------------------------------------------------------
11. COMMON MISTAKES
----------------------------------------------------------

❌ Mistake 1:
Thinking class and object are the same thing.

Correct:
Class = blueprint
Object = instance


❌ Mistake 2:
Forgetting the new keyword.

Incorrect:

Student s1;

This only declares a reference variable.

Correct:

Student s1 = new Student();

This creates an object.


❌ Mistake 3:
Thinking one class can create only one object.

A class can create many objects.

Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();


❌ Mistake 4:
Confusing reference variable with object.

Student s1 = new Student();

s1 → reference variable
new Student() → object


❌ Mistake 5:
Thinking every variable belongs to the class itself.

Instance variables belong to individual objects.

Example:

Student s1 = new Student();
Student s2 = new Student();

s1.name and s2.name can contain different values.


----------------------------------------------------------
12. ONE-LINE REVISION
----------------------------------------------------------

Class = Blueprint

Object = Instance of a class

new = Creates an object

Reference variable = Refers to an object

One class → Can create many objects

==========================================================
INTERVIEW GOLDEN ANSWER
==========================================================

" A class is a blueprint that defines the state and
  behavior of objects, while an object is an instance
  of that class. In Java, objects are commonly created
  using the new keyword. "

==========================================================
*/