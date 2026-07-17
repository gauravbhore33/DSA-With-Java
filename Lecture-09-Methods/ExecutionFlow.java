public class ExecutionFlow {

    public static void main(String[] args) {

        System.out.println("HI");

        solve();

        System.out.println("BYE");
    }   // <-- main() ENDS HERE

    static void solve() {

        System.out.println("HEY");

        int ans = add(1, 2);

        System.out.println("Answer = " + ans);

        System.out.println("BYE BYE");
    }   // <-- solve() ENDS HERE

    static int add(int a, int b) {

        System.out.println("HELLO");

        int ans = a + b;

        System.out.println("Returning Answer");

        return ans;
    }   // <-- add() ENDS HERE
}