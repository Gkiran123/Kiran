package facebook_Utility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;

public class Utility_Commonly_Used_Methods 
{

	public void screenshot(WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make();
		File destination = new File("C:\\Users\\MY\\Desktop\\ScreenShot"+str+".jpg");
		
		FileHandler.copy(source, destination);
		
		Reporter.log("taking screenshot of login credential", true);
		
	}
	
	public String fetechDataFromExcel(WebDriver driver,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		Reporter.log("fetching details from excel sheet", true);
		FileInputStream myFile = new FileInputStream("C:\\Users\\MY\\Desktop\facebookLogin.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
