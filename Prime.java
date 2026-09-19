import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
               isprime=true;
            }
            else{
isprime=false;
            }
        }
        if(isprime=true){
            System.out.println("prime");
        }
        else{
            System.out.println("not");
        }
    }
    
}
