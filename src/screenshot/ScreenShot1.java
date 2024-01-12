package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException 
	{
		
	WebDriver Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.bcci.tv/");
	
	
	
	
//	explicit casting
//	double d = 199.99d;
//	int e=(int) d;//ज्याच्यामद्धे convert करायचे आहे त्याला bracket मध्ये लिहिणे नंतर variable चे नाव लिहिणे 
//	System.out.println(e);
	
	File source = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(source);
	
	File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Myscreenshot.png");//file चे नाव टाकणे destination दिल्यानंतर 
	
	FileHandler.copy(source, dest);	//File Handler method use करताना selenium ची use करणे 
	
	
	
	}

}
