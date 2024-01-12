package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel12 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream myFile = new FileInputStream("C:\\Users\\MY\\Desktop\\Book1.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet1");
	
//		Row myRow = mySheet.getRow(0);
//		
//		Cell myCell = myRow.getCell(2);
//		
//		CellType myDataType = myCell.getCellType();
//		
//		System.out.println(myDataType);
		
		
		
		
		for(int i=0;i<=1;i++)
		{
			//inner for loop for cells-0-->1
			
			for(int j=0;j<=2;j++)
			{
				
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
				
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
