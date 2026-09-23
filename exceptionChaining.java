class myexception extends exception{
	public myexception(String message){
		super(message);
	}
}

class exceptionChaining{
	void method1() throws myexception{
		throw new myexception("Exception from method1");
	}
	
	void method2() throws myexception{
		try {
			method1();
		}
		
		catch(myexception e){
			throw new myexception("exception from method2");
		}
	}
	
void method3(){
	try{
		method2();
	}
	
	catch(myexception e){
		System.out.println("Caught exception method3:" + e.getmessage());
		if(e.getCause() !=null){
			System.out.println("chanined exception:" + e.getCause().getmessage());
		}
	}
}
}

public class exceChain{
	public static void main(String[] args){
		exceptionChaining ec = new exceptionChaining();
		ec.method3();
	}
}
	
			
	