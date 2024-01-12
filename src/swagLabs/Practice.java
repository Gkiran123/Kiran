package swagLabs;

public class Practice {

//	public Practice()//this is default constructor look like if not declared
//	{
//		
//	}
	
	int a;
	int b;
	
	
	public static void main(String[] args) 
	
	{
	
		Practice p = new Practice();
		p.addition();
		
	}
	
	public void addition()	//non static method
	{
		int a=1;
		int b=2;
		System.out.println(a+b);
	}
	
	public Practice()   //user defined constructor
	{
		int a=3;
		int b=4;
		System.out.println(a-b);
	}
	
	
	
	
}
