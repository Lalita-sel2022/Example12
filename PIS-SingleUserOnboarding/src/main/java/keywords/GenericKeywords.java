package keywords;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	 public WebDriver driver;
	 String projectpath= System.getProperty("user.dir");
	 public FileInputStream file;
	 public Properties mainPro;
	 public Properties childPro;
	 public Properties orPro;
	 
	
	public void openBrowser(String browser)
    {
		if(childPro.getProperty(browser).equals("chrome"))
		{
			System.out.println("Open chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//System.out.println("Successful chrome browser open");
			
			
		}
		else if(childPro.getProperty(browser).equals("firefox"))
		{
			//System.out.println("Open firfox browser");
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
	
		
	}
	
	public void navigation(String url)
	{
		//System.out.println("Navigate url");
		driver.get(childPro.getProperty(url));
		
	}
	
	  public WebElement getElement(String locatorKey)
	  {
		  WebElement element=null;
	   // check for presence of Element 
		 if(!isElementPresent(locatorKey)) 
		  //report the failure 
		  System.out.println("Element is not present :" +locatorKey);
	     element = driver.findElement(getLocator(locatorKey)); 
	      return element; 
	  }
	  
	  public boolean isElementPresent(String locatorKey) 
	  {
	   //test.log(Status.INFO,"Checking the Element Presence :"+ locatorKey);
		 
	  System.out.println("Checking the Element Presence :" + locatorKey);
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  
	  try
	  {
	  wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey))); 
	  } 
	  catch (Exception e)
	  {
		  return false; 
	  }
	  return true; 
	  }
	  
	  public By getLocator(String locatorKey) 
	  {
		  By by=null;
	  
	  if(locatorKey.endsWith("_id")) 
	  { 
	  by = By.id(orPro.getProperty(locatorKey));
	  }
	  else if(locatorKey.endsWith("_name"))
	  { 
		  by = By.name(orPro.getProperty(locatorKey)); 
	  }
	  else if(locatorKey.endsWith("_classname")) 
	  {
		  by = By.className(orPro.getProperty(locatorKey)); 
	  }
	  else if(locatorKey.endsWith("_linktext")) 
	  {
		  by = By.linkText(orPro.getProperty(locatorKey)); }else
	  if(locatorKey.endsWith("_partiallinktext")) 
	  { 
		  by = By.partialLinkText(orPro.getProperty(locatorKey)); 
	 } 
	  else if(locatorKey.endsWith("_xpath")) 
	  { 
		  by = By.xpath(orPro.getProperty(locatorKey)); 
	  }
	  else if(locatorKey.endsWith("_css")) { by =
	  By.cssSelector(orPro.getProperty(locatorKey)); }
	  
	  return by; 
	  }
	


	
	public void type(String locatorKey, String textKey)
	{
		//driver.findElement(By.id(locator)).clear();
		//WebElement findElement = driver.findElement(By.id(orPro.getProperty(locatorKey)));
		
		//findElement.clear();
		//findElement.sendKeys(childPro.getProperty(textKey));
		getElement(locatorKey).clear();
		getElement(locatorKey).sendKeys(childPro.getProperty(textKey));
	}
	
	public void click(String locatorKey)
	{
		//System.out.println(orPro.getProperty(locator));
		//WebElement findElement = driver.findElement(By.className(orPro.getProperty(locatorKey)));
	    //findElement.click();
	    //driver.findElement(By.xpath(locator)).click();
		getElement(locatorKey).click();
	
	}
	

	
	

}
