/*
==========================================================
                     PUBLIC ACCESS MODIFIER
==========================================================

1. DEFINITION
----------------------------------------------------------
`public` is an access modifier that allows a class, method,
variable, or constructor to be accessed from anywhere.

It provides the highest level of accessibility in Java.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- To make members accessible from other classes
- To expose functionality to other parts of an application
- Useful for APIs and methods that should be publicly available


3. TYPES
----------------------------------------------------------
Java has 4 access levels:

1. public
2. protected
3. default
4. private

public → Accessible everywhere


4. SYNTAX
----------------------------------------------------------

public class Student {

    public int age;

    public void display() {
        System.out.println(age);
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

public class Public {

    public int age = 22;

    public void display() {
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {

        Public obj = new Public();

        obj.display();
        System.out.println(obj.age);
    }
}

/*
OUTPUT:

Age = 22
22


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Suppose we create a BankAccount class.

Some functionality should be available to other classes:

public void deposit() {
    // deposit money
}

Other classes can call:

account.deposit();


7. IMPORTANT KEYWORDS
----------------------------------------------------------
public

Can be used with:

- Class
- Method
- Variable
- Constructor


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

public
→ Accessible everywhere


protected
→ Same package + subclasses


default
→ Same package only


private
→ Same class only


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is the public access modifier?

Answer:
`public` allows a class, method, variable, or constructor
to be accessed from anywhere in the application.


Q2. Which access modifier has the widest accessibility?

Answer:

public


Q3. Can a top-level class be private?

Answer:

No.

A top-level class can be public or default.


Q4. Can a public class be accessed from another package?

Answer:

Yes, if it is imported and accessible through the classpath.


Q5. Can a public method be accessed from another package?

Answer:

Yes, provided the class itself is accessible.


10. MY OWN EXAMPLE
----------------------------------------------------------

Create a Student class:

public class Student {

    public String name = "Gaurav";

    public void study() {
        System.out.println("Student is studying");
    }
}

Then access it from another class:

Student s = new Student();

System.out.println(s.name);
s.study();


11. COMMON MISTAKES
----------------------------------------------------------

❌ Thinking public means "only accessible inside the
   same class".

It means the opposite: it is broadly accessible.


❌ Making every variable public.

Usually, variables should be private and accessed through
methods to maintain encapsulation.


12. ONE-LINE REVISION
----------------------------------------------------------
public = Accessible from anywhere.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"The public access modifier provides the widest access
level in Java, allowing a class member to be accessed from
any class and package, subject to normal class visibility."

==========================================================
*/