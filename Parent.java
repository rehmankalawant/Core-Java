package packageCoreJava;

public class Parent 
{

	void run() 
	{
		System.out.println("Inside Parent");
	}
	
		
	public class Child extends Parent   // made the child class static
	{
	  void run() 
	  {
		System.out.println("Inside Child");
		}
			
	}
	public static void main (String  Args []) {
	
	Parent ob = new Parent();
		
			Child obj = ob.new Child();
			obj.run();
		
		}
	
}

