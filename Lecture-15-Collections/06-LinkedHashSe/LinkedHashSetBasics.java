/*
==================================================
              LINKEDHASHSET BASICS
==================================================

DEFINITION:
LinkedHashSet is a Set that stores UNIQUE elements
and maintains insertion order.

IMPORTANT:
✓ No duplicates
✓ Maintains insertion order
✓ No index-based access
✓ Allows one null
✓ Uses hashing + linked structure

SYNTAX:
LinkedHashSet<Integer> set = new LinkedHashSet<>();

==================================================
*/

import java.util.*;

public class LinkedHashSetBasics {

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);       // Duplicate ignored

        System.out.println(set);
    }
}

/*
OUTPUT:

[30, 10, 20]

Insertion order is maintained.


HASHSET vs LINKEDHASHSET:

HashSet
→ Unique
→ No guaranteed order

LinkedHashSet
→ Unique
→ Maintains insertion order


IMPORTANT METHODS:

add()       → Add
remove()    → Remove
contains()  → Search
size()      → Size
clear()     → Remove all


REAL-WORLD:
Remove duplicate names while keeping their original
order.

Input:
Gaurav, Rahul, Gaurav, Amit

Result:
Gaurav, Rahul, Amit


INTERVIEW:

Q. Does LinkedHashSet allow duplicates?
A. No.

Q. Does it maintain insertion order?
A. Yes.

Q. Is it index-based?
A. No.


ONE-LINE:
LinkedHashSet = Unique + Insertion Order

==================================================
*/