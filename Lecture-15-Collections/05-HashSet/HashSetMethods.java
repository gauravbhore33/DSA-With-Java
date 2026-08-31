/*
==================================================
                HASHSET METHODS
==================================================

IMPORTANT:
HashSet stores UNIQUE elements and provides fast
average-time search, insertion and deletion.

==================================================
*/

import java.util.*;

public class HashSetMethods {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Add
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);       // Duplicate ignored

        System.out.println(set);

        // Search
        System.out.println(set.contains(20));

        // Remove
        set.remove(10);

        // Size
        System.out.println(set.size());

        // Check empty
        System.out.println(set.isEmpty());

        // Clear
        set.clear();

        System.out.println(set);
    }
}

/*
OUTPUT:

[10, 20, 30]
true
2
false
[]


MOST IMPORTANT METHODS:

add(x)       → Add
remove(x)    → Remove
contains(x)  → Search
size()       → Number of elements
isEmpty()    → Check empty
clear()      → Remove all


DSA USE:
Use HashSet when you need fast average-time lookup
and only UNIQUE values.


INTERVIEW:
Q. How does HashSet identify duplicates?
A. It uses hashCode() and equals().

Q. Can HashSet store duplicate objects?
A. It does not store duplicates according to the
   equals/hashCode contract.

Q. What is average time for add/contains/remove?
A. O(1) average.


ONE-LINE:
HashSet = Unique elements + Hashing + O(1) average lookup

==================================================
*/