package packageCoreJava;
import java.util.Scanner ;
public class ForLoop {

	public static void main(String[] args) {
		int a ; 
		
		System.out.println("Enter a number ");
		
		Scanner obje = new Scanner (System.in);
		a = obje.nextInt();
		
		obje.close();
		
		for (int i = a ; i<=10 ; i++) 
		{
			System.out.print(i + " ");
		}
		
	}
	
	
	
	
}
