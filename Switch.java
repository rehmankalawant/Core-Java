package packageCoreJava;

//simple calculator 

import java.util.*;
public class Switch {
	static int  a , b , result , choice ;
	void add() {
		result = a + b ;
		System.out.println("Addition is "+ result);
	}
	
	void sub () {
		result = a - b ;
		System.out.println("Subtraction is "+ result);
	}
	
	void mult() {
		result = a * b ;
		System.out.println("Multiplication is "+ result);
	}
	
	void div() {
		result = a / b ;
		System.out.println("Division is "+ result);
	}
	public static void main (String []Args) {
		
		System.out.println("Enter the numbers");
		
		Switch sw = new Switch();
		
		Scanner refo = new Scanner(System.in);
		System.out.print("Enter A : ");
		a = refo.nextInt();
		System.out.print("Enter B : ");
		b = refo.nextInt();
		
	
		
	
		System.out.println("HEY ! WELCOME TO CALS_SMART : ");	
		System.out.println("1 : ADD ");	
		System.out.println("2 : SUB ");	
		System.out.println("3 : MULT ");	
		System.out.println("4 : DIV ");	
		System.out.println("Enter your choice : ");
	choice = refo.nextInt();
	
	refo.close();
		
	switch (choice)	{
	
	case 1 : sw.add();
	break;
	
	case 2 : sw.sub();
	break;
	
	case 3 : sw.mult();
	break;
	
	case 4 : sw.div();
	break;
	
	default : System.out.println("Invalid Operation");
	}
	
	
	}

}
