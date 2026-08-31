/*
==================================================
              LINKEDHASHMAP BASICS
==================================================

DEFINITION:
LinkedHashMap stores KEY-VALUE pairs and maintains
insertion order.

IMPORTANT:
✓ Key-value pairs
✓ Keys are unique
✓ Maintains insertion order
✓ Allows one null key
✓ Allows multiple null values

SYNTAX:
LinkedHashMap<Integer, String> map =
        new LinkedHashMap<>();

==================================================
*/

import java.util.*;

public class LinkedHashMapBasics {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>();

        map.put(101, "Gaurav");
        map.put(103, "Amit");
        map.put(102, "Rahul");

        System.out.println(map);
    }
}

/*
OUTPUT:

{101=Gaurav, 103=Amit, 102=Rahul}

Insertion order is maintained.


HASHMAP vs LINKEDHASHMAP:

HashMap
→ No guaranteed order

LinkedHashMap
→ Maintains insertion order


IMPORTANT METHODS:

put()          → Add / Update
get()          → Get value
remove()       → Remove
containsKey()  → Check key
size()         → Get size


REAL-WORLD:
Display recently added products in the same order
they were added.


INTERVIEW:

Q. Does LinkedHashMap maintain insertion order?
A. Yes.

Q. Are duplicate keys allowed?
A. No.

Q. Is LinkedHashMap generally slower than HashMap?
A. It has some extra overhead to maintain ordering.


ONE-LINE:
LinkedHashMap = HashMap + Insertion Order

==================================================
*/