

public class BSLastOccurence {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 30, 40, 50};
        int target = 20;

        int answer=-1;

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
                answer=mid;
                low=mid+1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(answer!=-1){
            System.out.println("Last occurrence of 20 is at index: "+answer);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
