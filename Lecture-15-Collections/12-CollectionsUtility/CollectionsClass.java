/*
==================================================
              COLLECTIONS UTILITY CLASS
==================================================

DEFINITION:
Collections is a utility class in java.util that provides
static methods for working with collections.

IMPORTANT:
✓ sort()
✓ reverse()
✓ shuffle()
✓ max()
✓ min()
✓ binarySearch()

SYNTAX:
Collections.method(collection);

==================================================
*/

import java.util.*;

public class CollectionsClass {

    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(30, 10, 20));

        // Sort
        Collections.sort(list);
        System.out.println(list);

        // Reverse
        Collections.reverse(list);
        System.out.println(list);

        // Maximum
        System.out.println(Collections.max(list));

        // Minimum
        System.out.println(Collections.min(list));
    }
}

/*
OUTPUT:

[10, 20, 30]
[30, 20, 10]
30
10


IMPORTANT METHODS:

sort()          → Sort collection
reverse()       → Reverse order
shuffle()       → Randomly rearrange
max()            → Largest element
min()            → Smallest element
binarySearch()  → Search sorted list


COLLECTION vs COLLECTIONS:

Collection
→ Interface
→ Represents a group of objects

Collections
→ Utility class
→ Provides methods to manipulate collections


INTERVIEW:

Q. What is Collections?
A. A utility class in java.util containing static methods
   for collection operations.

Q. Is Collections an interface?
A. No. It is a class.


ONE-LINE:
Collections = Utility class for manipulating collections.

==================================================
*/