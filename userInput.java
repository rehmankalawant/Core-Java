package packageCoreJava;

import java.util.Scanner;

public class userInput {

	public static void main (String [] Args ) {
		
	int a ;
	System.out.println("Enter the value in integer ");
	
	Scanner obejct = new Scanner (System.in);
	a=obejct.nextInt();
	
	obejct.close();
	System.out.println("Entered Value is "+ a);
	
	
	}
}
