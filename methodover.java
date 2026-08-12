import java.util.Scanner;
class calculate
{
	void sum(int a,int b){
	System.out.println(a+b);
	}
	void sum(int a,int b,int c){
	System.out.print(a+b+c);
	}	
}
public class methodover{
	public static void main(String args[])
	{
		 Scanner input = new Scanner(System.in);
		 System.out.println("please enter your first value: ");
		 int a = input.nextInt();
		 System.out.println("please enter your second value: ");
		 int b = input.nextInt();
		 System.out.println("please enter your third value: ");
		 int c = input.nextInt();
		 
		calculate total = new calculate();
		total.sum(a,b);
		total.sum(a,b,c);
	}
}
		
		