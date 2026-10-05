public class Linearsearch {
    public static int search( int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
      return i;
            }
          

        }
        return -1;
       
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,56,6,7,9};
       int ans= search(arr, 5416);
       if(ans!=-1){
                System.out.println("found at indeex"+ans);

       }
       else{
        System.out.println("not found");
       }

    }
    
}
