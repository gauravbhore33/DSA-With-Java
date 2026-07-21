public class StringComparison {

    public static void main(String[] args) {

        // =========================================================
        // Method 1 : Using ==
        // =========================================================

        String str1 = "Java";
        String str2 = "Java";

        System.out.println("Method 1 : Using ==");
        System.out.println("str1 == str2 : " + (str1 == str2));

        /*
         * Why Output is TRUE?
         *
         * Both variables point to the SAME object in the String Pool.
         *
         *          String Pool
         *        +------------+
         *        |   "Java"   |
         *        +------------+
         *          ↑        ↑
         *        str1     str2
         *
         * == compares memory references.
         * Since both references are the same, it returns TRUE.
         */

        System.out.println();


        // =========================================================
        // Method 2 : Using new String()
        // =========================================================

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println("Method 2 : Using new String()");
        System.out.println("str3 == str4 : " + (str3 == str4));

        /*
         * Why Output is FALSE?
         *
         * new String() creates two different objects in Heap Memory.
         *
         *      Heap Memory
         *
         *      str3 -----> "Java"
         *
         *      str4 -----> "Java"
         *
         * The contents are the same,
         * but the memory references are different.
         *
         * == compares memory references.
         */

        System.out.println();


        // =========================================================
        // Method 3 : Using equals()
        // =========================================================

        System.out.println("Method 3 : Using equals()");
        System.out.println("str3.equals(str4) : " + str3.equals(str4));

        /*
         * Why Output is TRUE?
         *
         * equals() compares the CONTENT of the strings,
         * not their memory addresses.
         *
         *      Java
         *      Java
         *
         * Since both contents are equal,
         * equals() returns TRUE.
         */

        System.out.println();


        // =========================================================
        // Method 4 : Using equalsIgnoreCase()
        // =========================================================

        String str5 = "JAVA";
        String str6 = "java";

        System.out.println("Method 4 : Using equalsIgnoreCase()");
        System.out.println("str5.equals(str6) : " + str5.equals(str6));
        System.out.println("str5.equalsIgnoreCase(str6) : " + str5.equalsIgnoreCase(str6));

        /*
         * Why?
         *
         * equals()
         * ------
         * Checks the content exactly.
         *
         * JAVA != java
         *
         * So it returns FALSE.
         *
         * equalsIgnoreCase()
         * ------------------
         * Ignores uppercase and lowercase letters.
         *
         * JAVA == java
         *
         * So it returns TRUE.
         */

        System.out.println();


        // =========================================================
        // Summary
        // =========================================================

        System.out.println("========== SUMMARY ==========");
        System.out.println("==                  -> Compares Memory Reference");
        System.out.println("equals()            -> Compares String Content");
        System.out.println("equalsIgnoreCase()  -> Compares Content (Ignores Case)");
    }
}