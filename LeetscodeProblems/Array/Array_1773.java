public class Array_1773 {

    public static void main(String[] args) {

        String[][] items = {
                {"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}
        };

        String ruleKey = "color";
        String ruleValue = "silver";

        int count = 0;

        for (int i = 0; i < items.length; i++) {

            if (ruleKey.equals("type")) {

                if (items[i][0].equals(ruleValue)) {
                    count++;
                }

            } else if (ruleKey.equals("color")) {

                if (items[i][1].equals(ruleValue)) {
                    count++;
                }

            } else if (ruleKey.equals("name")) {

                if (items[i][2].equals(ruleValue)) {
                    count++;
                }
            }
        }

        System.out.println("Matching Items = " + count);
    }
}