package packageCoreJava;

import java.util.Arrays;
// toString   // asList   //deepToString 

public class ArrayMethods {
 
	public static void main(String[] args) {
		
		// 1 Dimensional Array
		int arr1 [] = { 10 , 20 , 30 , 40 } ;
		
		//String Array
		String arr2 [] = { "Rehman" , "Srk" } ;
	 
		//2 Dimensional Array
		int arr3 [] [] = { {44,07} , {84,82} } ;
		
		System.out.println("toString() = " + Arrays.toString(arr1)); //For Integer Values
		
		System.out.println("asList() = " + Arrays.asList(arr2) );  //For String Values
		
		System.out.println("deepToString = " + Arrays.deepToString(arr3));  //For 2D Array Values
		
	}
	
 
}
