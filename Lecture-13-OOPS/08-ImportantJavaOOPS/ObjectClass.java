/*
==========================================================
                     OBJECT CLASS
==========================================================

1. DEFINITION
----------------------------------------------------------
Object is the root class of the Java class hierarchy.

Every Java class directly or indirectly inherits from
Object.


2. WHY DO WE NEED IT?
----------------------------------------------------------
It provides common methods that every Java object can use.


3. TYPES
----------------------------------------------------------
Important Object class methods:

toString()
equals()
hashCode()
getClass()
clone()
finalize() [deprecated]


4. SYNTAX
----------------------------------------------------------
class Student {
}

Student s = new Student();

s.toString();
s.equals(other);
s.hashCode();


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {
}

public class ObjectClass {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.toString());
        System.out.println(s.hashCode());
        System.out.println(s.getClass());
    }
}

/*
6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Because every class inherits Object, common operations
such as comparison and string representation are available
for every object.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
Object
extends


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
Object class
→ Parent of all Java classes.

Example:

class Student extends Object {
}

Even if extends Object is not written, Java provides it
implicitly for ordinary classes.


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. What is the parent class of all Java classes?

Answer:
java.lang.Object


10. MY OWN EXAMPLE
----------------------------------------------------------
class Employee {
}

Employee e = new Employee();

e.toString();
e.equals(e);


11. COMMON MISTAKES
----------------------------------------------------------
❌ Thinking Object is an interface.

Object is a class.


12. ONE-LINE REVISION
----------------------------------------------------------
Object = Root class of Java class hierarchy.

INTERVIEW LINE:
"java.lang.Object is the root class of Java, and every
class directly or indirectly inherits from it."
==========================================================
*/