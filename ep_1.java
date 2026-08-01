//1 - WaJP that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;
public class ep_1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + "*"+ i +"=" +num*i);
        }
    }
}