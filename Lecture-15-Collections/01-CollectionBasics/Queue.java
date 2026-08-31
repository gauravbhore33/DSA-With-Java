/*
==================================================
                    QUEUE
==================================================

DEFINITION:
Queue is an interface used to store elements where
elements are generally processed in FIFO order.

FIFO = First In First Out

IMPORTANT:
✓ FIFO
✓ First element added is generally processed first
✓ Useful for scheduling and waiting systems

IMPLEMENTATIONS:
1. LinkedList
2. PriorityQueue
3. ArrayDeque

SYNTAX:
Queue<Integer> queue = new LinkedList<>();

EXAMPLE:
*/

import java.util.*;

public class Queue {

    public static void main(String[] args) {

        java.util.Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);

        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue: " + queue);
    }
}

/*
OUTPUT:

[10, 20, 30]
Removed: 10
Queue: [20, 30]

IMPORTANT METHODS:

add()      → Add element
offer()    → Add element
poll()     → Remove first element
peek()     → View first element
remove()   → Remove first element

REAL-WORLD:
People waiting in a ticket line:

First person → First served

INTERVIEW:
Q. What principle does Queue generally follow?
A. FIFO.

Q. Which method removes the first element?
A. poll().

Q. Which method only views the first element?
A. peek().

ONE-LINE:
Queue = FIFO → First In, First Out

==================================================
*/