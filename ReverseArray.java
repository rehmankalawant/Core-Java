package packageCoreJava;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int size ;
		
		Scanner obj = new Scanner (System.in);
		
		System.out.print("Enter The Size Of Array : ");
		size = obj.nextInt();
				
		int a[] = new int [size] ;
		
		System.out.println("Taking The Input");
		for (int i=0 ; i<size ; i++)
		{
			a[i] = obj.nextInt();
		}
		
		System.out.println("Displaying The Original Array");
		for (int i=0 ; i<size ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println("Displaying The Reversed Array");
		for (int i=size-1 ; i >=0 ; i--) // IF size is 5 THEN last-index is 4 (size-1)
		{
			System.out.print( a[i] + " ");
		}
		
		obj.close();
		
	}
	
}
