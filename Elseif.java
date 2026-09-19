import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//         Else if => 
// If{
//          }
// If {
//              }
// if if bar bar likha toh har bar check hoga lekin else if me ek bar true ho gya toh baki check nhi hoga  
// If(condition 1){
// }
// Else if(condition 2){
// }
// Else{
// }
int age=9;
if(age>=18){
    System.out.println("adult");
}
else if(age>12&&age<18){
    System.out.println("teenager");
}
else{
    System.out.println("childeren");
}


    }
    
}
