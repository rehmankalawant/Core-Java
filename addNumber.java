package packageCoreJava;
public class addNumber {
	int a = 44;
	int b = 07;
	int c = a+b;
	int d = a-b;
	int e = a*b;
	int f = a/b;
	int g = a%b;
	int h = a^b;
	int i = a&b;
	int j = ++a;
			
	public static void main (String []args) {
		
		addNumber rk = new addNumber();
		
		System.out.println("The sum of two number is " + rk.c );
		System.out.println("The difference of two number is " + rk.d);
		System.out.println("The product of two number is " + rk.e);
		System.out.println("The division of two number is " + rk.f);
		System.out.println("The module of two number is " + rk.g);
		System.out.println("The square-type of two number is " + rk.h);
		
		System.out.println("The && of two number is " + rk.i);
		System.out.println("The ++ of two number is " + rk.j);


	}

}
