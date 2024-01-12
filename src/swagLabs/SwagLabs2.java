package swagLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import misc.CommonlyUsedMethods;

public class SwagLabs2 {

	public static void main(String[] args) throws InterruptedException 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement login_button = driver.findElement(By.id("login-button"));
		
		userName.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		login_button.click();
		
		WebElement Sauce_Labs_Backpack = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
		WebElement Sauce_Labs_Bike_Light = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]"));
		WebElement Sauce_Labs_Bolt_T_Shirt = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[3]"));
		WebElement Sauce_Labs_Fleece_Jacket = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[4]"));
		WebElement Sauce_Labs_Onesie = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[5]"));
		WebElement TestallTheThings_TShirtRed = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[6]"));
		
		WebElement cart = driver.findElement(By.xpath("//div[@class='shopping_cart_container']"));//problem is here---i tried changing xpath several times but no use
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(cart));
		
		Sauce_Labs_Backpack.click();
		Sauce_Labs_Bike_Light.click();
		Sauce_Labs_Bolt_T_Shirt.click();
		Sauce_Labs_Fleece_Jacket.click();
		Sauce_Labs_Onesie.click();
		TestallTheThings_TShirtRed.click();
		cart.click();
		
		
	
		
		WebElement checkout_Button = driver.findElement(By.xpath("//a[text()='CHECKOUT']"));
		CommonlyUsedMethods.scrollIntoView1(driver, checkout_Button);
		checkout_Button.click();
		
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement postal_code = driver.findElement(By.id("postal-code"));
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		
		firstName.sendKeys("Kiran");
		lastName.sendKeys("Ghandge");
		postal_code.sendKeys("411005");
		continueButton.click();
		
		WebElement finishButton = driver.findElement(By.xpath("//a[text()='FINISH']"));
		finishButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
