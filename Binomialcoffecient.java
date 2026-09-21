import java.util.Scanner;

public class Binomialcoffecient {
    public static int Coffecient(int n,int c){
    int f=1;
    int r=1;
    for(int i=1;i<=n;i++){
        f=f*i;
   

    }
     for(int i=1;i<=c;i++){
     
        r=r*i;

    }
    int minus=n-c;
    int nminus=1;
    for(int i=1;i<=minus;i++){
        nminus=nminus*i;

    }

    int coffecient=f/(r*nminus);
    return coffecient;

}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(Coffecient(4,2));
    }
    
}
