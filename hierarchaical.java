class animal{
	 
	void eat(){
		System.out.println("rthis animal eats food.");
	}
}
	class Dog extends animal{
		void bark(){
			System.out.println("The dog barks: Woof! Woof!");
		}
	}
	class cat extends animal{
		void mew(){
			System.out.println("cat is crying.");
		}
	}
	
	
	public class hierarchaical{
		public static void main(String[] args){
			  
			 Dog d = new Dog();
			 cat c = new cat();
			 d.eat();
			 d.bark();
			 c.eat();
			 c.mew();
		     
		}
	}
	
			
		