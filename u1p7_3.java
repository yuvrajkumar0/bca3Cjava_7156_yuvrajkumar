	import java.util.Scanner;
	public class u1p7_3{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("please enter your age: ");
	int age = input.nextInt();
	if(age>60){
	System.out.print("you are old ");
	}
	   else if(age>18)
	  {
	  System.out.print("you are young ");
	  } else
	    {
		System.out.print("your are children");
		}
	  
	
   }
}
