/*
==========================================================
          MULTIPLE INHERITANCE USING INTERFACE
==========================================================

1. DEFINITION
----------------------------------------------------------
Multiple inheritance means a class gets behavior from more
than one parent.

Java does NOT support multiple inheritance using classes,
but it supports it through interfaces.

2. WHY DO WE NEED IT?
----------------------------------------------------------
- Allows one class to implement multiple contracts
- Supports abstraction
- Avoids the diamond problem of class inheritance
- Useful when a class needs multiple capabilities

3. TYPES
----------------------------------------------------------
Multiple inheritance using interfaces:

Interface A ──┐
              ├──> Child Class
Interface B ──┘

4. SYNTAX
----------------------------------------------------------

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    // implement both methods
}

5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class MultipleInheritanceUsingInterface {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.playMusic();
    }
}

/*
OUTPUT:

Taking photo
Playing music


6. REAL-WORLD EXAMPLE
----------------------------------------------------------
A smartphone can have multiple capabilities:

Camera
MusicPlayer
GPS
Internet

Instead of inheriting from multiple classes, we can use
multiple interfaces.

class Smartphone implements Camera, MusicPlayer, GPS


7. IMPORTANT KEYWORDS
----------------------------------------------------------

interface
→ Creates an interface.

implements
→ Allows a class to implement one or more interfaces.

@Override
→ Indicates implementation of an interface method.


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

MULTIPLE INHERITANCE USING CLASSES

class Child extends A, B

❌ Not allowed in Java.


MULTIPLE INHERITANCE USING INTERFACES

class Child implements A, B

✅ Allowed in Java.


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. Does Java support multiple inheritance?

Answer:
Java does not support multiple inheritance through
classes, but it supports multiple inheritance through
interfaces.


Q2. How can a class implement multiple interfaces?

Answer:

class Smartphone implements Camera, MusicPlayer {
}


Q3. Can an interface extend multiple interfaces?

Answer:
Yes.

Example:

interface C extends A, B {
}


Q4. Why does Java avoid multiple inheritance using
classes?

Answer:
Mainly to avoid ambiguity, commonly explained using the
Diamond Problem.


10. MY OWN EXAMPLE
----------------------------------------------------------

Create:

interface Vehicle {
    void start();
}

interface Electric {
    void charge();
}

class ElectricCar implements Vehicle, Electric {

    public void start() {
        System.out.println("Car started");
    }

    public void charge() {
        System.out.println("Car charging");
    }
}


11. COMMON MISTAKES
----------------------------------------------------------

❌ Wrong:

class Smartphone extends Camera, MusicPlayer

Correct:

class Smartphone implements Camera, MusicPlayer


❌ Forgetting to implement interface methods.

A concrete class must implement all required abstract
interface methods.


❌ Forgetting public:

void takePhoto()

When implementing an interface method, use:

public void takePhoto()


12. ONE-LINE REVISION
----------------------------------------------------------
Multiple Inheritance in Java = One class implements
multiple interfaces.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Java does not support multiple inheritance through
classes because of ambiguity, but a class can implement
multiple interfaces to achieve multiple inheritance."

==========================================================
*/