public class ElementFound {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int target=50;

        boolean found=false;
        int index=-1;

        int low=0;
        int high=arr.length-1;

        while (low<=high){
           int mid=(low+high)/2;
            if(arr[mid]==target){
                found=true;
                index= mid;
                break;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(found){
            System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
