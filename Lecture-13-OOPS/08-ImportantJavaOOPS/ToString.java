/*
==========================================================
                     toString()
==========================================================

1. DEFINITION
----------------------------------------------------------
toString() is a method from the Object class that returns
a string representation of an object.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- To display object information
- Useful for debugging
- Makes object output readable


3. TYPES
----------------------------------------------------------
Default toString()
Custom overridden toString()


4. SYNTAX
----------------------------------------------------------
@Override
public String toString() {
    return "...";
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

    @Override
    public String toString() {
        return "Name = " + name + ", Age = " + age;
    }
}

public class ToString {

    public static void main(String[] args) {

        Student s = new Student("Gaurav", 22);

        System.out.println(s);
    }
}

/*
OUTPUT:

Name = Gaurav, Age = 22


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Instead of:

Student@5e2de80c

we can get:

Name = Gaurav, Age = 22


7. IMPORTANT KEYWORDS
----------------------------------------------------------
@Override
toString()


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
toString()
→ Converts object information into a String representation.


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. What happens when we print an object?

Answer:
Java internally calls the object's toString() method.


10. MY OWN EXAMPLE
----------------------------------------------------------
Override toString() in an Employee class and return:

Name + Salary


11. COMMON MISTAKES
----------------------------------------------------------
❌ Changing the return type.

toString() must return String.

Correct:

public String toString()


12. ONE-LINE REVISION
----------------------------------------------------------
toString() = String representation of an object.

INTERVIEW LINE:
"toString() is an Object class method used to provide a
meaningful string representation of an object."
==========================================================
*/