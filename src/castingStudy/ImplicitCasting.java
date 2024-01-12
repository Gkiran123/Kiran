package castingStudy;

public class ImplicitCasting 
{
public static void main(String[] args) 
{
//implicit casting
	int a = 999;
	
	System.out.println(a);
	
	double b = a;
	System.out.println(b);
	
	System.out.println("========");
	
	
	double d = 199.99d;
	System.out.println(d);
	
	int e = (int) d;
	System.out.println(e);//value= 199 because int dont print decimal so loss of data

	
}
}
