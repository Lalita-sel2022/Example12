package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperations {
	

	public static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']"))).perform();
		driver.findElement(By.xpath("(//i[@class='order-icon footerIconsImg'])[2]")).click();
		
	}

}