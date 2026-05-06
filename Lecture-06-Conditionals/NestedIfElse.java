public class NestedIfElse {
    public static void main(String[] args) {
        boolean hasSubsciption= true;
        int solvedProblems = 220; 

        if(hasSubsciption){
            if(solvedProblems>=200){
                System.out.println("Unlock Advanced Sheet...");
            }
                else{
                System.out.println("Practice More Problems...");
            }
        }
            else{
                System.out.println("Upgrade To Premium...");
            }


            // ONE MORE PROGRAM

        int age = 11;
        char gender = 'F';

        if (gender == 'M') {
            System.out.println("YOU ARE MALE");

            if (age >= 18) {
                System.out.println("YOU ARE ADULT MEN");
            }

        } else {
            System.out.println("YOU ARE FEMALE");

            if (age >= 18) {
                System.out.println("YOU ARE ADULT FEMALE");
            }
        }
    }
}

