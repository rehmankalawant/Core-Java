package packageCoreJava;

import java.util.Scanner;

public class ArithmaticOperation {
	
	public static void main (String [] args ) {
		
		int a ;
		int b ;
		int c ;
		
	System.out.println("Enter the Values . . . ");
	
	Scanner objt = new Scanner (System.in);
	
	a=objt.nextInt();
	b=objt.nextInt();
	c = objt.nextInt();
	
	objt.close();
	
	

	
	System.out.println("Addition of Three Numbers is " + (a+b+c));
	System.out.println("Substraction of Two Numbers is " + (a-b));
	System.out.println("Multiplication of Two Numbers is " + (a*b));
	System.out.println("Division of Two Numbers is " + (a/b));
	System.out.println("Modulas of Two Numbers is " + (a%b));
	
	/* Multiple markers at this line
	- The operator - is undefined for the argument type(s) String, int
	- The operator - is undefined for the argument type(s) String, int */
	
	
	
	
	//objt.close();
	
	//checked error and unchecked error in exception handling 
	//checked error = error before run [  Red lines in code ]
	//unchecked error = errors after run [ Runtime error ]
	
	}

}
