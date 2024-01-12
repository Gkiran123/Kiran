package roughWork;

import java.util.ArrayList;

public class Rough2 
{

	public static void main(String[] args) 
	{

		ArrayList<Object> A1 = new ArrayList<Object>();
		System.out.println(A1.add("MumbaiPune"));
		System.out.println(A1.add("Jalna"));
		System.out.println(A1.add("Aurangabad"));
		System.out.println(A1.add("MumbaiPune"));
		
		
		System.out.println(A1.contains("Jalna"));
		
		A1.add(1,"Thane");
		System.out.println(A1);
		
		Object A2 = A1.clone();
		System.out.println(A2);
		
		System.out.println(A1.get(2));
		
		System.out.println(A1.equals(A2));
		
		System.out.println(A1.isEmpty());
		
		//A1.clear();
		System.out.println(A1);
		
//		A1.ensureCapacity(10);//ask the question about this
		
		System.out.println(A1.add("Raigad"));
		System.out.println(A1);
		
		System.out.println(A1.add("Parbhani"));
		
		System.out.println(A1.remove(0));
		System.out.println(A1);
		
//		System.out.println(A1.removeAll(A1));//difference between remove all and clear method
//		System.out.println(A1);
		
		System.out.println(A1.indexOf("Thane"));//study this method with get method
		
		System.out.println(A1.set(0, "Nashik"));//used to replace the element,this method dont return the output in boolean
		System.out.println(A1);
		
		System.out.println(A1.size());
		
		
	}

}
