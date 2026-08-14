/*
==========================================================
                    COMPOSITION
==========================================================

1. DEFINITION
----------------------------------------------------------
Composition is a strong HAS-A relationship where the child
object depends on the parent object for its lifecycle.

If the parent object is destroyed, its contained object
cannot meaningfully exist as part of that parent.


2. WHY DO WE NEED IT?
----------------------------------------------------------
- Represents strong ownership
- Models dependent objects
- Shows lifecycle dependency
- Helps design real-world whole-part relationships


3. TYPES
----------------------------------------------------------
Composition is a strong form of association.

Example:

House HAS-A Room

The Room is considered part of that particular House.


4. SYNTAX
----------------------------------------------------------

class House {

    private Room room = new Room();
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

class Room {

    void show() {
        System.out.println("Room belongs to the house");
    }
}

class House {

    private Room room;

    House() {
        room = new Room();
    }

    void showRoom() {
        room.show();
    }
}

public class Composition {

    public static void main(String[] args) {

        House house = new House();

        house.showRoom();
    }
}

/*
OUTPUT:

Room belongs to the house


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
House HAS-A Room.

The Room is created as part of the House.

The House controls the lifecycle of the Room.

This represents Composition.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
No special keyword is required.

Composition is usually represented by creating the
dependent object inside the owner.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------
Aggregation
→ Weak HAS-A
→ Objects have independent lifecycles


Composition
→ Strong HAS-A
→ Dependent object lifecycle


Example:

Aggregation:
Department HAS-A Teacher

Composition:
House HAS-A Room


9. INTERVIEW QUESTION
----------------------------------------------------------
Q. What is composition?

Answer:
Composition is a strong HAS-A relationship where the
contained object is strongly owned by the parent and its
lifecycle is dependent on the parent.


10. MY OWN EXAMPLE
----------------------------------------------------------
Car HAS-A Engine.

The Car creates and owns its Engine.

The Engine is considered a part of that Car.


11. COMMON MISTAKES
----------------------------------------------------------
❌ Thinking Composition and Aggregation are the same.

Aggregation → weak ownership
Composition → strong ownership


12. ONE-LINE REVISION
----------------------------------------------------------
Composition = Strong HAS-A relationship + dependent
lifecycle.

INTERVIEW LINE:
"Composition represents strong ownership where the
contained object's lifecycle is dependent on the
containing object."
==========================================================
*/