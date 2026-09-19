import java.util.*;
public class Sumoffirstnaturalno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range =sc.nextInt();
        int sum=0;
        int start=1;
             
        while (start<=range){
            
            sum=sum+start;
            start++;
           

           
        }
          System.out.println(sum);
     
    }
    
}
