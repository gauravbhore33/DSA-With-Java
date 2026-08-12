/*
==========================================================
                 INSTANCE METHODS
==========================================================

1. DEFINITION
----------------------------------------------------------
An instance method is a non-static method that belongs to
an object of a class.

It is used to define the BEHAVIOR of an object.

Instance methods can directly access the instance
variables of the same object.

Example:

class Student {

    String name;       // Instance variable

    void study() {     // Instance method
        System.out.println(name + " is studying");
    }
}


----------------------------------------------------------

2. WHY DO WE NEED IT?
----------------------------------------------------------
Instance variables represent:

        STATE / DATA

Instance methods represent:

        BEHAVIOR / ACTION


Example:

Student

DATA:
name
age
marks

BEHAVIOR:
study()
giveExam()
displayDetails()


This combination of DATA + BEHAVIOR is one of the
fundamental ideas of Object-Oriented Programming.


----------------------------------------------------------

3. TYPES
----------------------------------------------------------
Instance methods can be categorized based on what they do.

1. Method without parameters and return value

   void display() {
       System.out.println("Hello");
   }


2. Method with parameters

   void setAge(int age) {
       // code
   }


3. Method with return value

   int getAge() {
       return age;
   }


4. Method with parameters and return value

   int add(int a, int b) {
       return a + b;
   }


The important point:

An instance method is called using an OBJECT.


----------------------------------------------------------

4. SYNTAX
----------------------------------------------------------

class ClassName {

    dataType variable;

    returnType methodName() {
        // method body
    }
}


Calling the instance method:

ClassName object = new ClassName();

object.methodName();


----------------------------------------------------------

5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    // Instance variables
    String name;
    int age;

    // Instance method
    void study() {

        System.out.println(name + " is studying.");
    }

    // Instance method
    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class InstanceMethods {

    public static void main(String[] args) {

        // Creating object
        Student student1 = new Student();

        // Assigning instance variables
        student1.name = "Gaurav";
        student1.age = 23;

        // Calling instance methods
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

Consider a BANK ACCOUNT.

DATA / STATE:

accountHolderName
accountNumber
balance


BEHAVIOR / ACTION:

deposit()
withdraw()
checkBalance()


Example:

class BankAccount {

    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void checkBalance() {
        System.out.println(balance);
    }
}


Now:

BankAccount account1 = new BankAccount();

account1.accountHolderName = "Gaurav";
account1.balance = 10000;

account1.deposit(5000);

account1.withdraw(2000);

account1.checkBalance();


The object has:

STATE:
balance = 13000

BEHAVIOR:
deposit()
withdraw()
checkBalance()


This is how we model real-world entities using OOP.


----------------------------------------------------------

7. IMPORTANT KEYWORDS
----------------------------------------------------------

1. void

Means the method does not return a value.

void study() {
    System.out.println("Studying");
}


2. return

Used to return a value from a method.

int getAge() {
    return age;
}


3. this

Refers to the current object.

Will be studied in detail in the next topic.


4. new

Creates an object.

Student s = new Student();


5. static

A static method belongs to the class rather than a
particular object.

Example:

static void display() {
}


Important:

Instance method:

object.method();


Static method:

ClassName.method();


----------------------------------------------------------

8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

INSTANCE METHOD vs STATIC METHOD


INSTANCE METHOD
---------------

Belongs to an object.

Example:

void display() {
}

Called using:

student1.display();


STATIC METHOD
-------------

Belongs to the class.

Example:

static void display() {
}

Called using:

Student.display();


Main difference:

Instance method
→ Object-specific behavior.

Static method
→ Class-level behavior.


Example:

class Student {

    String name;

    void study() {
        System.out.println(name + " is studying");
    }

    static void collegeRules() {
        System.out.println("Follow college rules");
    }
}


Student s1 = new Student();

s1.name = "Gaurav";

s1.study();                  // Instance method

Student.collegeRules();      // Static method


----------------------------------------------------------

9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is an instance method?

Answer:

An instance method is a non-static method that belongs
to an object and can operate on that object's instance
variables.


Q2. How do you call an instance method?

Answer:

We call it using an object.

Example:

Student s = new Student();

s.study();


Q3. Can an instance method access instance variables?

Answer:

Yes.

An instance method can directly access the instance
variables of the same object.


Q4. Can an instance method access static variables?

Answer:

Yes.

An instance method can access both instance and static
members of the class.


Q5. Can a static method directly access an instance
variable?

Answer:

No.

A static method does not belong to a particular object,
so it cannot directly access an instance variable.


Q6. Why is main() static?

Answer:

The JVM needs to call main() without creating an object
of the class first. Therefore, main() is declared static.


Q7. What is the difference between an instance method
and a static method?

Answer:

An instance method belongs to an object and is called
using an object, whereas a static method belongs to the
class and is normally called using the class name.


----------------------------------------------------------

10. MY OWN EXAMPLE
----------------------------------------------------------

Create:

class Car

Instance variables:

brand
color
speed


Instance methods:

start()
accelerate()
brake()
displayDetails()


Example idea:

Car car1 = new Car();

car1.brand = "BMW";
car1.color = "Black";
car1.speed = 0;

car1.start();
car1.accelerate();
car1.brake();
car1.displayDetails();


IMPORTANT:

Write this yourself.

Do not copy the Student example.


----------------------------------------------------------

11. COMMON MISTAKES
----------------------------------------------------------

❌ Mistake 1:

Trying to call an instance method using the class name.

Incorrect:

Student.study();


Correct:

Student s = new Student();

s.study();


❌ Mistake 2:

Making every method static.

Beginners often do:

static void study()
static void display()
static void calculate()


Not every method needs to be static.

If behavior belongs to an individual object, use an
instance method.


❌ Mistake 3:

Calling an instance method without an object from a
static main() method.

Incorrect:

public static void main(String[] args) {

    study();
}


Correct:

public static void main(String[] args) {

    Student s = new Student();

    s.study();
}


❌ Mistake 4:

Confusing method with instance method.

A method becomes an instance method when it is associated
with an object and is not declared static.


----------------------------------------------------------

12. ONE-LINE REVISION
----------------------------------------------------------

Instance Method = Object-specific behavior that is called
using an object.


==========================================================
INTERVIEW GOLDEN ANSWER
==========================================================

"An instance method is a non-static method that belongs
to an object. It is used to define the behavior of an
object and can directly access the instance variables
of that object."


==========================================================
IMPORTANT CONNECTION
==========================================================

We have now learned:

CLASS
  ↓
Blueprint

OBJECT
  ↓
Actual instance

INSTANCE VARIABLES
  ↓
Object's DATA / STATE

INSTANCE METHODS
  ↓
Object's BEHAVIOR


Example:

Student
   |
   +---- name       ← State
   +---- age        ← State
   +---- marks      ← State
   |
   +---- study()    ← Behavior
   +---- exam()     ← Behavior
   +---- display()  ← Behavior


This DATA + BEHAVIOR combination is a very important
foundation for understanding ENCAPSULATION.


==========================================================
*/