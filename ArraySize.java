package packageCoreJava;

import java.util.* ;

public class ArraySize {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		
		System.out.print("Enter the Size of Array : ");
		
		int size = obj.nextInt(); 
		
		int a[]= new int [size];
		
		for (int i=0 ; i<size; i++)
		{
			System.out.print("Enter the value for index " + i + " : " );
			 a[i] = obj.nextInt();
		}
		
		for (int i=0; i<size; i++)
		{
		System.out.print(a[i] + " ");
		}
		
		obj.close();
	}
}
