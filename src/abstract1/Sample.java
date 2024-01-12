package abstract1;

public abstract class Sample {

	public static void main(String[] args) 
	{
	
		// Sample s = new Sample();// we cant create object/instance of an abstract class
	//	s.test1();
	//	s.test();
		
	}

	
	
	public abstract void test();//incomplete method
	
	public abstract void test2();
	
	public void test1()
	{
		System.out.println("Complete ");
	}
	
	//static method we can't make static method as abstract method.
	
	
	
	
}
