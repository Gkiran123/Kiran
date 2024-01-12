package roughWork;

public class Father1_Super_Class {

	public static void main(String[] args) 
	{
	
		Son1_Child_Class s = new Son1_Child_Class();//upcastng
		s.addition();
		s.substraction();
		
		s.multiplication();
		s.division();
		
		Father1_Super_Class f = new Father1_Super_Class();
		f.multiplication();
		f.division();
		
		Father1_Super_Class sf = new Son1_Child_Class();
		sf.multiplication();
		sf.division();//its use in selenium--> webdriver driver = new chromedriver();
	
		
		
		
		
	}

	public static void multiplication()
	{
	System.out.println("multiplication of Father class method");	
	}
	
	public static void division()
	{
	System.out.println("division of Father class method");	
	}
	

	
	
}
