import java.util.Scanner;

public class Arrayasfunctionargument {
    public static void arr(int marks[]){
    for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
    
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]={97,98,99};
                arr(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);

        }
        
    }
    
}
