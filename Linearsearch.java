public class Linearsearch {
    public static void search( int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("element found at index"+i);
            }

        }
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,56,6,7,9};
        search(arr, 56);
        
    }
    
}
