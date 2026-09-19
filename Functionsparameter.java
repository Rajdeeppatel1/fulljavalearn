import java.util.Scanner;

public class Functionsparameter {
    // public static int add(int a, int b){
    //     System.out.println(a+b);
    //     return 0;
    // }

    // public static void calculatesum(int a, int b){
    //     int sum=a+b;
    //     System.out.println(sum);
    // }


    public static int plus(int x,int y){
        int sum=x+y;
        return sum;
    }
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        // add(3,5);

        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // calculatesum(a,b);


       int plus=plus(4, 5);
       System.out.println(plus(5, 2));


    }
}
