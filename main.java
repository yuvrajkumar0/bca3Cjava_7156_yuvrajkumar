class animal{
	String name = "Animal";
	void eat(){
		System.out.println("rthis animal eats food.");
	}
}
	class Dog extends animal{
		void bark(){
			System.out.println("The dog barks: Woof! Woof!");
		}
	}
	
	
	public class main{
		public static void main(String[] args){
			Dog myDog = new Dog();
		   myDog.eat();
			 myDog.bark();
		}
	}
	
			
		