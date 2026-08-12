/*
==========================================================
                 THIS KEYWORD
==========================================================

1. DEFINITION
----------------------------------------------------------
`this` refers to the current object.

It is mainly used to distinguish instance variables from
local variables/parameters when they have the same name.


2. WHY DO WE NEED IT?
----------------------------------------------------------
Most commonly used when constructor or method parameters
have the same name as instance variables.

Example:

this.name = name;

Left side  → instance variable
Right side → parameter


3. TYPES
----------------------------------------------------------
Common uses of `this`:

1. Access current object's instance variable
2. Call current object's method
3. Call another constructor using this()
4. Pass current object as an argument
5. Return current object


4. SYNTAX
----------------------------------------------------------

this.variableName;

this.methodName();

this();

this(parameter);


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

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisKeyword {

    public static void main(String[] args) {

        Student s1 = new Student("Gaurav", 23);

        s1.display();
    }
}

/*
OUTPUT:

Name: Gaurav
Age: 23


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
When creating an Employee:

class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }
}

`this.name` means the name belonging to the current
Employee object.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
this
this()
this.variable
this.method()


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

name
→ Constructor/method parameter

this.name
→ Instance variable of current object


Example:

Employee(String name) {

    this.name = name;
}

Without `this`, Java cannot clearly distinguish the
instance variable from the parameter when both are named
`name`.


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is `this` in Java?

Answer:
`this` is a reference to the current object.

Q2. Why do we use `this`?

Answer:
It is commonly used to distinguish instance variables
from local variables or parameters having the same name.

Q3. Can `this` be used in a static method?

Answer:
No. `this` refers to the current object, while a static
method belongs to the class and does not have a current
object.


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
}

Create two Car objects and display their details.


11. COMMON MISTAKES
----------------------------------------------------------

❌ `this` cannot be used inside a static context.

❌ Don't confuse:

this.name
→ instance variable

name
→ parameter/local variable


12. ONE-LINE REVISION
----------------------------------------------------------
`this` = reference to the current object.

MOST IMPORTANT:

this.name = name;

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"`this` is a reference variable that refers to the current
object and is commonly used to distinguish instance
variables from local variables or constructor parameters
with the same name."

==========================================================
*/