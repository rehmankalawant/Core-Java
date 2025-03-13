package packageCoreJava;

import java.util.Scanner;
public class While1 {

	public static void main (String []Args) {
		
		int a ;
		System.out.println("Enter the Number");
		
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		
		obj.close();
		
		while (a<=5) {
			
			System.out.print("Rehman ");
			
			++a;
		}
	}
}
