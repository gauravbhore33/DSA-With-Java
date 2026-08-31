/*
==================================================
                HASHMAP BASICS
==================================================

DEFINITION:
HashMap stores data in KEY-VALUE pairs.

IMPORTANT:
✓ Key must be unique
✓ Values can be duplicated
✓ No guaranteed order
✓ Allows one null key
✓ Allows multiple null values
✓ Average O(1) get/put/remove

SYNTAX:
HashMap<Integer, String> map = new HashMap<>();

==================================================
*/

import java.util.*;

public class HashMapBasics {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Gaurav");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        System.out.println(students);

        System.out.println(students.get(101));

        System.out.println(students.containsKey(102));
    }
}

/*
OUTPUT:

{101=Gaurav, 102=Rahul, 103=Amit}

Gaurav

true


IMPORTANT METHODS:

put(k, v)        → Add/update
get(k)           → Get value
remove(k)        → Remove key-value
containsKey(k)   → Check key
containsValue(v) → Check value
size()           → Number of entries
clear()          → Remove all


REAL-WORLD:
Student database:

101 → Gaurav
102 → Rahul
103 → Amit


KEY RULE:
If the same key is added again, its value is replaced.

Example:

map.put(101, "Gaurav");
map.put(101, "Rohit");

Result:

101 → Rohit


INTERVIEW:

Q. Does HashMap allow duplicate keys?
A. No.

Q. Can HashMap have duplicate values?
A. Yes.

Q. Does HashMap maintain insertion order?
A. No.

Q. Can HashMap have null?
A. Yes, one null key and multiple null values.


ONE-LINE:
HashMap = Key-Value + Unique Keys + O(1) average lookup

==================================================
*/