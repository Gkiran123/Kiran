package myselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Apurva");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Potdar");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8421526902");
Thread.sleep(1000);
driver.findElement(By.id("password_step_input")).sendKeys("Potdaras29@");
Thread.sleep(1000);

WebElement DropDay = driver.findElement(By.id("day"));
Thread.sleep(1000);
Select s=new Select(DropDay);
s.selectByValue("21");
Thread.sleep(1000);
WebElement DropMonth = driver.findElement(By.id("month"));
Thread.sleep(1000);
Select s1=new Select(DropMonth);
s1.selectByValue("1");

WebElement DropYear = driver.findElement(By.id("year"));

Select s2=new Select(DropYear);
s2.selectByValue("1995");


WebElement selectGender = driver.findElement(By.xpath("//input[@value='1']"));

selectGender.click();
boolean femaleValue = selectGender.isSelected();



if(femaleValue==true) {
	driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	
	}
else {
selectGender.click();
	}

System.out.println("======================================");



}}