
import java.util.*;
public class Binarytodecimal {
    public static void binarytodec(int binnum){
        int power=0;
        int decnum=0;
       while(binnum>0){
        int lastdigit = binnum%10;
        decnum=decnum +(lastdigit*(int)Math.pow(2, power));
        power++;
        binnum=binnum/10;
       }
       System.out.println(decnum);
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        binarytodec(101);


    }
    
}
