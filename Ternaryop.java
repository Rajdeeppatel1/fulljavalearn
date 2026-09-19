import java.util.Scanner;

public class Ternaryop {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
//         	Ternary operator 
// 3 operands  if else in single line
//  Variable = condition? Statement1 : statement2;
// Boolean ans=(5>2)?true;false;
boolean larger= (5>3)?true:false;
System.out.println(larger);
String chor="shubham";
String ans=(chor=="shubham")?"YES":"NO";

System.out.println(ans);
 
int marks=44;
String result=(marks>=33)?"pass":"fail";
System.out.println(result);
    }
    
}
