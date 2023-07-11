package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownOption {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/");
		Thread.sleep(3000);
		try {
		WebElement dropCounElement = driver.findElement(By.id("input-country"));
		Select s=new Select(dropCounElement);
		s.selectByVisibleText("Denmark");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("End of program");
	
		
	

	}

}
