package chromeOptionClassStudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse {

	public static void main(String[] args) throws InterruptedException 
	{
		//Headless browser-->browser open व्हायला नाही पाहिजे त्यासाठी 
		
		
		ChromeOptions opt = new ChromeOptions();//only used for chrome browser
		
		//opt.addArguments("--headless");//same syntax type करणे नेहमीच-->"--headless".without opening browser
		//opt.addArguments("incognito");//how to answer this-->use chrome options class then store it in variable then pass the arguments
		//opt.addArguments("--disable--notifications");//syntax change होत असतो 
		//opt.addArguments("start-maximized");//start-maximized<--- हा syntax change होत असतो 
		
		ArrayList<String> al = new ArrayList<>();//study & understand this logic wisely 
		//al.add("incognito");
		//al.add("--disable--notifications");
		//al.add("start-maximized");
		//al.add("-disable-infobars");
				
		//set ला arraylist मध्ये convert करू शकतो. al object काम करतो arraylist सारखा. study this properly
				
		opt.addArguments(al);
		
		WebDriver driver = new ChromeDriver(opt);
		//driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
		//System.out.println("Title of the site is = "+driver.getTitle());;
		
		
	}

}
