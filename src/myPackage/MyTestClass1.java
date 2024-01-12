package myPackage;

public class MyTestClass1 
{

	public static void main(String[] args) 
	
	{
	
		AM2 m = new AM2();
		//m.test1(); can't call because test1 is private and can be accessed only within same class not in another class
		
		m.test2();//calling default method from another class within package
		
		m.test3();//calling protected method from another class within package
		
		m.test4();////calling public method from another class 	
		
		//System.out.println(m.a);  variable is private and can be accessed only within same class not in another class
		System.out.println(m.b);//calling default method from another class within package
		System.out.println(m.c);//
		System.out.println(m.d);//

		
		
	}
	
	
}
