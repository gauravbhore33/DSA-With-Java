/*
==================================================
            ARRAYLIST ITERATION
==================================================

DEFINITION:
Iteration means accessing each element of an ArrayList
one by one.

COMMON WAYS:
1. for loop
2. for-each loop
3. Iterator
4. forEach()

==================================================
*/

import java.util.*;

public class ArrayListIteration {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Gaurav");
        names.add("Rahul");
        names.add("Amit");

        // 1. For loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // 2. For-each loop
        for (String name : names) {
            System.out.println(name);
        }

        // 3. Iterator
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

/*
OUTPUT:

Gaurav
Rahul
Amit

IMPORTANT:

for loop
→ Best when index is needed.

for-each
→ Simple way to access every element.

Iterator
→ Useful for safely removing elements while iterating.

KEY METHODS:

size()    → Number of elements
get(i)    → Access by index
hasNext() → Checks next element
next()    → Returns next element

INTERVIEW:

Q. How can we iterate ArrayList?
A. Using for loop, for-each loop, Iterator, or forEach().

ONE-LINE:
Iteration = Access ArrayList elements one by one.
==================================================
*/