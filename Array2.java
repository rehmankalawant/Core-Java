package packageCoreJava;

import java.util.* ;

public class Array2 {
	
	public static void main(String[] args) {
		
		int size ;
		
		Scanner obb = new Scanner (System.in);
		
		System.out.println("Size of Array : ");
		size = obb.nextInt();
		
		int a [] = new int [size] ;
		
		
		
		for ( int i=0 ; i<size ; i++ ) 
		{
			System.out.println("Input the element for a[" + i + "]: ");
			a[i] = obb.nextInt() ; 
			
		
		// object refer the field here we use scanner-class object so that storing variable understand the stream is input thats why we use objects 
		
		}
		
		for (int i=0; i<size; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		obb.close();
		
	}
}