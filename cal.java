import java.util.Scanner;

class calculate{
	int a, b;
	void add(){
	 System.out.println(a+b);
	}
	void sub(){
	 System.out.println(a-b);
	}
	void mul( ){
	 System.out.println(a*b);
	}
	void div( ){
	 System.out.println(a/b);
	}
	void mod( ){
	 System.out.println(a%b);
	}
}
	
	class userinput extends calculate{
		//int a,b;
		void getVal(){
		 Scanner input = new Scanner(System.in);
		 System.out.print("please enter your A value:");
		   a = input.nextInt();
		 System.out.print("please enter your B value:");
		   b = input.nextInt();
		}
	}
	public class cal{
		public static void main(String args[]){
			userinput ui = new userinput();
			
			ui.getVal();
			//calculate cal = new calculate();
		     ui.add();
			 ui.sub();
			 ui.mul();
			 ui.div();
			 ui.mod();
		}
	}