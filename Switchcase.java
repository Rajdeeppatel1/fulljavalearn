import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String week=sc.nextLine();
        switch (week){
            case "first":
            
                System.out.println("monday");
                break;
            
            case "second":
                System.out.println("tuesday");
                break;

            default:
                System.out.println("holiday");
            
        }
    }
    
}
