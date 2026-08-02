// WaJP to print the area and perimeter of a rectangle and circle.
import java.util.Scanner;
public class ep_2{
    public static void main(String args []) {
        Scanner input = new Scanner (System.in);
        System.out.print("length of rectangle: ");
        int len = input.nextInt();
        
        System.out.print(" width of rectangle: ");
        int wid = input.nextInt();
         System.out.print(" Radius of circle ");
        float r = input.nextFloat();
        int perimeter;
         int area;
         System.out.println("perimeter of rectangle: " + 2 * (len*wid));
         System.out.println("Area of rectangle: "+ len*wid);
         double pi = 3.14;
         System.out.println("perimeter of Circle: " +2 * pi * r);
         System.out.println("Area of Circle: " + pi * r * r);
    }
}