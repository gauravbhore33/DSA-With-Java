/*
==================================================
                 TREESET BASICS
==================================================

DEFINITION:
TreeSet is a Set implementation that stores UNIQUE
elements in sorted order.

IMPORTANT:
✓ No duplicates
✓ Sorted order
✓ No index-based access
✓ Uses a tree structure
✓ Basic operations are O(log n)

SYNTAX:
TreeSet<Integer> set = new TreeSet<>();

==================================================
*/

import java.util.*;

public class TreeSetBasics {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);       // Duplicate ignored

        System.out.println(set);

        System.out.println(set.first());
        System.out.println(set.last());
    }
}

/*
OUTPUT:

[10, 20, 30]
10
30


IMPORTANT METHODS:

add(x)      → Add
remove(x)   → Remove
contains(x) → Search
first()     → Smallest element
last()      → Largest element
size()      → Size


HASHSET vs LINKEDHASHSET vs TREESET:

HashSet
→ Unique
→ No guaranteed order
→ Average O(1)

LinkedHashSet
→ Unique
→ Insertion order
→ Average O(1)

TreeSet
→ Unique
→ Sorted order
→ O(log n)


REAL-WORLD:
Store student marks in sorted order without duplicates.


INTERVIEW:

Q. Does TreeSet allow duplicates?
A. No.

Q. Does TreeSet maintain sorted order?
A. Yes.

Q. Does TreeSet allow null?
A. Generally no; adding null to a natural-order
   TreeSet throws NullPointerException.

Q. What is the time complexity?
A. O(log n) for basic add, remove and contains.


ONE-LINE:
TreeSet = Unique + Sorted + O(log n)

==================================================
*/