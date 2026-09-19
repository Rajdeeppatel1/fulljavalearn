import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    String sign=sc.next();
    switch(sign){
        case "+":
            System.out.println(a+b);
            break;

       case "-":
        System.out.println(a-b);
        break;

     case "*":
        System.out.println(a*b);
        break;

    case "/":
        System.out.println(a/b);
        break;
        default:
            System.out.println("incorrect input");
            Switch(variable){
// Case 1:

// Case2 :
 
// Case3:

// Default:
// }

// It will work according to case that we given to variable 
// And if no case is true then default execute

// If any one case is true it will execute all  case if we not use break;

    }
    

    
  }    
}
