public class Arithmeticoperators {
    public static void main(String[] args) {
        int a=55;
        int b=9;
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int rem=a%b;
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
        //unary
        int c=a++;
        System.out.println(c);
        System.out.println(++a);//preincrement
        System.out.println(--b);//preincrement
        System.out.println(a++);//postincrement
        System.out.println(b--);//postincrement
        System.out.println(a);
        System.out.println(b);
    }
    
}
