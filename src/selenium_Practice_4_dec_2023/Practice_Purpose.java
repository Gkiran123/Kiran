package selenium_Practice_4_dec_2023;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice_Purpose {

	public static void main(String[] args) throws InterruptedException, IOException 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		
		WebElement A1 = driver.findElement(By.xpath("//button[text()='Alert']"));
		
		File S1 = A1.getScreenshotAs(OutputType.FILE);
		//File D1=new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Myimage.png")
		FileHandler.copy(S1,new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Myimage.png"));
		
		
		//String text1 = alt.getText();//i have a question,why not directly put this statement in the printing statement 
		
		
		System.out.println(alt.getText());
		alt.accept();
		
		
		System.out.println("=======================================");
		
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(5000);
		Alert alt1 = driver.switchTo().alert();
		
//		File source2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String str2 = RandomString.make();
//		File dest2 =new File("C:\\Users\\MY\\Desktop\\ScreenShot\\ATP"+str2+".jpg");
//		FileHandler.copy(source2, dest2);
		
		Thread.sleep(5000);
		
		String text2 = alt1.getText();//i have a question,why not directly put this statement in the printing statement 
		System.out.println(text2);
		alt1.dismiss();
		
		System.out.println("=======================================");
		
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		Thread.sleep(5000);
		Alert alt2 = driver.switchTo().alert();
		
//		File source3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String str3 = RandomString.make();
//		File dest3 =new File("C:\\Users\\MY\\Desktop\\ScreenShot\\ATP"+str3+".jpg");
//		FileHandler.copy(source3, dest3);
//		Thread.sleep(5000);
		
		String text3 = alt2.getText();//i have a question,why not directly put this statement in the printing statement 
		System.out.println(text3);
		alt2.accept();
		
		System.out.println("=======================================");
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make();
		File dest =new File("C:\\Users\\MY\\Desktop\\ScreenShot\\ATP"+str+".jpg");
		FileHandler.copy(source, dest);
		
		
		
		
		
	}

}
