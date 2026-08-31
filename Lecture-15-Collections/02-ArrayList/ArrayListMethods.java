/*
==================================================
              ARRAYLIST METHODS
==================================================

IMPORTANT METHODS:
add()       → Add element
get()       → Get element
set()       → Update element
remove()    → Remove element
contains()  → Check element
size()      → Get size
isEmpty()   → Check empty
clear()     → Remove all
indexOf()   → Find first index
lastIndexOf() → Find last index
==================================================
*/

import java.util.*;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Add
        names.add("Gaurav");
        names.add("Rahul");
        names.add("Amit");

        // Get
        System.out.println(names.get(0));

        // Update
        names.set(1, "Rohit");

        // Search
        System.out.println(names.contains("Amit"));

        // Index
        System.out.println(names.indexOf("Amit"));

        // Size
        System.out.println(names.size());

        // Remove
        names.remove("Amit");

        System.out.println(names);

        // Check empty
        System.out.println(names.isEmpty());
    }
}

/*
OUTPUT:

Gaurav
true
2
3
[Gaurav, Rohit]
false

ONE-LINE:
ArrayList methods = Add + Get + Update + Remove + Search
==================================================
*/