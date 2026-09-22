
import java.util.*;

public class Functionoverloadusingparameter {
    public static  int overload (int a, int b){
        return a+b;
    }
    public static int overload (int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println( overload(2, 3, 1));
        System.out.println(overload(1,3,4));
        //int function over loading  we do change no. of parameters or datatype of parameter but our function name will be same 
    }
}
