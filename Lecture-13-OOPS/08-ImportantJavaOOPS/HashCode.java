/*
==========================================================
                     hashCode()
==========================================================

1. DEFINITION
----------------------------------------------------------
hashCode() is an Object class method that returns an integer
hash value representing an object.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Used by hash-based collections
- Helps HashMap and HashSet locate objects efficiently
- Works closely with equals()


3. TYPES
----------------------------------------------------------
Object provides a default hashCode() implementation.

It can be overridden when equals() is overridden.


4. SYNTAX
----------------------------------------------------------
@Override
public int hashCode() {
    return ...;
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Student {

    int id;

    Student(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class HashCode {

    public static void main(String[] args) {

        Student s = new Student(101);

        System.out.println(s.hashCode());
    }
}

/*
6. REAL-WORLD EXAMPLE
----------------------------------------------------------
HashMap and HashSet use hashCode() to organize and find
objects efficiently.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
hashCode()
equals()


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
equals()
→ Checks logical equality.

hashCode()
→ Produces an integer hash value used by hash-based
  collections.


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. What is the relationship between equals() and
hashCode()?

Answer:

If two objects are equal according to equals(), they MUST
have the same hashCode().

But two objects having the same hashCode() do not
necessarily have to be equal.


10. MY OWN EXAMPLE
----------------------------------------------------------
Override equals() and hashCode() in an Employee class using
employee ID.


11. COMMON MISTAKES
----------------------------------------------------------
❌ Overriding equals() but not hashCode().

This can cause incorrect behavior in HashMap and HashSet.


12. ONE-LINE REVISION
----------------------------------------------------------
Equal objects must have the same hashCode().

INTERVIEW LINE:
"If two objects are equal according to equals(), they must
return the same hash code."
==========================================================
*/