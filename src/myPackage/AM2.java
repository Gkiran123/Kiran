package myPackage;

public class AM2 
{
private int a =10;
int b = 20;
protected int c =30;
public int d=40;

public static void main(String[] args) 


{

	Myclass m=new Myclass();
	System.out.println("Value of a is "+m.a);
	System.out.println("Value of b is "+m.b);//calling deafult member in same class
	System.out.println("Value of c is "+m.c);//calling protected member from same class
	System.out.println("Value of d is "+m.d);//calling public member of the class
	
	m.test1();//private
	m.test2();//default
	m.test3();//protected
	m.test4();//public
	
}

private void test1()
{
System.out.println("Private method");	
}

void test2()//default non static method
{
System.out.println("Default method");	
}

protected void test3()
{
System.out.println("Protected method");	//within the pacckage and outside of the package using inheritance by using extends keyword
}

public void test4()//public non static method
{
System.out.println("Public method");//within project
}


}
