import java.util.*;
public class MaxofThree{
    public static void main(String [] args){
         Scanner sc =new Scanner(System.in);
         System.out.println("enter 1st no");
         int a=sc.nextInt();
           System.out.println("enter 2nd no");
         int b=sc.nextInt();
           System.out.println("enter 3rd no");
         int c=sc.nextInt();
         if (a>b){
            if(a>c){
                System.out.println("ismax"+a);
            }
         }
         if (b>a){
            if(b>c){
                System.out.println("ismax"+b);
            }
         }
         if(c>a){
            if(c>b){
                System.out.println("ismax"+c);
            }
            
         }
         if(a==b&&b==c){
                System.out.println("all are equal");
            }


            System.out.println("enter 1st no");
         int x=sc.nextInt();
           System.out.println("enter 2nd no");
         int y=sc.nextInt();
           System.out.println("enter 3rd no");
         int z=sc.nextInt();
         if(x>y&&x>z){
                   System.out.println("ismax"+x);
         }
          if(y>x&&y>z){
                   System.out.println("ismax"+y);
         }
          if(z>y&&z>x){
                   System.out.println("ismax"+z);
         }

         if(x>y&x>z){
            System.out.println("ismax"+x);
         }
         else if(y>x&&y>z){
            System.out.println("max is "+y);

         }
         else if(z>x&&z>y){
            System.out.println("max is"+z  );
         }
         else{
            System.out.println("all are eqqual");
         }
        

    }
}