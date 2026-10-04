import java.util.Scanner;

public class Arrayinputoutput {
    public static  void arrayio(){
            Scanner sc= new Scanner(System.in);
        int marks[]= new int [100];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        System.out.println("maths " + marks[0]);
        System.out.println("eng"+marks[1]);
        int percent=(marks[0]+marks[1])/2;
        System.out.println(percent +  "%");
        System.out.println("array length"+ marks.length);
    }
    public static void main(String[] args) {
            
        
        arrayio();
        
    }
    
}
