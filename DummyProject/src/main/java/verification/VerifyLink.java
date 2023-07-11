package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import launch.BaseClass;

public class VerifyLink extends BaseClass
{

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement linkName = driver.findElement(By.linkText("Electronics"));
		
		if(linkName.isDisplayed())
		linkName.click();


	}

}
