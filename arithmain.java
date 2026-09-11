import java.util.Scanner;
import addition.ad;
import subtraction.sub;
import multiplication.mull;
import division.divv;
 

public class arithmain{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1 = scn.nextInt();
		
		System.out.println("Enter 2nd Number:");
		int n2 = scn.nextInt();
		
		ad a = new ad();
		a.calad(n1,n2);
		a.disad();
		
		sub s = new sub();
		s.calsub(n1,n2);
		s.dissub();
		
		mull m = new mull();
		m.calmull(n1,n2);
		m.dismull();
		
		divv d = new divv();
		d.caldivv(n1,n2);
		d.disdivv();
		 
	}
}
		 
		 
		