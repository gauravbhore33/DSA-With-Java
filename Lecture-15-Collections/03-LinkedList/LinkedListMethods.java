/*
==================================================
            LINKEDLIST METHODS
==================================================

IMPORTANT METHODS:
add()        → Add element
addFirst()   → Add at beginning
addLast()    → Add at end
get()        → Get by index
getFirst()   → Get first
getLast()    → Get last
set()        → Update element
remove()     → Remove element
removeFirst()→ Remove first
removeLast() → Remove last
contains()   → Search element
size()       → Get size

==================================================
*/

import java.util.*;

public class LinkedListMethods {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // Add
        list.addFirst(5);
        list.addLast(40);

        // Get
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // Update
        list.set(1, 15);

        // Search
        System.out.println(list.contains(30));

        // Remove
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}

/*
OUTPUT:

20
5
40
true
[15, 20, 30]
Size: 3


INTERVIEW:

Q. Can LinkedList store duplicate values?
A. Yes.

Q. Can LinkedList store null?
A. Yes.

Q. Which methods are useful for first/last elements?
A. addFirst(), addLast(), removeFirst(),
   removeLast(), getFirst(), getLast()


ONE-LINE:
LinkedList methods = Add + Get + Update + Remove
                    from both ends.

==================================================
*/