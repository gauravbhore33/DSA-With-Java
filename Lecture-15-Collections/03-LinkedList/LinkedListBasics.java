/*
==================================================
              LINKEDLIST BASICS
==================================================

DEFINITION:
LinkedList is a List implementation based on linked
nodes. Each node stores data and links to other nodes.

IMPORTANT:
✓ Maintains insertion order
✓ Allows duplicates
✓ Dynamic size
✓ Index-based access
✓ Good for frequent insertion/deletion

SYNTAX:
LinkedList<Integer> list = new LinkedList<>();

==================================================
*/

import java.util.*;

public class LinkedListBasics {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // Add at beginning
        list.addFirst(5);

        // Add at end
        list.addLast(40);

        System.out.println(list);

        // Remove first
        list.removeFirst();

        // Remove last
        list.removeLast();

        System.out.println(list);
    }
}

/*
OUTPUT:

[5, 10, 20, 30, 40]
[10, 20, 30]


COMMON METHODS:

add()        → Add element
addFirst()   → Add at beginning
addLast()    → Add at end
removeFirst()→ Remove first
removeLast() → Remove last
getFirst()   → Get first
getLast()    → Get last


ARRAYLIST vs LINKEDLIST:

ArrayList
→ Faster random access
→ Better for frequent get()

LinkedList
→ Better suited for frequent insertion/deletion
  at the ends or when using linked-list operations.


INTERVIEW:

Q. Does LinkedList allow duplicates?
A. Yes.

Q. Does LinkedList maintain order?
A. Yes.

Q. ArrayList or LinkedList for get(index)?
A. ArrayList is generally faster.


ONE-LINE:
LinkedList = Nodes + Dynamic size + Easy insertion/deletion

==================================================
*/