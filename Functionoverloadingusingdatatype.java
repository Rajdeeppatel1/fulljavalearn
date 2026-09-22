import java.util.Scanner;

public class Functionoverloadingusingdatatype {
    public static void overloading(int a, int b)
    {
      
        System.out.println(a+b);
    }
    public static void overloading(float a, float b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        overloading(3, 2);
        overloading(2.2f, 2.8f);

    }
}
