import java .util.*;
public class Areaofcircle{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int radius=sc.nextInt();
        float pi=3.14f  ;
       float perimeter= 2*pi*radius;
       float area=pi*radius*radius;
       System.out.println(perimeter);
       System.out.println(area);
    }
}