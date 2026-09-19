import java.util.Scanner;

public class TypeCasting {//explicit 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float rr=555.44f;
        int num= (int)rr;//type casting we write  new data type in() that we want to change
        System.out.println(num);
        char a='a';//it gives character value 
        int charn=a;
        System.out.println(charn);
    }
}