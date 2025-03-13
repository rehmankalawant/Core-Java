package packageCoreJava;
import java.util.Scanner ;
public class TernaryAdvance {

	public static void main (String [] Args )
	{
		int a , b , MAX , other = 0 ;
		Scanner obb = new Scanner (System.in);
		
		System.out.print("Enter the Number a :  ");
		a = obb.nextInt();
		
		System.out.print("Enter the Number b : ");
		b = obb.nextInt();
		
		MAX = (a > b) ? a : b ;
		
		if ( MAX <= a )
		{
			other = b ;
		}
		
		if ( MAX <= b )
		{
			other = a ;
		}
		
		obb.close();
		
		System.out.println("The Value " + MAX + " is Greater than  "+ other );
		
		
	}
}
