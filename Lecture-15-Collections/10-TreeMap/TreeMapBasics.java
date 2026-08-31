/*
==================================================
                TREEMAP BASICS
==================================================

DEFINITION:
TreeMap stores KEY-VALUE pairs in SORTED ORDER
of keys.

IMPORTANT:
✓ Keys are unique
✓ Sorted by key
✓ No index-based access
✓ Basic operations are O(log n)
✓ Does not allow null keys with natural ordering

SYNTAX:
TreeMap<Integer, String> map = new TreeMap<>();

==================================================
*/

import java.util.*;

public class TreeMapBasics {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(103, "Amit");
        map.put(101, "Gaurav");
        map.put(102, "Rahul");

        System.out.println(map);

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
    }
}

/*
OUTPUT:

{101=Gaurav, 102=Rahul, 103=Amit}
First Key: 101
Last Key: 103


IMPORTANT METHODS:

put()       → Add / Update
get()       → Get value
remove()    → Remove
firstKey()  → Smallest key
lastKey()   → Largest key
containsKey() → Check key


HASHMAP vs LINKEDHASHMAP vs TREEMAP:

HashMap
→ No guaranteed order
→ O(1) average

LinkedHashMap
→ Insertion order
→ O(1) average

TreeMap
→ Sorted by key
→ O(log n)


REAL-WORLD:
Store students sorted by their roll number.


INTERVIEW:

Q. Does TreeMap allow duplicate keys?
A. No.

Q. How does TreeMap order entries?
A. By keys.

Q. What is the time complexity?
A. O(log n) for basic put, get and remove.


ONE-LINE:
TreeMap = Key-Value + Unique Keys + Sorted Keys

==================================================
*/