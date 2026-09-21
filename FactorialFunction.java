import java.util.*;


public class FactorialFunction {

    public static int factorial(int n){
            int f=1;
        for(int i=1;i<=n;i++){
        f=f*i;
      
    }
      return f;

    }
    public static  void  findfact(int n , int r){
        int factn=factorial(n);
        int factr=factorial(r);
        int minus=factorial(n-r);
        System.out.println(factn/factr*minus);
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        findfact(5,3);
    }
}