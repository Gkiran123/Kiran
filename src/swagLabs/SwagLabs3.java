package swagLabs;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabs3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");

        // Implicit wait is not recommended, use explicit wait instead
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement pass = driver.findElement(By.id("password"));
        WebElement login_button = driver.findElement(By.id("login-button"));

        userName.sendKeys("standard_user");
        pass.sendKeys("secret_sauce");
        login_button.click();

        By productButtonLocator = By.xpath("(//button[@class='btn_primary btn_inventory'])");

        // Click on each product using explicit wait
        for (int i = 1; i <= 6; i++) {
            WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn_primary btn_inventory'])[" + i + "]")));
            product.click();
        }

        // Click on the cart
        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='shopping_cart_badge']")));
        cart.click();

        // Close the browser
//        driver.quit();
    }
}
