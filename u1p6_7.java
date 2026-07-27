	import java.util.Scanner;
	public class u1p6_7{
	public static void main(String args[])

	{

	     Scanner input = new Scanner(System.in); 
             System.out.print("enter your name: ");
	     String name = input.nextLine();
	    
	     System.out.print("how many time your want to print: ");
	     int num = input.nextInt();
		 for(int i=0; i<num; i++)

		{

		  System.out.println(name);	
		
		}

	}
	
	}