public class LargestElement {
    public static void main(String[] args) {
        int arr[]={23,43,54,64,23};
        int n=arr.length;

        int maxvalue=0;

        for (
            int i=0; i<=n-1; i++
        ){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        System.out.println(maxvalue);
    }
}
