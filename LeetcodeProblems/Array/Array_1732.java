public class Array_1732 {

    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int i = 0; i < gain.length; i++) {

            currentAltitude += gain[i];

            highestAltitude = Math.max(highestAltitude, currentAltitude);
        }

        System.out.println("Highest Altitude = " + highestAltitude);
    }
}