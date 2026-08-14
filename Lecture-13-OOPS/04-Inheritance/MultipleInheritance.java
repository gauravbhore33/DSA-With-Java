/*
==========================================================
                MULTIPLE INHERITANCE
==========================================================

1. DEFINITION
----------------------------------------------------------
Multiple inheritance means a child class inherits from
more than one parent class.

Example:

        A       B
         \     /
           \ /
            C

C inherits from both A and B.


2. WHY DO WE NEED IT?
----------------------------------------------------------
It allows a class to get functionality from multiple
sources.

However, Java does NOT support multiple inheritance
using classes because it can create ambiguity.


3. TYPES
----------------------------------------------------------

Using classes:

class A { }
class B { }

// ❌ Not allowed in Java
class C extends A, B { }


Using interfaces:

interface A { }
interface B { }

// ✅ Allowed
class C implements A, B { }


4. SYNTAX
----------------------------------------------------------

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {

    public void methodA() {
    }

    public void methodB() {
    }
}


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

interface Father {

    void fatherProperty();
}

interface Mother {

    void motherProperty();
}

class Child implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Child has father's property");
    }

    public void motherProperty() {
        System.out.println("Child has mother's property");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Child c = new Child();

        c.fatherProperty();
        c.motherProperty();
    }
}

/*
OUTPUT:

Child has father's property
Child has mother's property


6. REAL-WORLD EXAMPLE
----------------------------------------------------------

A Smartphone can have features from:

Camera
   +
Phone
   ↓
Smartphone

Using interfaces:

interface Camera {
    void takePhoto();
}

interface Phone {
    void makeCall();
}

class Smartphone implements Camera, Phone {
    ...
}

The Smartphone gets both capabilities.


7. IMPORTANT KEYWORDS
----------------------------------------------------------
interface
implements
extends

For multiple inheritance:

class Child implements Interface1, Interface2


8. DIFFERENCE FROM RELATED CONCEPT
----------------------------------------------------------

SINGLE INHERITANCE:

A
↓
B

One parent → One child


MULTIPLE INHERITANCE:

A     B
 \   /
   C

Multiple parents → One child


JAVA:

Multiple inheritance using classes
❌ Not supported

Multiple inheritance using interfaces
✅ Supported


9. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. Does Java support multiple inheritance?

Answer:

Java does NOT support multiple inheritance using classes.

However, Java supports multiple inheritance through
interfaces.


Q2. Why doesn't Java support multiple inheritance
through classes?

Answer:

Because of ambiguity, commonly explained using the
Diamond Problem.

Example:

        A
       / \
      B   C
       \ /
        D

If B and C both inherit a method from A and D inherits
from both B and C, Java would have ambiguity about which
implementation to use.


Q3. How can Java achieve multiple inheritance?

Answer:

Using interfaces.

Example:

class Child implements Father, Mother


Q4. Can a class implement multiple interfaces?

Answer:

Yes.

Example:

class Smartphone implements Camera, Phone, GPS


10. MY OWN EXAMPLE
----------------------------------------------------------

Create:

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Taking photo");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}

Create a Smartphone object and call both methods.


11. COMMON MISTAKES
----------------------------------------------------------

❌ Writing:

class Child extends Father, Mother

This is NOT allowed in Java.


Correct:

class Child implements Father, Mother


❌ Saying "Java does not support multiple inheritance."

This answer is incomplete.

Better interview answer:

"Java does not support multiple inheritance through
classes, but it supports it through interfaces."


12. ONE-LINE REVISION
----------------------------------------------------------
Multiple Inheritance = One child gets features from
multiple parents; Java supports this through interfaces,
not classes.

==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Java does not support multiple inheritance through
classes because it can cause ambiguity, but it supports
multiple inheritance through interfaces using the
implements keyword."

==========================================================
*/