package WebScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaveSnapBasedOnFunctionality {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	    List<WebElement> links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int i=0;i<links.size();i++)
		{
			String linkName = links.get(i).getText();
			links.get(i).click();
			
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\Screenshot\\"+linkName+".png"));
			//Redefined for remembering in case of 'StaleElementRefrenceException'
			links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}

	}

}
