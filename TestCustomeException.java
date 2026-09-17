class InvalidStudentMarksException extends Exception{
	public InvalidStudentMarksException(String message){
		super(message);
	}
}

public class TestCustomeException{
	static void validateYuvrajMarks(double marks) throws InvalidStudentMarksException{
		if(marks <0.0 || marks >100.0){
			throw new InvalidStudentMarksException("marks must be between 0 and 100 Input was " + marks);
		}else{
			System.out.println("Yuvraj's marks validated Sucessfully:" + marks);
		}
	}
	
	public static void main(String [] args){
		try{
			System.out.println("Submitting Exam score for yuvraj...");
			validateYuvrajMarks(105.5);
		}
		catch (InvalidStudentMarksException e){
			System.out.println("Custom Exception Caught:" + e.getMessage());
		}
	}
}