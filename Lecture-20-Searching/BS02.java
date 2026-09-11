public class BS02 {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25, 30, 35, 40};
        int target = 25;

        boolean found=false;
        int index=-1;

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
                found=true;
                index=mid;
                break;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if (found){
            System.out.println("Element Found At Index: "+index);
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
