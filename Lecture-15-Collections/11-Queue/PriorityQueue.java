/*
==================================================
                PRIORITY QUEUE
==================================================

DEFINITION:
PriorityQueue processes elements based on priority,
not simply insertion order.

By default → smallest element has highest priority.

IMPORTANT:
✓ No FIFO guarantee
✓ Default = min-heap behavior
✓ Duplicates allowed
✓ Does not allow null
✓ peek() gives highest-priority element

==================================================
*/

public class PriorityQueue {

    public static void main(String[] args) {

        java.util.PriorityQueue<Integer> pq =
                new java.util.PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("Top: " + pq.peek());

        System.out.println("Remove: " + pq.poll());
        System.out.println("Remove: " + pq.poll());
    }
}

/*
OUTPUT:

Top: 10
Remove: 10
Remove: 20


IMPORTANT METHODS:

offer(x) → Add
peek()   → View highest priority
poll()   → Remove highest priority
size()   → Size
isEmpty()→ Check empty


MAX-HEAP STYLE:

PriorityQueue<Integer> pq =
    new PriorityQueue<>(Collections.reverseOrder());


REAL-WORLD:
Hospital emergency system:

High-priority patient
        ↓
Served first


INTERVIEW:

Q. Does PriorityQueue follow FIFO?
A. No.

Q. What is the default priority?
A. Smallest element first.

Q. What data structure is commonly used internally?
A. Heap.


ONE-LINE:
PriorityQueue = Priority-based processing + Heap

==================================================
*/