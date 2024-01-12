package inheritance;

public class Single_Level_Inheritance {

	public static void main(String[] args)
	{
	
		
		Mother m= new Mother();//created object of superclass
		m.look();//
		
		Daughter d= new Daughter();//created object of subclass
			d.scooty();//calling method from subclass using subclass object 
			
		d.look();
	}

}
