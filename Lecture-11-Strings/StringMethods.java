public class StringMethods {

    public static void main(String[] args) {

        String str = "  Java Programming  ";

        System.out.println("Original String : \"" + str + "\"");

        // =========================================================
        // 1. length()
        // =========================================================
        System.out.println("\n1. length()");
        System.out.println("Length = " + str.length());



        // =========================================================
        // 2. charAt()
        // =========================================================
        System.out.println("\n2. charAt()");
        System.out.println("Character at Index 2 : " + str.charAt(2));



        // =========================================================
        // 3. toUpperCase()
        // =========================================================
        System.out.println("\n3. toUpperCase()");
        System.out.println(str.toUpperCase());



        // =========================================================
        // 4. toLowerCase()
        // =========================================================
        System.out.println("\n4. toLowerCase()");
        System.out.println(str.toLowerCase());



        // =========================================================
        // 5. trim()
        // =========================================================
        System.out.println("\n5. trim()");
        System.out.println("\"" + str.trim() + "\"");



        // =========================================================
        // 6. substring()
        // =========================================================
        System.out.println("\n6. substring()");
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 6));



        // =========================================================
        // 7. contains()
        // =========================================================
        System.out.println("\n7. contains()");
        System.out.println(str.contains("Java"));
        System.out.println(str.contains("Python"));



        // =========================================================
        // 8. indexOf()
        // =========================================================
        System.out.println("\n8. indexOf()");
        System.out.println(str.indexOf('P'));
        System.out.println(str.indexOf("gram"));



        // =========================================================
        // 9. lastIndexOf()
        // =========================================================
        System.out.println("\n9. lastIndexOf()");
        System.out.println(str.lastIndexOf('a'));



        // =========================================================
        // 10. startsWith()
        // =========================================================
        System.out.println("\n10. startsWith()");
        System.out.println(str.trim().startsWith("Java"));



        // =========================================================
        // 11. endsWith()
        // =========================================================
        System.out.println("\n11. endsWith()");
        System.out.println(str.trim().endsWith("ing"));



        // =========================================================
        // 12. replace()
        // =========================================================
        System.out.println("\n12. replace()");
        System.out.println(str.replace("Java", "Python"));



        // =========================================================
        // 13. isEmpty()
        // =========================================================
        System.out.println("\n13. isEmpty()");
        System.out.println(str.isEmpty());



        // =========================================================
        // 14. concat()
        // =========================================================
        System.out.println("\n14. concat()");
        System.out.println("Hello ".concat("World"));



        // =========================================================
        // 15. equals()
        // =========================================================
        System.out.println("\n15. equals()");
        System.out.println("Java".equals("Java"));
        System.out.println("Java".equals("java"));



        // =========================================================
        // 16. equalsIgnoreCase()
        // =========================================================
        System.out.println("\n16. equalsIgnoreCase()");
        System.out.println("Java".equalsIgnoreCase("JAVA"));
    }
}