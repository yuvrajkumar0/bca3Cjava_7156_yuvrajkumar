public class finally{
	public static void main(String [] agrs){
		try{
			System.out.println("yuvra opening databse connection..");
			int data = 25/5;
			System.out.println("data calculated " + data);
		} catch(ArithmeticException e){
			System.out.println("Exception caught,");
		}finally{
			System.out.println("finally block closing yuvraj database connection guaranteed");
		}
	}
}
		
				
			