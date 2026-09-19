import java.util.Scanner;

public class Invertedstarpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("o");
            }
            System.out.println();
    }

}
}
