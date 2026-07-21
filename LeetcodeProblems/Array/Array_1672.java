public class Array_1672 {

    public static void main(String[] args) {

        int[][] accounts = {
            {1, 3, 5},
            {3, 5, 2},
            {10, 20, 30}
        };

        int maximumWealth = 0;

        for (int[] customer : accounts) {

            int currentWealth = 0;

            for (int money : customer) {
                currentWealth += money;
            }

            maximumWealth = Math.max(maximumWealth, currentWealth);
        }

        System.out.println("Richest Customer Wealth: " + maximumWealth);
    }
}