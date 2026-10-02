public class Basic {
    public static void main(String[] args) {
        int arr[]={ 2, 4, 6, 8, 10};
        int target=14;

        int i=0;
        int j=arr.length-1;

        while ( i < j){
            int sum=arr[i]+arr[j];

            if (sum==target){
                System.out.println("Pair found: "+ arr[i]+" "+arr[j]);
                break;
            }
            else if ( sum> target){
                j--;
            }
            else{
                i++;
            }
        }
    }
}