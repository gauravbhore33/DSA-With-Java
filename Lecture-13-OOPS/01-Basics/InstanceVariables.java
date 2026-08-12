/*
==========================================================
                 INSTANCE VARIABLES
==========================================================

1. DEFINITION
----------------------------------------------------------
An instance variable is a variable declared inside a class
but outside any method, constructor, or block.

Each object gets its own separate copy of instance
variables.

Example:

class Student {

    String name;
    int age;
}

Here:
name and age are instance variables.


----------------------------------------------------------

2. WHY DO WE NEED IT?
----------------------------------------------------------
Instance variables are used to store the STATE/DATA of
individual objects.

For example:

Student 1:
name = "Gaurav"
age = 23

Student 2:
name = "Rahul"
age = 22

Both objects belong to the same Student class, but they
can have different values.

Therefore:

One class
   ↓
Many objects
   ↓
Each object has its own instance data.


----------------------------------------------------------

3. TYPES
----------------------------------------------------------
Instance variables don't have different types as an OOP
concept, but they can have different Java data types:

1. Primitive types
   int
   double
   char
   boolean
   etc.

2. Reference types
   String
   Array
   Object
   etc.

Example:

class Student {

    String name;      // Reference type
    int age;          // Primitive type
    double marks;     // Primitive type
    boolean passed;   // Primitive type
}


----------------------------------------------------------

4. SYNTAX
----------------------------------------------------------

class ClassName {

    dataType variableName;

}


Example:

class Student {

    String name;
    int age;
    double marks;

}


----------------------------------------------------------

5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    // Instance variables
    String name;
    int age;
    double marks;

}

public class InstanceVariables {

    public static void main(String[] args) {

        // Object 1
        Student student1 = new Student();

        student1.name = "Gaurav";
        student1.age = 23;
        student1.marks = 85.5;


        // Object 2
        Student student2 = new Student();

        student2.name = "Rahul";
        student2.age = 22;
        student2.marks = 78.5;


        // Display Object 1
        System.out.println("Student 1");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Marks: " + student1.marks);


        System.out.println();


        // Display Object 2
        System.out.println("Student 2");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Marks: " + student2.marks);
    }
}


/*
OUTPUT:

Student 1
Name: Gaurav
Age: 23
Marks: 85.5

Student 2
Name: Rahul
Age: 22
Marks: 78.5


----------------------------------------------------------

6. REAL-WORLD EXAMPLE
----------------------------------------------------------

Think about a BANK ACCOUNT.

Every bank account can have:

accountNumber
accountHolderName
balance

So:

class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;
}


Now create two accounts:

BankAccount account1 = new BankAccount();
BankAccount account2 = new BankAccount();


Their data can be different:

account1.balance = 50000;
account2.balance = 25000;


The class defines WHAT DATA an account has.

Each object stores its OWN values.


Think:

CLASS
 ↓
Defines properties

OBJECT
 ↓
Owns its individual values


----------------------------------------------------------

7. IMPORTANT KEYWORDS
----------------------------------------------------------

INSTANCE VARIABLE
    → Variable declared inside class but outside methods,
      constructors, and blocks.

new
    → Creates an object.

this
    → Refers to the current object.

static
    → A static variable belongs to the class rather than
      each individual object.

private
    → Used to restrict direct access to instance variables.


Example:

class Student {

    private String name;
    int age;
}


----------------------------------------------------------

8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

INSTANCE VARIABLE vs LOCAL VARIABLE vs STATIC VARIABLE


INSTANCE VARIABLE
-----------------
Declared inside class but outside methods.

Example:

class Student {

    String name;

}


LOCAL VARIABLE
--------------
Declared inside a method, constructor, or block.

Example:

void display() {

    int age = 23;

}


STATIC VARIABLE
---------------
Declared using static and belongs to the class.

Example:

class Student {

    static String college = "SPPU";

}


Easy way:

Instance variable
→ Each object gets its own copy.


Static variable
→ One shared copy belongs to the class.


Local variable
→ Exists only inside its method/block.


----------------------------------------------------------

9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is an instance variable?

Answer:

An instance variable is a variable declared inside a
class but outside methods, constructors, and blocks.
Each object gets its own copy of instance variables.


Q2. Where are instance variables declared?

Answer:

They are declared inside a class but outside methods,
constructors, and blocks.


Q3. Do all objects have separate instance variables?

Answer:

Yes. Each object has its own instance state.

Example:

Student s1 = new Student();
Student s2 = new Student();

s1.name = "Gaurav";
s2.name = "Rahul";

The two objects have different values for name.


Q4. What is the default value of an instance variable?

Answer:

If an instance variable is not explicitly initialized,
Java gives it a default value.

Examples:

int     → 0
double  → 0.0
boolean → false
char    → '\u0000'
Object/reference → null


Q5. Can an instance variable be static?

Answer:

Technically, once a variable is declared static, it is
called a static/class variable rather than an instance
variable.

So:

int age;

→ instance variable

static int count;

→ static/class variable


Q6. Can an instance variable be private?

Answer:

Yes.

Example:

class Student {

    private String name;
}

This is commonly used for encapsulation.


----------------------------------------------------------

10. MY OWN EXAMPLE
----------------------------------------------------------

Create:

class Employee

Instance variables:

name
id
salary
department


Create two objects:

Employee e1
Employee e2


Give different values to each object.

For example:

e1.name = "Gaurav";

e2.name = "Rahul";


Then print their details.

IMPORTANT:

Try writing this yourself without copying the Student
example.


----------------------------------------------------------

11. COMMON MISTAKES
----------------------------------------------------------

❌ Mistake 1:
Declaring an instance variable inside main().

Incorrect:

public static void main(String[] args) {

    String name = "Gaurav";
}

This is a LOCAL VARIABLE.

Correct:

class Student {

    String name;
}


❌ Mistake 2:
Thinking instance variables are shared.

Example:

Student s1 = new Student();
Student s2 = new Student();

s1.name = "Gaurav";
s2.name = "Rahul";

Changing s1.name does not automatically change s2.name.


❌ Mistake 3:
Confusing instance and static variables.

Instance:

String name;

Each object can have a different value.

Static:

static String college;

Normally shared by all objects of the class.


❌ Mistake 4:
Thinking an instance variable must always be initialized
manually.

Java provides default values automatically.

Example:

class Student {

    int age;
}

Student s = new Student();

System.out.println(s.age);

Output:

0


----------------------------------------------------------

12. ONE-LINE REVISION
----------------------------------------------------------

Instance variable = Object-specific data declared inside
a class but outside methods, constructors, and blocks.


==========================================================
INTERVIEW GOLDEN ANSWER
==========================================================

"An instance variable is a non-static variable declared
inside a class but outside methods, constructors, and
blocks. Each object has its own copy of the instance
variables, so different objects can maintain different
states."


==========================================================
IMPORTANT MEMORY TRICK
==========================================================

CLASS
  ↓
Defines instance variables
  ↓
OBJECT CREATED
  ↓
Each object gets its own instance state


Student class

      name
       age
       marks
        ↓
   ┌───────────┐
   │ Student 1 │
   │ Gaurav    │
   │ 23        │
   │ 85.5      │
   └───────────┘

   ┌───────────┐
   │ Student 2 │
   │ Rahul     │
   │ 22        │
   │ 78.5      │
   └───────────┘


==========================================================
*/