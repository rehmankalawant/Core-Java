package packageCoreJava;

import java.util.*;

public class DoWhile {

	public static void main(String []Args ) {
		
		int n ;
		
		System.out.println("Enter the value");
		
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		
		scr.close();
		do 
		{
			System.out.println("Rehman");
			++n;
		}
		while (n <= 5);
		
	}
}
