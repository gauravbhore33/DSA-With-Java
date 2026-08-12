/*
==========================================================
                  STATIC KEYWORD
==========================================================

1. DEFINITION
----------------------------------------------------------
`static` means the member belongs to the CLASS rather than
to individual objects.

A static member is shared among all objects of that class.


2. WHY DO WE NEED IT?
----------------------------------------------------------
Use `static` when something should be common/shared among
all objects.

Example:
All students belong to the same college.

Instead of storing:

s1.college
s2.college
s3.college

as separate copies, use one shared variable:

static String college;


3. TYPES
----------------------------------------------------------
1. Static Variable
2. Static Method
3. Static Block
4. Static Nested Class


4. SYNTAX
----------------------------------------------------------

static dataType variable;

static returnType method() {
    // code
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    String name;                    // Instance variable
    static String college = "SPPU"; // Static variable

    void display() {
        System.out.println(name);
        System.out.println(college);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Gaurav";
        s2.name = "Rahul";

        s1.display();
        s2.display();
    }
}

/*
OUTPUT:

Gaurav
SPPU
Rahul
SPPU


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
College students:

Student-specific:
name
age
rollNumber

Common for everyone:
college

Therefore:

String name;
int age;
int rollNumber;

static String college = "SPPU";


7. IMPORTANT KEYWORDS
----------------------------------------------------------
static
static variable
static method
static block


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

INSTANCE VARIABLE vs STATIC VARIABLE

Instance:

String name;

→ Each object has its own copy.


Static:

static String college;

→ One shared copy belongs to the class.


Example:

Student s1 = new Student();
Student s2 = new Student();

s1.name = "Gaurav";
s2.name = "Rahul";

Both have different `name`.

But:

Student.college

is shared by both.


STATIC METHOD vs INSTANCE METHOD

Static method:
→ Belongs to class
→ Called using class name

Student.displayCollege();


Instance method:
→ Belongs to object
→ Called using object

s1.display();


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is static in Java?

Answer:
`static` makes a member belong to the class rather than
individual objects.


Q2. Why is main() static?

Answer:
Because the JVM needs to call main() without creating an
object of the class.


Q3. Can a static method access an instance variable
directly?

Answer:
No.

A static method does not belong to a particular object.


Q4. Can an instance method access static variables?

Answer:
Yes.


Q5. How do you access a static variable?

Answer:

Student.college;


Q6. Can we change a static variable?

Answer:
Yes. Since it is shared, changing it affects the value
seen by all objects.


10. MY OWN EXAMPLE
----------------------------------------------------------
Create:

class Employee {

    String name;
    static String company = "TCS";

}

Create two employees and print their name and company.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Creating an object just to access a static member.

Instead of:

Student s = new Student();
s.college;

Prefer:

Student.college;


❌ Trying to directly access an instance variable from a
static method.

Example:

static void display() {
    System.out.println(name); // ❌
}


12. ONE-LINE REVISION
----------------------------------------------------------
static = belongs to the class and is shared among objects.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"`static` means the member belongs to the class rather than
to individual objects, so a static member is shared among
all objects of that class."

==========================================================
*/