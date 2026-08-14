class vehicle{
	int speed = 120;
	vehicle(){
		System.out.println("Vehicle Constructor called");
	}
	void run(){
		System.out.println("vehicle is runninmg");
	}
}

class car extends vehicle{
	int speed = 180;
	car(){
		super();
	}
	
	void display(){
		System.out.println("Car Speed:" + speed);
		System.out.println("parent vehicle speed:" + super.speed);
		super.run();
	}
}
public class SuperK{
	public static void main(String args[]){
		car c = new car();
		c.display();
	}
}
