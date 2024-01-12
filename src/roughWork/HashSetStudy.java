package roughWork;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) 
	{
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("GN");
		hs1.add("Bye");
		hs1.add("Hi");
		hs1.add(null);
		hs1.add(null);
		hs1.add("GN");
		
		
		System.out.println(hs1);
		
		//for each,iterator(universal cursor thats why it supports all)
		
		for(String h:hs1)
		{
		System.out.println(h);
		}
		
		System.out.println("===============");
		
		
		
		Iterator<String> it = hs1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
