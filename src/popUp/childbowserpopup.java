package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbowserpopup {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		//getting text on main page
		
		 WebElement mainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		
		System.out.println("Main page text is"+mainPageElement.getText());
		
		//clicking on newWindowButton
		
		driver.findElement(By.name("NewWindow")).click();
		
		//driver.close();          // will close current focus tab(main page) not popup/child window
		//driver.quit();           // will close all the tabs   
		
		 //driver.findElement(By.id("the7-search")).sendKeys("Good evening"); //id taken directly from child window
		
		//to switch to child window we should know id of child window
		
		String mainPageID = driver.getWindowHandle();
		System.out.println("ID of main page is"+mainPageID);
		//use getWindowsHandles() method to get all page ids
		
		Set<String> allWindowID = driver.getWindowHandles();
		
		 Iterator<String> it = allWindowID.iterator();
		
		 String mainPageId=it.next();//first it will focus outside,next time main page id,next time childid
		
		//all mainpage Id value will be same uptil window is not closed
		 String childID = it.next();//getting id of child
		Thread.sleep(1000);
		
		 System.out.println("Main page id"+mainPageID);
		 System.out.println("Child page id"+childID);//if session closed then exception will occur 
		//switching focus from main page to child window
		 driver.switchTo().window(childID);
		 Thread.sleep(1000);
		 driver.manage().window().maximize();//will maximize child window
		 
		 //driver.close();  
		 driver.findElement(By.id("the7-search")).sendKeys("Good evening");//NO such window exception will come here--you are trying to work on already closed window--target window is closed 
		 //again to work on main page--->we need to switch focus from child window to main page
		 driver.switchTo().window(mainPageId);
		 String mainPageText2=driver.findElement(By.xpath("//p[contains(text(),'browser window')]")).getText();
		 driver.quit(); 
	}

}
