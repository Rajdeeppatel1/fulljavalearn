public class Binarysearch {
    public static  int search(int arr[],int key){
        int start =0,end=arr.length-1;
        while(start<=end){
             int mid =(start+end)/2;
             if (arr[mid]==key){
                return mid;
             }
             if(key>arr[mid]){
                start =mid+1;
             }
             else{
                end=mid-1;
             }
        }

        return -1;
        }
    


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int key =7;
        System.out.println(search(arr,key ));
        
    }
}