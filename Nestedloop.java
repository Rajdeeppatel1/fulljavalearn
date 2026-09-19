import java.util.*;
public class Nestedloop {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //  for (int i=1;i<=4;i++){ // for lines 
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"); //for stars
        //     }
        //     System.out.println();
        //  }
        for(int i=1;i<=4;i++){
            for(int j=1; j<=i+1;j++){
                System.out.print("f");

            }
            System.out.println("  ");
         
    }
}}