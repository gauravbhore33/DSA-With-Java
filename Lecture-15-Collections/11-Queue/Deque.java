/*
==================================================
                     DEQUE
==================================================

DEFINITION:
Deque = Double Ended Queue.

It allows insertion and removal from BOTH ends.

IMPORTANT:
✓ Add from front
✓ Add from rear
✓ Remove from front
✓ Remove from rear
✓ Can work as Queue or Stack

SYNTAX:
Deque<Integer> dq = new ArrayDeque<>();

==================================================
*/

import java.util.*;

public class Deque {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq);

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

        System.out.println(dq);
    }
}

/*
OUTPUT:

[5, 10, 20]
5
20
[10]


IMPORTANT METHODS:

addFirst(x)     → Add at front
addLast(x)      → Add at rear
removeFirst()   → Remove front
removeLast()    → Remove rear
peekFirst()     → View front
peekLast()      → View rear


REAL-WORLD:
A queue where people can enter or leave from
both ends.


QUEUE vs DEQUE:

Queue
→ Mainly one end for insertion and one for removal

Deque
→ Both ends can be used


INTERVIEW:

Q. What does Deque stand for?
A. Double Ended Queue.

Q. Can Deque work as a Stack?
A. Yes.

Q. Common implementation?
A. ArrayDeque.


ONE-LINE:
Deque = Double-ended queue

==================================================
*/