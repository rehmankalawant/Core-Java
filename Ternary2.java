package packageCoreJava;

import java.util.* ;
public class Ternary2 {
	
	public static void main ( String Args []) {
		
		int a , b , c ,MAX ;
		
		System.out.println("Enter The Value . . .");
		
	Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
	        b = obj.nextInt();
	        c = obj.nextInt();
	        
	        obj.close();
	    
	    MAX = (a > b) ? (a > c ? a : c ) : (b > c ) ? b : c ;
	    
		System.out.println("MAXIMUM NUMBER IS " + MAX);
	
	

}
}