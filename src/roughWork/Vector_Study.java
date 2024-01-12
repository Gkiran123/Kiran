package roughWork;

import java.util.Vector;

public class Vector_Study {

	public static void main(String[] args) 
	{
	
		Vector<String> v = new Vector<>();
		
		v.add("MH");
		v.add("AP");
		v.add("TN");
		v.add("KA");
		v.add("PB");
		v.add("UP");
		v.add("DL");
		
		
	System.out.println(	v.capacity());
	System.out.println(v.size());
	
	v.add("KA");//duplicates are allowed
	v.add("PB");
	v.add(null);
	v.add(null);
	
	System.out.println(v.capacity());
	System.out.println(v.size());
	System.out.println(v);
		
	System.out.println(v.contains("XY"));
		
	System.out.println(v.get(0));//collection ने दिलेली आहे 
	
	System.out.println(v.elementAt(0));//vector ने दिलेली आहे 
		
	System.out.println(v.firstElement());
	
	System.out.println(v.lastElement());
	System.out.println(v);
	v.insertElementAt("KL", 1);//working as add(index,element);
	System.out.println(v);
		
	System.out.println(v.remove(0));
	System.out.println(v.remove("KL"));
	System.out.println(v.remove("GA"));
	
	
	v.setSize(16);
	System.out.println(v);
		

	
	
	
	}

}
