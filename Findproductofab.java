import java.util.Scanner;

public class Findproductofab{
    public static int multiply(int a,int b)
    {
        int product=a*b;
        return  product;
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prod=multiply(3, 8);
        System.out.println(prod);

    }
}