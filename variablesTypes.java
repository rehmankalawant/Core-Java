package packageCoreJava;


public class variablesTypes {
	
	int i = 30 ; // instance variable
	
	static int s = 07 ;  // static variable
	
public static void main (String [] args) {
	
	variablesTypes ref = new variablesTypes();
	
	int l = 44 ; //local variable
	
	System.out.println(l); // local variable = direct access with variable-name
	
	System.out.println(variablesTypes.s); /*static variable = accessed through className [member of that class] of which the static variable belongs to and static variable name */
	
	System.out.println(ref.i); // instance variable = First create an object of the class of which the instance variable belongs to 
	                           //access the variable using the reference variable name and instance variable name

}
}