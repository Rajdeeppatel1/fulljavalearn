import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class Callbyvalue {
    public static  void swap(int a, int b ){
        int temp=a;
         a=b;
        b=temp;
        System.out.println(a );
        System.out.println(b);
       
        
    }

    public static void change(int x){
         x=99;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     

     int a=9;
     int b=8;
     swap(a, b);
     System.out.println(a);




     int x=88;
     change(x);
     System.out.println(x);

        // //swap
        // int a=9;
        // int b=4;

        // int temp=a;
        //  a=b;
        // b=temp;
        // System.out.println("a ="+ a);
        // System.out.println(b);

          
    }
    
}
