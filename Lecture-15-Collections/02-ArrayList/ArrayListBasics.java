/*
==================================================
                ARRAYLIST BASICS
==================================================

DEFINITION:
ArrayList is a resizable array implementation of
the List interface.

IMPORTANT:
✓ Dynamic size
✓ Maintains insertion order
✓ Allows duplicates
✓ Index-based
✓ Allows null values

SYNTAX:
ArrayList<Integer> list = new ArrayList<>();

EXAMPLE:
*/

import java.util.*;

public class ArrayListBasics {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println(list);

        System.out.println("Element: " + list.get(1));
        System.out.println("Size: " + list.size());
    }
}

/*
OUTPUT:

[10, 20, 30, 20]
Element: 20
Size: 4


IMPORTANT METHODS:

add(x)       → Add element
get(i)       → Get element
set(i, x)    → Update element
remove(i)    → Remove element
contains(x)  → Search element
size()       → Get size
clear()      → Remove all


REAL-WORLD:
Shopping cart:

[Phone, Laptop, Headphones]

Items can be added or removed dynamically.


ARRAY vs ARRAYLIST:

Array
→ Fixed size

ArrayList
→ Dynamic size


INTERVIEW:
Q. Is ArrayList ordered?
A. Yes.

Q. Does ArrayList allow duplicates?
A. Yes.

Q. Is ArrayList index-based?
A. Yes.

Q. Is ArrayList size fixed?
A. No, it grows dynamically.


ONE-LINE:
ArrayList = Dynamic Array + Ordered + Duplicates allowed

==================================================
*/