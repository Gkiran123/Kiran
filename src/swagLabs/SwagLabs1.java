package swagLabs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs1 {

	public static void main(String[] args) throws InterruptedException 
	{


		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement user_name = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login_button = driver.findElement(By.id("login-button"));
		
		user_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login_button.click();
		
		
		WebElement backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		backpack.click();
		
		WebElement bike_light = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		
		WebElement cart = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
		backpack.click();
		bike_light.click();
		cart.click();
	
		List<WebElement> cartiteams = driver.findElements(By.className("inventory_item_name"));
		
		System.out.println("Number of iteams are"+cartiteams.size());
		
		for(WebElement ci:cartiteams)
		{
			System.out.println("iteams are "+ci.getText());
		}
		//validate iteam is same as what we want
		
		
		Iterator<WebElement> it = cartiteams.iterator();
		WebElement iteamNum1 = it.next();
		
		if(iteamNum1.getText().equals("Sauce Labs Backpack"))
		{
			System.out.println("Selected iteam is correct as==> "+iteamNum1);
		}
		else
		{
		System.out.println("Selected iteam is not correct");
		}
		
		//put your name,last name and zip code
		
		
		WebElement firstName1 = driver.findElement(By.name("firstName"));
		WebElement lastName1 = driver.findElement(By.name("lastName"));
		WebElement postalCode1 = driver.findElement(By.name("postalCode"));
		WebElement checkoutbutton = driver.findElement(By.name("continue"));
		
		firstName1.sendKeys("Velocity");
		lastName1.sendKeys("pune");
		postalCode1.sendKeys("411006");
		checkoutbutton.click();
		
		
		WebElement thankYouMsg = driver.findElement(By.xpath("//h2[text()='Thank You for your order']"));
		
		if(thankYouMsg.getText().equals("Thank you for your order"))
		{
			System.out.println("Thank you message is displayed....Logginf out");
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(500);
			driver.findElement(By.id("logout_sidebar_link")).click();
		
		}
		else
		{
			System.out.println("Thank you message is not displayed or not....please check ");
		}
		
		
		
		
		
		
		
		
	}

}
