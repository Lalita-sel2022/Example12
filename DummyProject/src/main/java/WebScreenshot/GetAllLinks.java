package WebScreenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String linkName = driver.findElement(By.linkText("Images")).getText();
		System.out.println(linkName);
		
		System.out.println("--------------------------------------------------------------");
		//getting all links from a Page
		List<WebElement> linksName = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<linksName.size();i++)
		{
			String value = linksName.get(i).getText();
			System.out.println(value);
		}
		
		System.out.println("--------------------------------------------------------------");
		//getting links from a specific portion
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for(int i=0;i<links.size();i++)
		{
			String value = links.get(i).getText();
			System.out.println(value);
		}
		
		System.out.println("--------------------------------------------------------------");
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']/div[1]/a"));
		for(int i=0;i<footerLinks.size();i++)
		{
			String value = footerLinks.get(i).getAttribute("innerHTML");
			System.out.println(value);
		}

	}

}
