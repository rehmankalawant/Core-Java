package packageCoreJava;


public class TernarySimple2 {

	public static void main (String Args []) {
	int a=10 ,b=20, c=30,MAX ;
	
	MAX = (a > b) ? (a > c ? a : c ) : (b > c ? b : c ) ;
	
	System.out.println("MAXIMUM NUMBER IS " + MAX);
}
}
