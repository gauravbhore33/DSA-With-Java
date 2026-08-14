/*
==========================================================
                       equals()
==========================================================

1. DEFINITION
----------------------------------------------------------
equals() is an Object class method used to compare objects
for logical equality.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- To compare object contents
- Useful when checking whether two objects are logically
  equal


3. TYPES
----------------------------------------------------------
==      → compares references for objects
equals() → compares logical equality when overridden


4. SYNTAX
----------------------------------------------------------
@Override
public boolean equals(Object obj) {
    ...
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;

        return this.name.equals(other.name);
    }
}

public class Equals {

    public static void main(String[] args) {

        Student s1 = new Student("Gaurav");
        Student s2 = new Student("Gaurav");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

/*
OUTPUT:

false
true


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Two Student objects may contain the same student name and
roll number.

Even though they are different objects, equals() can
consider them logically equal.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
equals()
@Override


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
==

→ For objects, compares references.

equals()

→ Compares logical equality when properly overridden.


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. Difference between == and equals()?

Answer:
For objects, == compares references, while equals() is
used for logical/content equality when overridden.


10. MY OWN EXAMPLE
----------------------------------------------------------
Compare two Employee objects using employee ID.


11. COMMON MISTAKES
----------------------------------------------------------
❌ Using == when you want to compare object contents.

❌ Overriding equals() without considering hashCode().


12. ONE-LINE REVISION
----------------------------------------------------------
equals() = Checks logical equality between objects.

INTERVIEW LINE:
"== compares object references, while equals() is used to
compare logical equality."
==========================================================
*/