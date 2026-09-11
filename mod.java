package modular;
public class mod{
	int modu;
	public void calmod(int a, int b)
	{
		modu = a%b;
	}
	
	public void dismod()
	{
		System.out.println("modular is: " + modu);
	}
}