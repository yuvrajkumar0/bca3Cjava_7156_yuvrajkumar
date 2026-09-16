public class testThroww{
	static void checkVotingEligibility(int age, String studentName){
		if(age<18){
			throw new ArithmeticException(studentName + " is not eligible to vote");
		}else{
			System.out.println(studentName + " is eligible to vote");
		}
	}
	public static void main(String [] args){
		try {
			System.out.println("checking registration for yuvraj");
			checkVotingEligibility(16,"yuvraj");
		}catch (ArithmeticException e){
			System.out.println("caught explicit exception: " + e.getMessage());
		}
	}
}

