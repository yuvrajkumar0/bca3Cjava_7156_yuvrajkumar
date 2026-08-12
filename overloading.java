class calculate
{
	void sum(int a, int b){
	System.out.println(a+b);
	}
	void sum(int a,int b, int c){
	System.out.print(a+b+c);
	}	
}
public class overloading{
	public static void main(String args[])
	{
		calculate total = new calculate();
		total.sum(10,20);
		total.sum(10,20,30);
	}
}
		
		