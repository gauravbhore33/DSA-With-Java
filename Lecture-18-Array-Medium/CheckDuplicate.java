public class CheckDuplicate {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 20};

        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                break;
            }
        }

        if (duplicate) {
            System.out.println("Duplicate Found");
        } else {
            System.out.println("No Duplicate");
        }
    }
}