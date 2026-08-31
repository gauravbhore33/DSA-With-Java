/*
==================================================
                     SET
==================================================

DEFINITION:
Set is an interface used to store UNIQUE elements.

IMPORTANT:
✓ Does NOT allow duplicates
✓ Generally not index-based
✓ Order depends on implementation

IMPLEMENTATIONS:
1. HashSet
2. LinkedHashSet
3. TreeSet

SYNTAX:
Set<Integer> set = new HashSet<>();

EXAMPLE:
*/

import java.util.*;

public class Set {

    public static void main(String[] args) {

        java.util.Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);
    }
}

/*
OUTPUT:
[20, 10]

(Order is not guaranteed in HashSet)

COMMON METHODS:
add()       → Add element
remove()    → Remove element
contains()  → Search element
size()      → Number of elements
clear()     → Remove all

REAL-WORLD:
Unique student IDs:
101, 102, 103, 101

Duplicate 101 is stored only once.

INTERVIEW:
Q. Does Set allow duplicates?
A. No.

Q. Is Set index-based?
A. No.

ONE-LINE:
Set = Unique elements + No index-based access

==================================================
*/