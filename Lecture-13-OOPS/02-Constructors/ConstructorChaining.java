/*
==========================================================
                CONSTRUCTOR CHAINING
==========================================================

1. DEFINITION
----------------------------------------------------------
Constructor chaining means calling one constructor from
another constructor in the same class or from the parent
class.


2. WHY DO WE NEED IT?
----------------------------------------------------------
It avoids duplicate initialization code and allows
constructors to reuse each other.


3. TYPES
----------------------------------------------------------
1. Same class  → using this()
2. Parent class → using super()


4. SYNTAX
----------------------------------------------------------

this();

this(value);

super();

super(value);


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    String name;
    int age;

    Student() {
        this("Unknown", 0);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Gaurav", 23);

        s1.display();

        System.out.println();

        s2.display();
    }
}

/*
OUTPUT:

Name: Unknown
Age: 0

Name: Gaurav
Age: 23


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
An Employee can have different ways of creating an object:

Employee()
    ↓
Employee("Gaurav")
    ↓
Employee("Gaurav", 101, 600000)

Instead of repeating initialization code, constructors
can call each other.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
this()
→ Calls another constructor of the same class.

super()
→ Calls a constructor of the parent class.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

this()
→ Same class constructor

super()
→ Parent class constructor


Example:

this("Gaurav");

→ Calls another constructor in the same class.


super("Gaurav");

→ Calls constructor of the parent class.


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is constructor chaining?

Answer:
Calling one constructor from another constructor to reuse
initialization code.


Q2. How do you call another constructor in the same class?

Answer:
Using `this()`.


Q3. How do you call a parent class constructor?

Answer:
Using `super()`.


Q4. Where must this() or super() appear?

Answer:
It must be the first statement inside a constructor.


Q5. Can we use both this() and super() in the same
constructor?

Answer:
No. Both must be the first statement, so only one can be
used directly.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create:

class Car {

    String brand;
    int price;

    Car() {
        this("Unknown", 0);
    }

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}

Create objects using both constructors.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Wrong:

Student() {
    System.out.println("Hello");
    this("Unknown", 0);
}

`this()` must be the first statement.


❌ Don't confuse:

this()
→ constructor chaining

this
→ current object reference


12. ONE-LINE REVISION
----------------------------------------------------------
Constructor Chaining = One constructor calling another
constructor using `this()` or `super()`.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Constructor chaining allows one constructor to call
another constructor to reuse initialization logic.
`this()` is used for the same class and `super()` is used
for the parent class."

==========================================================
*/