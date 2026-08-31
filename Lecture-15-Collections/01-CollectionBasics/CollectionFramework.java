/*
==========================================================
              COLLECTION FRAMEWORK
==========================================================

1. DEFINITION
----------------------------------------------------------
Java Collection Framework (JCF) is a set of classes and
interfaces used to store and manipulate groups of objects.

It provides ready-made data structures such as:

ArrayList
LinkedList
HashSet
TreeSet
HashMap
PriorityQueue
etc.


2. WHY DO WE NEED IT?
----------------------------------------------------------
Normal arrays have limitations:

- Fixed size
- Limited built-in operations
- Manual searching/sorting
- Difficult insertion/deletion

Collections provide:

✓ Dynamic size
✓ Ready-made methods
✓ Easy insertion/deletion
✓ Searching and sorting utilities
✓ Different data structures for different requirements


3. MAIN PARTS
----------------------------------------------------------

Collection Framework
        |
        ├── List
        │    ├── ArrayList
        │    ├── LinkedList
        │    └── Vector
        │
        ├── Set
        │    ├── HashSet
        │    ├── LinkedHashSet
        │    └── TreeSet
        │
        └── Queue
             ├── PriorityQueue
             └── Deque


Map is also part of the Collection Framework concept,
but Map does NOT extend the Collection interface.

        Map
         |
         ├── HashMap
         ├── LinkedHashMap
         └── TreeMap


4. SYNTAX
----------------------------------------------------------

List:

List<Integer> list = new ArrayList<>();

Set:

Set<Integer> set = new HashSet<>();

Map:

Map<Integer, String> map = new HashMap<>();


5. SIMPLE EXAMPLE
----------------------------------------------------------
*/

import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {

        // List
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("List: " + numbers);


        // Set
        Set<Integer> uniqueNumbers = new HashSet<>();

        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10);

        System.out.println("Set: " + uniqueNumbers);


        // Map
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Gaurav");
        students.put(102, "Rahul");

        System.out.println("Map: " + students);
    }
}

/*
OUTPUT:

List: [10, 20, 30]

Set: [10, 20]

Map: {101=Gaurav, 102=Rahul}

(Note: HashSet and HashMap order is not guaranteed.)


6. REAL-WORLD EXAMPLE
----------------------------------------------------------

Student Management System:

ArrayList
→ Store students in a sequence.

HashSet
→ Store unique student IDs.

HashMap
→ Store:

Student ID → Student Name


Example:

101 → Gaurav
102 → Rahul


7. IMPORTANT INTERFACES
----------------------------------------------------------

Collection
│
├── List
├── Set
└── Queue


Map
→ Separate interface


IMPORTANT:

Map does NOT extend Collection.


8. IMPORTANT CLASSES
----------------------------------------------------------

List:
- ArrayList
- LinkedList
- Vector

Set:
- HashSet
- LinkedHashSet
- TreeSet

Queue:
- PriorityQueue
- ArrayDeque

Map:
- HashMap
- LinkedHashMap
- TreeMap
- Hashtable


9. IMPORTANT DIFFERENCES
----------------------------------------------------------

LIST
→ Allows duplicates
→ Maintains insertion order
→ Index-based access


SET
→ Does not allow duplicate elements
→ Usually not index-based


MAP
→ Stores key-value pairs
→ Keys are unique


Example:

List:
[10, 20, 10]


Set:
[10, 20]


Map:
101 → Gaurav
102 → Rahul


10. COMMON COLLECTION METHODS
----------------------------------------------------------

add()
→ Adds an element


remove()
→ Removes an element


contains()
→ Checks whether element exists


size()
→ Returns number of elements


isEmpty()
→ Checks whether collection is empty


clear()
→ Removes all elements


11. INTERVIEW QUESTIONS
----------------------------------------------------------

Q1. What is Collection Framework?

Answer:
Collection Framework is a set of interfaces and classes
provided by Java to store and manipulate groups of objects.


Q2. What are the main interfaces?

Answer:

List
Set
Queue

Map is a separate interface.


Q3. Is Map a child of Collection?

Answer:
No.

Map does not extend Collection.


Q4. Difference between List, Set and Map?

Answer:

List:
Allows duplicates and maintains order.

Set:
Does not allow duplicate elements.

Map:
Stores key-value pairs with unique keys.


Q5. Why are collections better than arrays?

Answer:
Collections provide dynamic sizing and many ready-made
methods for manipulating data, while arrays have fixed
size.


Q6. Can collections store primitive data types?

Answer:
No.

Collections store objects.

Wrapper classes are used for primitives.

Example:

List<Integer> numbers = new ArrayList<>();

Not:

List<int> numbers;  // ❌


12. MY OWN EXAMPLE
----------------------------------------------------------

List<String> names = new ArrayList<>();

names.add("Gaurav");
names.add("Rahul");
names.add("Amit");

System.out.println(names);


13. COMMON MISTAKES
----------------------------------------------------------

❌ Writing:

List<int>

Correct:

List<Integer>


❌ Thinking Map extends Collection.

It does not.


❌ Assuming HashSet always maintains insertion order.

It does not guarantee order.


❌ Using ArrayList for every problem without considering
   the required operations.


14. ONE-LINE REVISION
----------------------------------------------------------

Collection Framework = Java's ready-made system of
interfaces and classes for storing and manipulating
groups of objects.


==========================================================
INTERVIEW GOLDEN LINE
==========================================================

"Java Collection Framework provides a standard set of
interfaces and classes such as List, Set, Queue and Map
for storing and manipulating groups of objects efficiently."

==========================================================
*/