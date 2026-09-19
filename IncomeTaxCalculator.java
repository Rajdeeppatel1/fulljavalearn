import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double income=sc.nextDouble();
        double Twenty=income*(20/100);
        double thirty=income*(30/100);
        if(income<500000){
            System.out.println("0%tax");
        }
        else if(income>=500000&&income<=100000){
            System.out.println("20%tax");
            System.out.println( income-Twenty);

        }
        else{
            System.out.println("30%tax");
            System.out.println(income -thirty);
        }
        
    }
    
}
