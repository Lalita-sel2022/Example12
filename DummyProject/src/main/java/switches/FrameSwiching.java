package switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSwiching
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		System.out.println("Out of Frame");
		
		//WebElement frameElement = driver.findElement(By.name("packageFrame"));
		//driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		//driver.findElement(By.xpath("//ul[@title='Interfaces']/li[position()=13]")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		System.out.println("Inside another frame");
		Thread.sleep(2000);
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.className("rightIframe")));
		System.out.println("Inside right frame");
		driver.findElement(By.linkText("SearchContext")).click();
		driver.switchTo().defaultContent();
		
		System.out.println("Hello Selenium");
		
		
		driver.switchTo().frame(driver.findElement(By.className("rightIframe")));
		String text=driver.findElement(By.linkText("WebDriver")).getText();
		System.out.println(text);
		
		
		

	}

}
