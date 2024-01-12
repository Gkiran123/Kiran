package roughWork;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSeStudy {

	public static void main(String[] args) 
	{
	
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		
		System.out.println(lh.size());
		lh.add("Pune");
		lh.add("Pune");
		lh.add(null);
		lh.add("Mumbai");
		lh.add("Nagpur");
		

		System.out.println(lh);

		for(String l:lh)
		{
			System.out.println(l);
		}
		
		Iterator<String>it =  lh.iterator();
		
		while (it.hasNext()) 
		{
			String string = (String) it.next();
			
		}
		
	}

}
