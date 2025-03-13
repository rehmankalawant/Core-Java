package packageCoreJava;

import java.util.Scanner;

public class Relational {
	
	public static void main ( String [] Args ) {
		int a ;
		int b;
		
		System.out.println("Enter the value " );
		
		Scanner objc = new Scanner(System.in);
		a=objc.nextInt();
		b=objc.nextInt();
		
		objc.close();
		
		System.out.println("Result for less " + (a<b));
		System.out.println("Result for greater " + (a>b));
		System.out.println("Result for equals " + (a=b));
		System.out.println("Result for less equal " + (a<=b));
		System.out.println("Result for great equal " + (a>=b));
		System.out.println("Result for double equal " + (a==b));
		System.out.println("Result for not equal " + (a!=b));
		
		
	}
}