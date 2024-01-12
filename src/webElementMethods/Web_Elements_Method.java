package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements_Method {

	public static void main(String[] args) 
	{
	
		String name = "My NAME is KIRAN";
		
		System.out.println(name.length());
		System.out.println("===============");
		System.out.println(name.toLowerCase());
		System.out.println("=================");
		System.out.println(name.toUpperCase());
		System.out.println("==================");
		System.out.println(name.equals(name));
		System.out.println("==================");
		System.out.println(name.equalsIgnoreCase(name));
		System.out.println("===================");
		
		String x1 = "Velocity";
		String x2 = "Velocity";
		String x3 = "velocity";
		
		String x4 = new String("Velocity");
		String x5 = new String("Velocity");
		String x6 = new String("velocity");
		
		boolean result = x1.equals(x2);
		System.out.println(result);
		
		System.out.println("===================");
		
		boolean result1 = x4.equals(x6);
		System.out.println(result1);
		
		System.out.println("===================");
		
		System.out.println(x1==x2);
		System.out.println("===================");
		
		System.out.println(x1.contains("city"));
		System.out.println("===================");
		
		String x7 = "Velocity";
		String x8 = " ";
		String x9 = "";
		
		System.out.println(x7.isEmpty());
		System.out.println(x8.isEmpty());
		System.out.println(x9.isEmpty());
		
		System.out.println("===================");
		
		System.out.println(x7.isBlank());
		System.out.println(x8.isBlank());
		System.out.println(x9.isBlank());
		
		
		
		
		
	}

}
