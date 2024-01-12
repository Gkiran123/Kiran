package greenCartPracticeSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreenCart {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement Brocolli_1Kg = driver.findElement(By.xpath("(//div[@class='product-action'])[1]"));
		WebElement Cauliflower_1Kg = driver.findElement(By.xpath("(//div[@class='product-action'])[2]"));
		WebElement Cucumber_1Kg = driver.findElement(By.xpath("(//div[@class='product-action'])[3]"));
		WebElement Beetroot_1Kg = driver.findElement(By.xpath("(//div[@class='product-action'])[4]"));
		
		Brocolli_1Kg.click();
		Cauliflower_1Kg.click();
		Cucumber_1Kg.click();
		Beetroot_1Kg.click();
		
		
		WebElement cart = driver.findElement(By.xpath("(//a[@class='cart-icon'])[1]"));
		
		cart.click();
		
		WebElement checkout = driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		checkout.click();
		
		WebElement orderPlace = driver.findElement(By.xpath("//button[text()='Place Order']"));
		orderPlace.click();
		
		
		WebElement chooseCountry = driver.findElement(By.xpath("//option[text()='Select']"));
		Select s=new Select(chooseCountry);
		s.selectByVisibleText("India");
		
		
		WebElement agree = driver.findElement(By.xpath("//input[@class='chkAgree']"));
		agree.click();
		
		
		WebElement clickOnProceedButton = driver.findElement(By.xpath("//button[text()='Proceed']"));
		clickOnProceedButton.click();
		
		
		
		
		
		
		
		
		
	}

}
