import java.util.*;;
public class Keepentermulof10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
      do{
        System.out.println("enter num");
         int num= sc.nextInt();
        System.out.println(num);
        if(num%10!=0){
            break;
        }
         
       
      }
      while(true);
        
    }
    
}
