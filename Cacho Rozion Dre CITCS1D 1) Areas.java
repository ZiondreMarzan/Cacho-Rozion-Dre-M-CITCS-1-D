package areas;
import java.util.*;
public class Areas {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        double r = sc.nextDouble();
        System.out.println("Triangle Base");
        int b = sc.nextInt();
        System.out.println("Triangle Height");
        int h = sc.nextInt();
        System.out.println("Enter Square Side");
        int s = sc.nextInt();
        
        
        double circle = Math.PI*Math.pow(r,2);
        double triangle = h*b/2;
        double square = Math.pow(s,2);
        
        System.out.println("Area of the Circle: "+circle);
        System.out.println("Area of the Triangle: "+triangle);
        System.out.println("Area of Square "+square);
    }
    
}
