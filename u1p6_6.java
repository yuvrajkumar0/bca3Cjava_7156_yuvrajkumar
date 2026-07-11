	import java.util.Scanner;
	public class u1p6_6{
	public static void main(String args[])

	{

	     Scanner input = new Scanner(System.in); 
             System.out.print("enter your name: ");
	     String name = input.nextLine();
		
             int i=0;
	     do
		{
		    System.out.println(name);
                    i++;
                }
		  while(i<10);
	}

	}