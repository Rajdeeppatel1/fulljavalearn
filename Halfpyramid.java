import java.util.Scanner;

public class Halfpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int line=1;line<=4;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
    
}
