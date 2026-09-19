import java.util.*;
public class Reverseofanum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int num=9870;
        // int i=1;
        // int lastdigit;
        // while(i<=4){
        //     lastdigit=num%10;
        //       System.out.print(lastdigit);
        //               num=num/10;
        //     i++;
           
  
        // }
        // int num=584596;
        // int last;
        // while(num>0){
        //     last=num%10;
        //     System.out.print(last);
        //     num=num/10;


        // }
        int num=6789;
        int rev=0;
     
        while(num>0){
                  int last=num %10;
            rev=(rev*10)+last;
           
            num=num/10;

        }
         System.out.println(rev);
       



    
    }
    
}
