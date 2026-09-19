import java.util.*;
public class Primenumber{
    public static void main (String[]args){
    Scanner sc= new Scanner (System.in);
    System.out.println("enter a prime number");
    // int n=sc.nextInt();
    // int count=0;
    // for(int i=1;i<=n;i++){
    //     if (n%i==0){
    //         count++;

    //     }
    // }
    // if (count==2){
    //     System.out.println("prime");
    // }
    // else{
    //     System.out.println("not prime");
    // }





    // int n=sc.nextInt();
    // int i=1;
    // int ans=0;
    // while(n>=i){

    //    if(n%i==0){
    //     ans++;
    //    } 
    //    i++;  
        
    // }
    // if(ans==2){
    //     System.out.println("prime");
    // }
    // else{
    //     System.out.println("not ");
    // }













    int n=sc.nextInt();
    int i=1;
    int ans=0;

    do{
      if(n%i==0){
        ans++;
      }
      
      i++;
      
    }
    while(n>i);
    if(ans==2){
        System.out.println("prime");
    }
    else{
        System.out.println("not");
    }
}
    
}
