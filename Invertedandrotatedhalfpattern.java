import java.util.*;
public class Invertedandrotatedhalfpattern {
    public static void invertedpyramid(int row){
                
        int col=5; 
        for(int i=1 ;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
          
                
                
            }
                  for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
           
        } 

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        invertedpyramid(5);
       
        
    }
    
}
