	import java.util.Scanner;
	public class u1p7_4{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("please enter your age: ");
	int age = input.nextInt();
	if(age>60)
	{
		if(age<70)
		{
			System.out.print("you are old");
		}
		else
		{
			System.out.print("you are not old");
		}
	}
		 
		else
		{
			System.out.print("you are yound");
		}
			
	
	 }
}
