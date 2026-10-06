import java.util.*;
public class Largestinarray{
    public static void large(int arr[]){
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if (arr[i]>max){
            max=arr[i];
        }
        if(min>arr[i]){
            min=arr[i];
        }


    }
   System.out.println("smallest"+min);
    System.out.println("   "+max+"is max");

}
    public static void main (String[]args){
        Scanner sc= new Scanner (System.in);
        int  n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        large(arr);

    }
}