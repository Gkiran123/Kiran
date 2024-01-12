package string_Study_Methods;

public class String_Methods {

	public static void main(String[] args) 
	{
		String name = new String();
		name = "Rohit";
		
		System.out.println(name.length());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.charAt(4));
		
		
		String name1 = new String();
		name1 = "Sachin";
		
		String name2 = new String();
		name2 = "Pankaj";
		
		String name3 = new String();
		name3 = "Sachin";
		
		String name4 = "Virat";
		
		String name5 = "Rohit";
		
		String name6 = "Sachin";
		
		System.out.println(name1.equals(name2));
		
		System.out.println(name2.equals(name1));
		
		System.out.println(name1.equals(name3));
		
		System.out.println(name5.equals(name4));
	
		System.out.println(name5.equals(name));
		
		System.out.println(name1.equals(name5));
		
		System.out.println(name1.equals(name6));
		
		System.out.println(name1==name2);
		
		System.out.println(name1==name3);
		
		System.out.println(name3==name4);
		
		System.out.println(name3==name6);
		
		
		System.out.println(name1.contains("S"));
		
		System.out.println(name6.contains("hin"));
		
		
		String name7 = new String();
		name7 = "";
		
		String name8 = new String();
		name8 = "          ";
		
		
		System.out.println(name7.isEmpty());
		
		System.out.println(name8.isBlank());
		
		System.out.println(name7.isBlank());//
		
		System.out.println(name8.isEmpty());//empty zero index,but blank may not be empty
		
		String name9 = "Ajit";
		
		System.out.println(name9.charAt(2));
				
		char myChar = name9.charAt(2);//to use a single character(not whole word) further for this purpose this way is used
		System.out.println(myChar);
		
		String name10="Sunetra";
		System.out.println(name10.endsWith("a"));
		System.out.println(name10.endsWith(name10));
		System.out.println(name10.endsWith("r"));
		
		System.out.println(name10.startsWith("S"));
		System.out.println(name10.startsWith("s"));
		System.out.println(name10.startsWith("Sun"));
		System.out.println(name10.endsWith("tra"));
		
		String name11 = "MY NAME IS KIRAN";
		System.out.println(name11.substring(3));
		System.out.println(name11.substring(7));
		
		String name12 = "Malinga";
		System.out.println(name12.equalsIgnoreCase("MALINGA"));//NOT CASE SENSITIVE
		
		String name13 = "malinga";
		System.out.println(name12.equalsIgnoreCase(name13));
		
		String name14 = "Yuvraj ";
		System.out.println(name14.indexOf("a"));
		
		String name15 = "Singh";
		System.out.println(name14.concat(name15));
		
		String name16 = "Surya Yadav";
		System.out.println(name16.lastIndexOf("a"));//if there is a repeatation of character at that time this can be useful
		
		String name17 = "Shami";
		System.out.println(name17.replace("a","i"));
		
		
		
		
		
	}

}
