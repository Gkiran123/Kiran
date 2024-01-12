package abstract1;

public abstract class ConcreteClass extends Sample
{

	@Override
	public void test() {
		System.out.println("this method is completed in concrete class");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	public void test3()
	{
		System.out.println("own method from concrete class" );
	}
	
	public static void main(String[] args) 
	{
	ConcreteClass cc = new ConcreteClass();
	cc.test();////calling method from abstract class in concrete class from sample class
	cc.test1();//calling method from abstract class in sample
	cc.test2();	//calling method from abstract class in sample
	cc.test3();	//calling method from abstract class in sample
	}

	
	
	
}
