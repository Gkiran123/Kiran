package packageMethods;

public class Class1 {

	public static void main(String[] args) 
	
	{
	
		M1();
		Class2.M2();
		
		
		Class1 Z = new Class1();
		Z.NS1();
		
		Class2 class2Instance = new Class2();
		class2Instance.M3();
	}

	// Calling method from Regular Static from same class---how to call? answer is - only call method name in public static void main
	
	public static void M1 ()
	{
		System.out.println("Calling method from Regular Static");
		
	}
	
	
	public void NS1 ()
	{
		System.out.println("Calling non static method from same class");
	}
	
		
	
	
}


