interface dog{
	void sounddog();
	void eat();
	
	
}
interface cat extends dog{
	void soundcat();
	void drink();
}
class puppy implements cat,dog{
	 
	public void eat(){
		System.out.println("eat bread");
	}
	public void drink(){
		System.out.println("milk");
	}
	public void sounddog(){
		System.out.println("Woof... Woof...");
     }
	 public void soundcat(){
		System.out.println("meww... meww..."); 
	 }
}

public class multiple{
	public static void main(String args[]){
		puppy mypuppy = new puppy();
		
		mypuppy.soundcat();
		mypuppy.drink();
		mypuppy.sounddog();
		mypuppy.eat();
	}
}

	