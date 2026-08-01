//WaJP to accept a number and check whether the number is even or odd. Prints 0 if number is odd
import java.util.Scanner;
public class ep_3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        if(num%2==0){
              System.out.print( num +" This number is even"+ " 0");
        }else{
              System.out.print(num+ " This number is Odd"+ " 1");
        }
    }
}