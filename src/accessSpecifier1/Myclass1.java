package accessSpecifier1;

public class Myclass1 

{

	//private int a=20;
	int b=50;
	protected int c=60;
	public int d=80;
 

	//private void add()
	{
	int x=10,y=5;
	System.out.println(x+y);
	}

	void mul()
	{
		System.out.println(b*d);
	}

	protected void div()
	{
	int f=10,g=5;
	System.out.println(f/g);

	}

	public void sub()
	{
	int p=10,q=5;
	System.out.println(p-q);
	}

	public static void main(String[] args)
	{
	Myclass m1 = new Myclass();
	//System.out.println("I am calling non static private variable "+m1.a);
	System.out.println("I am calling static default variable "+m1.b);
	//System.out.println("I am calling non static protected variable "+m1.c);
	System.out.println("I am calling static public variable "+m1.d);

	System.out.println("===========================================");

	//m1.add();
	m1.mul();
	div();
	m1.sub();
	}	
	
	
	
	
	
}
