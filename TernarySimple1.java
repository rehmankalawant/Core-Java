package packageCoreJava;

import java.util.Scanner;

public class TernarySimple1 {
	{
		int a , b , MAX ;
		Scanner obb = new Scanner (System.in);
		
		System.out.print("Enter the Number a :  ");
		a = obb.nextInt();
		
		System.out.print("Enter the Number b : ");
		b = obb.nextInt();
		
		MAX = (a > b) ? a : b ;
		
        obb.close();
		
		System.out.println("The Value is " + MAX + " is Greater");
		
		
}
}
