/*
==================================================
                    VECTOR
==================================================

DEFINITION:
Vector is a dynamic array that implements the List
interface. Its methods are synchronized.

IMPORTANT:
✓ Dynamic size
✓ Maintains insertion order
✓ Allows duplicates
✓ Index-based
✓ Synchronized (thread-safe)
✓ Legacy class

SYNTAX:
Vector<Integer> v = new Vector<>();

==================================================
*/

import java.util.*;

public class VectorBasics {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println(v);

        System.out.println(v.get(1));
        System.out.println(v.size());
    }
}

/*
OUTPUT:

[10, 20, 30]
20
3


ARRAYLIST vs VECTOR:

ArrayList
→ Not synchronized
→ Generally faster
→ Preferred in most single-threaded cases

Vector
→ Synchronized
→ Generally slower
→ Legacy class


IMPORTANT METHODS:

add()       → Add
get()       → Access
remove()    → Remove
size()      → Size
capacity()  → Current capacity


INTERVIEW:

Q. Is Vector synchronized?
A. Yes.

Q. Is Vector a legacy class?
A. Yes.

Q. ArrayList or Vector?
A. ArrayList is generally preferred unless the specific
   synchronization behavior of Vector is required.


ONE-LINE:
Vector = Dynamic Array + Synchronized + Legacy List

==================================================
*/