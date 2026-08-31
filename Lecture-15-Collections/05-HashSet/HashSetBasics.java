/*
==================================================
                  HASHSET BASICS
==================================================

DEFINITION:
HashSet is a Set implementation used to store
unique elements.

IMPORTANT:
✓ No duplicates
✓ No guaranteed order
✓ Allows one null
✓ Fast add/search/remove on average

SYNTAX:
HashSet<Integer> set = new HashSet<>();

==================================================
*/

import java.util.*;

public class HashSetBasics {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);   // Duplicate ignored
        set.add(30);

        System.out.println(set);

        System.out.println(set.contains(20));

        set.remove(30);

        System.out.println(set);
    }
}

/*
OUTPUT:

[10, 20, 30]
true
[10, 20]

(Order is not guaranteed)


IMPORTANT METHODS:

add(x)       → Add element
remove(x)    → Remove element
contains(x)  → Search element
size()       → Get size
clear()      → Remove all


REAL-WORLD:
Store unique student IDs:

101
102
101  ← Duplicate ignored


HASHSET vs ARRAYLIST:

HashSet
→ Unique elements
→ No guaranteed order
→ No index

ArrayList
→ Duplicates allowed
→ Maintains order
→ Index-based


INTERVIEW:

Q. Does HashSet allow duplicates?
A. No.

Q. Does HashSet maintain insertion order?
A. No.

Q. Does HashSet allow null?
A. Yes, one null element.

Q. Is HashSet index-based?
A. No.


ONE-LINE:
HashSet = Unique + No guaranteed order + No index

==================================================
*/