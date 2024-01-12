package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods 
{

	
	
			//reading data from excel 
			//taking screenshot
			//scrolling
			//waiting
			
			public static void takeScreenshot(WebDriver driver,String fileName) throws IOException
			{
				
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\"+fileName+".png");
				
				FileHandler.copy(src, dest);
			}
	
			
			public static void scrollIntoView1(WebDriver driver, WebElement element)
			{
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();",element);
			}

			
			
			public static void implicitWait(WebDriver driver,int time)
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
			}
			
			
//			public static String readDataFromExcel(int row,int cell)
//			{
//			FileInputStream myFile = new FileInputStream("C:\\Users\\MY\\Desktop\\New folder.xlsx");
//			Sheet mySheet=WorkbookFactory.create(myFile).getSheet("Sheet3");
//			String value=mySheet.getRow().getCell(cell).getStringCellValue();
//			return value;
//			
//			}
			
			
			
			
			
}
