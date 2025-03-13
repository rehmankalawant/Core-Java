package packageCoreJava;

import java.util.Scanner;
public class logicalOperator {
	
	public static void main (String [] Args) {
		
		System.out.println("Enter The Values . . . ");
		
		int a ;
		int b ;
		
		Scanner ob = new Scanner(System.in);
		a = ob.nextInt();
		b = ob.nextInt();
		
		ob.close();
		
		System.out.println("AND OPERATOR");
		System.out.println((a>b) && (a>b));  // both TRUE then TRUE either FALSE
		System.out.println((a<b) && (a<b));  // If any one FALSE then FALSE
		System.out.println((a>b) && (a<b));
		System.out.println();
		

		System.out.println("OR OPERATOR");
		System.out.println((a<b) || (a<b));  // both False then TRUE either FALSE
		System.out.println((a>b) || (a<b));  // If any one TRUE then TRUE
		System.out.println((a<b) || (a<b));
		System.out.println();
		
		
		System.out.println("NOT OPERATOR");
		System.out.println(!(a>b));  // Reverse the result
		System.out.println(!(a<b)); 
	}

}
