/*
==================================================
                HASHMAP METHODS
==================================================
*/

import java.util.*;

public class HashMapMethods {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Add
        map.put(101, "Gaurav");
        map.put(102, "Rahul");
        map.put(103, "Amit");

        // Get
        System.out.println(map.get(101));

        // Check key
        System.out.println(map.containsKey(102));

        // Check value
        System.out.println(map.containsValue("Amit"));

        // Update
        map.put(101, "Rohit");

        // Remove
        map.remove(103);

        // Size
        System.out.println(map.size());

        System.out.println(map);
    }
}

/*
IMPORTANT METHODS:

put(k,v)         → Add / Update
get(k)           → Get value
remove(k)        → Remove
containsKey(k)   → Check key
containsValue(v) → Check value
size()           → Number of entries
isEmpty()        → Check empty
clear()          → Remove all


IMPORTANT:
Same key → old value is replaced.

map.put(101, "Gaurav");
map.put(101, "Rohit");

Result:
101 → Rohit


DSA:
HashMap is commonly used for:

✓ Frequency counting
✓ Duplicate checking
✓ Two Sum
✓ Character counting
✓ Prefix Sum


ONE-LINE:
HashMap methods = put + get + remove + containsKey

==================================================
*/