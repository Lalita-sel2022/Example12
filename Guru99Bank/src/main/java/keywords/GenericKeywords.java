package keywords;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	public WebDriver driver;
	public FileInputStream file;
	public Properties mainPro;
	public Properties childPro;
	public String projectPath = System.getProperty("user.dir");
	
	
	
	
	public void openBrowser(String browserName)
	{
		    
		  
			if(childPro.getProperty(browserName).equals("chrome"))
			{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			}
			else if(childPro.getProperty(browserName).equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
		}
	
	  public void navigateUrl(String url)
	  { 
		  driver.get(childPro.getProperty(url));
	  }
	  
	  public void click()
	  {
		  
	  }
	  
	  public String getText(String s)
	  {
		return projectPath;
	
		  
	  }
	  
	  public void closeBrowser()
	  {
		  
	  }
	

}
