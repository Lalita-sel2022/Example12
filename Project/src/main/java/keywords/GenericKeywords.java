package keywords;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import io.github.bonigarcia.wdm.WebDriverManager;
import reporting.ExtentManager;



public class GenericKeywords 
{
	public static WebDriver driver;
	public String projectPath=System.getProperty("user.dir");
	public Properties mainpro;
	public Properties childpro;
	public static Properties orProp;
	public static ExtentTest test;
	public SoftAssert softAssert;
	 WebElement element = null;
	
	public void openBrowser(String browserName)
	{
		//test.log(Status.INFO,"Open Broser .....:" + childpro.getProperty(browserName));
		log("Open Broser .....:" + childpro.getProperty(browserName));
		//System.out.println("Open browser....................."+childpro.getProperty(browserName));
		if(childpro.getProperty(browserName).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(childpro.getProperty(browserName).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
	}
	
	public void navigate(String url) throws InterruptedException
	{
		//test.log(Status.INFO,"Navigate Url....:"+ childpro.getProperty(url));
		log("Navigate Url....:"+ childpro.getProperty(url));
		//System.out.println("Navigate this URL.............."+);
		driver.get(childpro.getProperty(url));
		
	}
	
	
	
	  public WebElement getElement(String locatorKey)
	  {
		 
	    //check for presence of Element 
		 if(!isElementPresent(locatorKey)) 
		  //report the failure 
		System.out.println("Element is not present :" +locatorKey);
	  
	  element = driver.findElement(getLocator(locatorKey)); 
	  return element; 
	  }
	  
	  public boolean isElementPresent(String locatorKey) 
	  {
	   test.log(Status.INFO,"Checking the Element Presence :"+ locatorKey);	  
	  //System.out.println("Checking the Element Presence :" + locatorKey);
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  
	  try{
	  wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey))); 
	  } 
	  catch (Exception e)
	  { return false; 
	  } return true; 
	  }
	  
	  public By getLocator(String locatorKey) 
	  {
		  By by=null;
	  
	  if(locatorKey.endsWith("_id")) 
	  { 
	  by = By.id(orProp.getProperty(locatorKey));
	  }else if(locatorKey.endsWith("_name"))
	  { by = By.name(orProp.getProperty(locatorKey)); 
	  }
	  else if(locatorKey.endsWith("_classname")) 
	  { by = By.className(orProp.getProperty(locatorKey)); 
	  }else if(locatorKey.endsWith("_linktext")) { by =
	  By.linkText(orProp.getProperty(locatorKey)); }else
	  if(locatorKey.endsWith("_partiallinktext")) { by =
	  By.partialLinkText(orProp.getProperty(locatorKey)); }else
	  if(locatorKey.endsWith("_xpath")) { by =
	  By.xpath(orProp.getProperty(locatorKey)); }else
	  if(locatorKey.endsWith("_css")) { by =
	  By.cssSelector(orProp.getProperty(locatorKey)); }
	  
	  return by; 
	  }
	 
	
	
	
	

	public void click(String locatorKey) 
	{
		
		getElement(locatorKey).click();
		
		
		
	}
	
	public void type(String locatorKey,String text) 
	{
		
		getElement(locatorKey).sendKeys(childpro.getProperty(text));
		//System.out.println(".................");
	}
	
	public void select(String locatorKey, String option)
	{
		getElement(locatorKey).sendKeys(childpro.getProperty(option));
		//System.out.println(".................");
	}
	
	public boolean getText(String locatorKey)
	{
	String actual=getElement(locatorKey).getText();
	String expected = "Username and password does not match. Try again.";
	//Assert.assertEquals(actual, "Username and password does not match. Try agai.");
	
	
	
	
	//reportFailure(actual, expected, "Username & Password not valid");
	
	//String expected ="Username and password does not match. Try again.";
	 if(actual.equals(expected))
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	 //Assert.assertEquals(actual, expected)
	 //reportFailure("Error message not match", false);
	
	
	}
	
	public void setReport(ExtentTest test)
	{
		this.test = test;
	}
	//Reporting Function
	public void log(String  mesg)
	{
		test.log(Status.INFO, mesg); 
	}

	//Reporting Failure
	/*
	 * public void reportFailure(String failmsz) { softAssert.fail(failmsz);
	 * test.log(Status.FAIL, failmsz); }
	 */
	public void reportFailure(String failmsz, boolean stopFailure) 
	{ 
		softAssert.fail(failmsz);//Failure in testNG reports
	    test.log(Status.FAIL, failmsz);  //Failure in extent reports
	  
	 }
	
	public void assertAll()
	{
		Reporter.getCurrentTestResult().getTestContext().setAttribute("CritiaclFailure", 'y');
		softAssert.assertAll();
	}
	
	public void takeScreenshot() throws IOException
	{
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
	    File file = screenshot.getScreenshotAs(OutputType.FILE);
	    File file2 = new File("C:\\Users\\DELL\\bcd.jpg");
	    FileUtils.copyDirectory(file, file2);
	    
	    //test.log(Status.INFO, "Screenshot-->"+ test.addScreenCaptureFromPath(ExtentManager.getReports()));
	    
		
	}
}
