package roughWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer> al = new ArrayList<>();//capacity=10 & size=0 आता च decalre केलंय  
		
		al.add(1);
		al.add(3);
		al.add(34);
		al.add(2);
		al.add(22);
		al.add(12);
		
		System.out.println(al);				//arraylist कैसी देखते है use syso 
		System.out.println("================for loop====================");
		
		for(int i=0;i<=al.size()-1;i++)	//arraylist element 1 by 1 कसे दाखवतात.......local variable साठी use करतात 
		{                       
			System.out.println(al.get(i));
		}
		
		System.out.println("================for each loop====================");

		for(Integer a:al)
		{
			System.out.println(a);
			
		}
		
		System.out.println("========Iterator===========");
		Iterator<Integer> it = al.iterator();//created local variable using create variable
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
		System.out.println("========List-Iterator===========");
		
		ListIterator<Integer> lit = al.listIterator();
	
		while(lit.hasNext())//while स्वतःचा लिहिणे suggestion मधून लिहून काढू नये 
		{
			System.out.println(lit.next());
		}
		
		System.out.println("========Using List-Iterator in reverse direction===========");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
	}

}
