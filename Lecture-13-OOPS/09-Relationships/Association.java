/*
==========================================================
                    ASSOCIATION
==========================================================

1. DEFINITION
----------------------------------------------------------
Association represents a general relationship between two
independent classes.

It means one object is connected to or uses another object.

Both objects can exist independently.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Represents relationships between objects
- Models real-world connections
- Shows how classes interact with each other


3. TYPES
----------------------------------------------------------
Association can be:

1. One-to-One
2. One-to-Many
3. Many-to-One
4. Many-to-Many


4. SYNTAX
----------------------------------------------------------

class Teacher {
}

class Student {

    Teacher teacher;
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Teacher {

    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class Student {

    void learn(Teacher teacher) {
        teacher.teach();
        System.out.println("Student is learning");
    }
}

public class Association {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student student = new Student();

        student.learn(teacher);
    }
}

/*
OUTPUT:

Teacher is teaching
Student is learning


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Teacher and Student have an association.

A Teacher can exist without a Student.

A Student can exist without a particular Teacher.

Therefore, they are independent objects.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
No special keyword is required.

Association is a relationship between objects.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
Association
→ General relationship
→ Objects can exist independently


Aggregation
→ Weak HAS-A relationship
→ Child can exist independently


Composition
→ Strong HAS-A relationship
→ Child depends on parent


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. What is association?

Answer:
Association is a general relationship between two
independent objects where one object uses or interacts
with another.


10. MY OWN EXAMPLE
----------------------------------------------------------
Doctor and Patient

A Doctor can exist without a Patient.
A Patient can exist without a particular Doctor.

Therefore:

Doctor ↔ Patient


11. COMMON MISTAKES
----------------------------------------------------------
❌ Thinking association means inheritance.

Association represents a relationship between objects,
not an IS-A relationship.


12. ONE-LINE REVISION
----------------------------------------------------------
Association = General relationship between two independent
objects.

INTERVIEW LINE:
"Association represents a relationship between two
independent objects that can exist independently."
==========================================================
*/