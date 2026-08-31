/*
==================================================
                    LIST
==================================================

DEFINITION:
List is an interface that stores elements in an
ordered collection and allows duplicate values.

IMPORTANT:
✓ Maintains insertion order
✓ Allows duplicates
✓ Index-based access
✓ Allows null values

IMPLEMENTATIONS:
1. ArrayList
2. LinkedList
3. Vector
4. Stack

SYNTAX:
List<Integer> list = new ArrayList<>();

EXAMPLE:
*/

import java.util.*;

public class List {

    public static void main(String[] args) {

        java.util.List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);
        System.out.println(numbers.get(1));
    }
}

/*
OUTPUT:
[10, 20, 10]
20

COMMON METHODS:
add()       → Add element
get()       → Get element
remove()    → Remove element
set()       → Update element
contains()  → Search element
size()      → Number of elements

REAL-WORLD:
List of students:
[Gaurav, Rahul, Amit, Gaurav]

INTERVIEW:
Q. Does List allow duplicates?
A. Yes.

Q. Does List maintain order?
A. Yes.

ONE-LINE:
List = Ordered + Duplicate allowed + Index-based

==================================================
*/