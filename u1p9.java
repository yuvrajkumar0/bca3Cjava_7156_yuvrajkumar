import java.util.Scanner;
public class u1p9{
   public static void main(String args[]){
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("enter your Gr.Number:");
   int gr= input.nextInt();
   
   System.out.print("enter your c marks:");
   int marks1= input.nextInt();
   
   System.out.print("enter your c++ marks:");
   int marks2= input.nextInt();
   
   System.out.print("enter your java marks:");
   int marks3= input.nextInt();
   
   System.out.print("enter your DS marks:");
   int marks4= input.nextInt();
   
   System.out.print("enter your Html:");
   int marks5= input.nextInt();
   
      System.out.println("your Gr.number: " + gr );
   
    int total;
	total = marks1 + marks2 +marks3 + marks4 + marks5;
	System.out.println("your total marks is" + total);
	
	int avg;
	avg = (marks1 + marks2 +marks3 + marks4 + marks5)/5;
	System.out.println("your marks avg is" + avg);
	
	if(avg>90 && avg<100){
	System.out.print("your passing grade is O");
	
    }else if(avg>80 && avg<89){
		System.out.print("your passing grade is A+");
	}else if(avg>70 && avg<79){
		System.out.print("your passing grade is A");
	}else if(avg>60 && avg<69){
		System.out.print("your passing grade is B+");
	}else if(avg>59 && avg<50){
		System.out.print("your passing grade is B");
	}else if(avg>40 && avg<49){
		System.out.print("your passing grade is c");
	}else if(avg>36 && avg<39){
		System.out.print("your passing grade is D");
	}else if(avg>0 && avg<35){
		System.out.print("your passing grade is f");
	}
	
   }
		
}
	
   
   