import java.util.*;
public class Primeinrange {
    public static boolean isprime(double prime){
        boolean pprime=true;
     
        for(int i=2;i<=Math.sqrt(prime);i++){
           if(prime%i==0){
            pprime=false;
           }

        }
        return pprime;
    }


          public static void inrange(double prime){

        for(int i=2;i<=prime;i++){
            if (isprime(i)){
              System.out.println(i);
            }
        } 
        System.out.println();
          }

    
    public static void main(String[] args) {
        isprime(11);
        inrange(11);                                                                    

        
    }
    
}
