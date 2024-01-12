package roughWork;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		
		ArrayList<Object> al = new ArrayList<Object>();
		System.out.println(al.add("Pune"));//reference variable create न करता show करणे add झालंय का नाही तर ही method use करणे  
		System.out.println(al);//ह्या statement ला खाली वर लिहून बघणे काय होत 
		al.add(0,"Katraj");
		System.out.println(al);
		
		
//		al.clear();
//		System.out.println(al);
		
		Object alNew = al.clone();
		System.out.println("Cloned array list-->"+alNew);

//		al.contains("Pune");    reference variale use करून check करणे ह्या method ने 
		
		System.out.println(al.contains("Pune"));//check करणे ह्या मध्ये आहे कि नाही 
		
		System.out.println(al.contains("Mumbai"));
		
		al.ensureCapacity(3);//fix capacity देण्यासाठी वापरतात 
		
		al.add("MH");
		System.out.println(al);
		al.add("Bharat");
		System.out.println(al);
		
		al.add("New");
		System.out.println(al);
		
		al.equals(alNew);
		System.out.println(alNew);
		System.out.println(al);
		
//		al.equals(alNew);//check करायचे आहे रिजल्ट तर याला उचलुन टाकणे syso मध्ये  
		
		System.out.println(al.equals(alNew));
		System.out.println("===================");
		
		
		System.out.println(al.get(2));
		
//		System.out.println(al.get(20)); index out of bound exception
		
//		System.out.println(al.get(5)); length 5 आहे म्हणजे 4 पर्यन्त असते म्हणुन null नाही येणार index out of bound exception येईल 
		
//		System.out.println(al.indexOf("MH1"));// जर result -1 येत असेल तर हा index available नाहीये 
		
		System.out.println(al.indexOf("MH"));
		
//		al.clear();
		
		System.out.println(al.isEmpty());
		
		System.out.println("============================");
		System.out.println(al);
		System.out.println(al.remove(1));
		System.out.println(al);
		
		System.out.println("============================");
		al.set(1, "Maharashtra");//set is used to replace the element,do study with add method
		System.out.println(al);//try to find the difference between add method and set method
		System.out.println("============================");

	//reference मध्ये add करू न शकणे याला manipulation न करणे 
		
		System.out.println(al.size());//check the difference between capacity and size method
		
		System.out.println("======================");
		for(Object s:al)
		{
			System.out.println(s);
		}
	}

}
