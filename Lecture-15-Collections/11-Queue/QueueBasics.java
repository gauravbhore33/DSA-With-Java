/*
==================================================
                 QUEUE BASICS
==================================================

DEFINITION:
Queue is used to store elements that are generally
processed in FIFO order.

FIFO = First In First Out

IMPORTANT:
✓ FIFO
✓ Insert at rear
✓ Remove from front

COMMON IMPLEMENTATIONS:
1. LinkedList
2. PriorityQueue
3. ArrayDeque

==================================================
*/

import java.util.*;

public class QueueBasics {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println(queue);
    }
}

/*
OUTPUT:

[10, 20, 30]
Front: 10
Removed: 10
[20, 30]


IMPORTANT METHODS:

offer(x) → Add
poll()   → Remove front
peek()   → View front
size()   → Size
isEmpty()→ Check empty


REAL-WORLD:
People waiting in a ticket queue:

First person enters
        ↓
First person gets served


INTERVIEW:

Q. What principle does Queue follow?
A. FIFO.

Q. Which method removes the front element?
A. poll().

Q. Which method views the front element?
A. peek().


ONE-LINE:
Queue = FIFO → First In, First Out

==================================================
*/