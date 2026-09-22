import java.util.*;


public class Primeoptimised {
    public static boolean isprime(int n){
   
    for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            return false;
   
}

}
 return true;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(isprime(10));
        // int n=sc.nextInt();
      
        // for(int i=2;i*i<=n;i++){

        //     if(n%i==0){
        //         System.out.println("not"); 
        //         break;
        //     }
        //     else{
        //        System.out.println("yes");
        //        break;
        //     }
}
    }

