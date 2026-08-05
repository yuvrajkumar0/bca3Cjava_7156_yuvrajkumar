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
	class puppy extends Dog{
		void weep(){
			System.out.println("puppy is weeping.");
		}
	}
	
	
	public class mult{
		public static void main(String[] args){
			 puppy p = new puppy();
		    p.eat();
			p.bark();
			p.weep();
		}
	}
	
			
		