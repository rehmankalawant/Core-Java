package packageCoreJava;

import java.util.* ;
public class NestedIf {

	public static void main ( String [] Args) {
		int num;
		System.out.println("Enter the value");
	   Scanner ob = new Scanner(System.in);
	   num = ob.nextInt();
	   
	   ob.close();
	   
	   if (20>num) {
		   
		   if (num<15) {
			   System.out.println("Number is between 11 - 15 ");
		   }
		   else {
			   System.out.println("Number is between 15 - 20 ");
		   }
	   }
	   
	   else {
		   if(num<30) {
			   System.out.println("Number is between 20 - 30 ");
		   }
		   else {
			   System.out.println("Number is between 30 - infinity ");
		   }
	   }
	}
}

