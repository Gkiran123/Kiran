package abstract_Classes_Examples;

public abstract class Abstract_Class_For_Rough_Work {

	public static void main(String[] args) 
	
	{
		//Abstract_Class_For_Rough_Work S = new Abstract_Class_For_Rough_Work();
		//S.addition();
		//we can't create an object of an abstract class
		

	}

	public abstract void addition();//<--------incomplete method
	public abstract void substraction();//<----incomplete method
	public abstract void multiplication();//<--incomplete method
	
	public void Test1()//<---------Complete method
	{
		System.out.println("non static complete method from abstract class");
	}
	
	public static void Test2()//<--Static complete method
	{
		System.out.println("Static complete method from abstract class");
	}
	
	
}
