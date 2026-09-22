import java.util.*;
public class Primeornotusingfunction {


    public static boolean prime(int n){
        boolean prime=false;
        if(n==2){
            System.out.println(true);
        }
        for(int i=2;i<n;i++){
            if(n%i!=0){
            prime= true;
            System.out.println(" prime");
            break;
            }
           
           

        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println(prime(3));
    }
    
}
