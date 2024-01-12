package packageMethods;

public class Class2 {

	public static void main(String[] args) 
	{
		M2();
		
		Class2 Y = new Class2();
		Y.M3 ();
		

	}

	// Calling Static method from different class
	
	public static void M2 ()
	{
		System.out.println("Using this method for different class");
	}
	
	
	public void M3 ()
	{
		System.out.println("Calling non static method for different class");
		
	}
	
}
