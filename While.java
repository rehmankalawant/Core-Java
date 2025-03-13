package packageCoreJava;

import java.util.Scanner;
public class While {

	public static void main (String []Args) {
		
		int a ;
		System.out.println("Enter the Number : ");
		
		Scanner ob = new Scanner(System.in);
		a = ob.nextInt();
		
		ob.close();
		
		while ( a <= 5) {
			
			System.out.println("Rehman");
			
			a++;
		}
	}
}
