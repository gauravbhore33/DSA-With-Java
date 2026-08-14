/*
==========================================================
                    AGGREGATION
==========================================================

1. DEFINITION
----------------------------------------------------------
Aggregation is a weak HAS-A relationship where one object
contains or uses another object, but both objects can exist
independently.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Represents HAS-A relationships
- Models whole-part relationships
- Allows objects to have independent lifecycles


3. TYPES
----------------------------------------------------------
Aggregation is a type of association.

Example:

Department HAS-A Teacher

But Teacher can exist without the Department.


4. SYNTAX
----------------------------------------------------------

class Department {

    Teacher teacher;

    Department(Teacher teacher) {
        this.teacher = teacher;
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Department {

    Teacher teacher;

    Department(Teacher teacher) {
        this.teacher = teacher;
    }

    void showTeacher() {
        System.out.println("Teacher: " + teacher.name);
    }
}

public class Aggregation {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Rahul");

        Department department = new Department(teacher);

        department.showTeacher();
    }
}

/*
OUTPUT:

Teacher: Rahul


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
Department HAS-A Teacher.

If the Department is deleted, the Teacher can still exist.

Therefore, this is Aggregation.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
No special keyword is required.

Usually represented using object references.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
Association
→ General relationship


Aggregation
→ Weak HAS-A
→ Independent lifecycle


Composition
→ Strong HAS-A
→ Dependent lifecycle


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. What is aggregation?

Answer:
Aggregation is a weak HAS-A relationship where the
contained object can exist independently of the container.


10. MY OWN EXAMPLE
----------------------------------------------------------
Team HAS-A Player.

If the Team is removed, the Player can still exist and
can join another team.


11. COMMON MISTAKES
----------------------------------------------------------
❌ Thinking aggregation means the child must be destroyed
when the parent is destroyed.

That is Composition.


12. ONE-LINE REVISION
----------------------------------------------------------
Aggregation = Weak HAS-A relationship + independent
lifecycle.

INTERVIEW LINE:
"Aggregation is a weak HAS-A relationship in which the
contained object can exist independently of the container."
==========================================================
*/