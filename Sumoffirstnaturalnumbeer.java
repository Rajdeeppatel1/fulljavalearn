import java.util.*;
public class Sumoffirstnaturalnumbeer{
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        int number=sc.nextInt();
        int ans=0;
    
        for(int i=1;i<=number;i++){
          ans+=i;
        }
        System.out.println(ans);
    }
}