interface animal{
	void makesound();
	void eat();
}

class dog implements animal{
	public void makesound(){
		System.out.print("Woof");
	}
	
	public void eat(){
		System.out.print("dog is eating dog food.");
	}
}
 class cat implements animal{
	 public void makesound(){
		 System.out.print("meow");
	 }
	 public void eat(){
		 System.out.print("cat is eating cat food.");
		 
	 }
 }
 public class inter{
	 public static void main(String args[]){
   animal dog = new dog();
    animal cat = new cat();
	System.out.println("dog \n");
     dog.makesound();
	 dog.eat();
	 System.out.println("cat");
	 cat.makesound();
	 cat.eat();
	 
	 }
 }
 
 
		