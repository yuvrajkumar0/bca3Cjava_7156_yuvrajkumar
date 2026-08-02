// WaJP to swap two variables with and without 'temp' variable.
import java.util.Scanner;
public class ep_5{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter Value of A: ");
        int a = input.nextInt();
        System.out.print("please enter your value of B: ");
        int b = input.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
         System.out.println(" After Swip This Value: ");
         System.out.println(a + " value of A");  
           System.out.print(b + " value of B");  
    }
}
