public class StringBuilderMethods {

    public static void main(String[] args) {

        // =========================================================
        // Creating a StringBuilder
        // =========================================================

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original StringBuilder : " + sb);



        // =========================================================
        // 1. append()
        // =========================================================

        sb.append(" Programming");

        System.out.println("\n1. append()");
        System.out.println(sb);



        // =========================================================
        // 2. insert()
        // =========================================================

        sb.insert(5, "Language ");

        System.out.println("\n2. insert()");
        System.out.println(sb);



        // =========================================================
        // 3. replace()
        // =========================================================

        sb.replace(0, 4, "Python");

        System.out.println("\n3. replace()");
        System.out.println(sb);



        // =========================================================
        // 4. delete()
        // =========================================================

        sb.delete(7, 16);

        System.out.println("\n4. delete()");
        System.out.println(sb);



        // =========================================================
        // 5. deleteCharAt()
        // =========================================================

        sb.deleteCharAt(6);

        System.out.println("\n5. deleteCharAt()");
        System.out.println(sb);



        // =========================================================
        // 6. setCharAt()
        // =========================================================

        sb.setCharAt(0, 'p');

        System.out.println("\n6. setCharAt()");
        System.out.println(sb);



        // =========================================================
        // 7. charAt()
        // =========================================================

        System.out.println("\n7. charAt()");
        System.out.println("Character at Index 2 : " + sb.charAt(2));



        // =========================================================
        // 8. length()
        // =========================================================

        System.out.println("\n8. length()");
        System.out.println(sb.length());



        // =========================================================
        // 9. reverse()
        // =========================================================

        sb.reverse();

        System.out.println("\n9. reverse()");
        System.out.println(sb);



        // =========================================================
        // 10. reverse() Again
        // =========================================================

        sb.reverse();

        System.out.println("\n10. reverse() Again");
        System.out.println(sb);



        // =========================================================
        // Final Result
        // =========================================================

        System.out.println("\nFinal StringBuilder : " + sb);

    }
}