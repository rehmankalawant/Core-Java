package packageCoreJava;

//difference between local variable and static variable

public class DifferVariable {
	static int s = 10 ;
	int i = 30;
	
	void method () {
		int l = 20 ; //local variable
		System.out.println(l+" "+s +" "+i); //local variable = same value 
		++l; ++s;                           //Static variable = value increment
	}                                       //Instance variable = same value 
	
	
	
public static void main (String [] args) {
	
	DifferVariable ref = new DifferVariable();
	
	ref.method();
	ref.method();
	ref.method();
}
}