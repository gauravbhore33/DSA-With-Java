/*
==========================================================
              CONSTRUCTOR OVERLOADING
==========================================================

1. DEFINITION
----------------------------------------------------------
Constructor overloading means having multiple constructors
in the same class with different parameter lists.


2. WHY DO WE NEED IT?
----------------------------------------------------------
It allows us to create objects in different ways depending
on the information available.


3. TYPES
----------------------------------------------------------
Constructors can be overloaded by changing:

1. Number of parameters
2. Type of parameters
3. Order of parameters


4. SYNTAX
----------------------------------------------------------

ClassName() { }

ClassName(int a) { }

ClassName(String name, int age) { }


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    String name;
    int age;

    // Constructor 1
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2
    Student(String name) {
        this.name = name;
    }

    // Constructor 3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Gaurav");

        Student s3 = new Student("Rahul", 22);

        s1.display();

        System.out.println();

        s2.display();

        System.out.println();

        s3.display();
    }
}

/*
OUTPUT:

Name: Unknown
Age: 0

Name: Gaurav
Age: 0

Name: Rahul
Age: 22


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
An Employee can be created with:

Employee()
Employee(String name)
Employee(String name, int id)
Employee(String name, int id, double salary)

Different constructors allow different levels of
information when creating an object.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
Constructor
this
new


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

CONSTRUCTOR OVERLOADING
→ Multiple constructors
→ Same constructor name
→ Different parameter lists


METHOD OVERLOADING
→ Multiple methods
→ Same method name
→ Different parameter lists


Example:

Student() { }

Student(String name) { }

Student(String name, int age) { }

This is constructor overloading.


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is constructor overloading?

Answer:
Defining multiple constructors in the same class with
different parameter lists.


Q2. Can constructors have the same parameters?

No.

Their parameter lists must be different.


Q3. Is constructor overloading compile-time polymorphism?

Yes.

The compiler determines which constructor to call based
on the arguments.


Q4. Can constructors be overloaded by changing only the
return type?

No.

Constructors do not have return types.


Q5. Can a constructor be overloaded based only on parameter
names?

No.

Parameter names do not affect overloading.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create an Employee class with:

Employee()
Employee(String name)
Employee(String name, int id)
Employee(String name, int id, double salary)

Create objects using all four constructors.


11. COMMON MISTAKES
----------------------------------------------------------

❌ This is NOT overloading:

Student(int age) { }

Student(int number) { }

Both have the same parameter type and count.


❌ Return type cannot differentiate constructors.

Student() { }

void Student() { }   // This is a method, not a constructor.


12. ONE-LINE REVISION
----------------------------------------------------------
Constructor Overloading = Multiple constructors with the
same class name but different parameter lists.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Constructor overloading allows a class to have multiple
constructors with different parameter lists, enabling
objects to be initialized in different ways."

==========================================================
*/