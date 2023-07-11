package launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 

{
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static FileInputStream fil;
	public static Properties mainPro;
	public static Properties child1Pro;
	public static Properties orPro;
	
	  
	public static void init() throws IOException
	{
	   fil = new FileInputStream(projectPath+"\\src\\main\\resources\\enviornment.properties");
	   mainPro = new Properties();
	   mainPro.load(fil);
	   String e = mainPro.getProperty("env");
	   System.out.println("Main property is : "+e);
	   
	   fil = new FileInputStream(projectPath+"\\src\\main\\resources\\"+e+".properties");
	   child1Pro = new Properties();
	   child1Pro.load(fil);
	   String val=child1Pro.getProperty("firefoxbrowser");
	   System.out.println("Value is : "+val);
	   fil= new FileInputStream(projectPath+"\\src\\main\\resources\\or.properties");
	   orPro= new Properties();
	   orPro.load(fil);
	   System.out.println(orPro.getProperty("signinbutton_link"));
	  }
	
	 public static void launchBrowser(String browser)
	 {
		 if(child1Pro.getProperty(browser).equals("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
		 }
		 else if(child1Pro.getProperty(browser).equals("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
		 }
	 }
	 
	 public static void navigate(String url)
	 {
		 driver.get(child1Pro.getProperty(url));
		
	 }
	 
	 public static void click(String locatorKey)
	 {
		 //driver.findElement(By.linkText(orPro.getProperty(locatorKey))).click();
		 getElement(locatorKey).click();
	 }
	 
	 public static void type(String locatorKey, String text)
	 {
		 getElement(locatorKey).sendKeys(child1Pro.getProperty(text));
	 }
	
	 public static String getText(String locatorKey) throws IOException
	 {
		
		
		String text = getElement(locatorKey).getText();
		System.out.println("Actual value : "+text);
		return text;
		
	 }
	 
	 public static void takeScreensot() throws IOException
	 {
		 Date d= new Date();
		 String screensot = d.toString().replace(":", "-").replace(" ", "-")+".png";
		 
		File filSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(filSrc, new File(projectPath+"\\Screenshots\\"+screensot));
		 
		 
	 }
	 
	 public static WebElement getElement(String locatorKey)
	 {
		 WebElement element = null;
		 System.out.println("Checking for element is present : "+locatorKey);
		 if(!isElementPresent(locatorKey))
			 
			 System.out.println("Element is not present : "+locatorKey);
		 
		      element=driver.findElement(getLocator(locatorKey));
			 
			/*
			 * if(locatorKey.endsWith("_id")) { element =
			 * driver.findElement(By.id(orPro.getProperty(locatorKey))); } else
			 * if(locatorKey.endsWith("_xpath")) { element =
			 * driver.findElement(By.xpath(orPro.getProperty(locatorKey))); } else
			 * if(locatorKey.endsWith("_classname")) { element =
			 * driver.findElement(By.className(orPro.getProperty(locatorKey))); } else
			 * if(locatorKey.endsWith("_name")) { element =
			 * driver.findElement(By.name(orPro.getProperty(locatorKey))); } else
			 * if(locatorKey.endsWith("_css")) { element =
			 * driver.findElement(By.cssSelector(orPro.getProperty(locatorKey))); } else
			 * if(locatorKey.endsWith("_link")) { element =
			 * driver.findElement(By.linkText(orPro.getProperty(locatorKey))); } else
			 * if(locatorKey.endsWith("_partiallink")) { element =
			 * driver.findElement(By.partialLinkText(orPro.getProperty(locatorKey))); }
			 */
		 
		return element;
	 }
	 
	 public static boolean isElementPresent(String locatorKey)
	 {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		
		try {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
			/*
			 * if(locatorKey.endsWith("_id")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orPro.
			 * getProperty(locatorKey)))); } else if(locatorKey.endsWith("_xpath")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orPro.
			 * getProperty(locatorKey)))); } else if(locatorKey.endsWith("_cass")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
			 * locatorKey))); } else if(locatorKey.endsWith("_classname")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orPro.
			 * getProperty(locatorKey)))); } else if(locatorKey.endsWith("_name")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orPro.
			 * getProperty(locatorKey)))); } else if(locatorKey.endsWith("_link")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orPro.
			 * getProperty(locatorKey)))); } else if(locatorKey.endsWith("_partiallink")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(
			 * orPro.getProperty(locatorKey)))); }
			 */
		}catch (Exception e) 
		{
			return false;
		}
		return true;
		 
		 
	 }
	 
	 public static By getLocator(String locatorKey)
	 {
		 By by = null;
		 if(locatorKey.endsWith("_id"))
		 {
			by= By.id(orPro.getProperty(locatorKey));
		 }
		 else if(locatorKey.endsWith("_xpath")) {
			 by= By.xpath(orPro.getProperty(locatorKey));
		 }else if(locatorKey.endsWith("_css")) {
			 by= By.cssSelector(orPro.getProperty(locatorKey));
		 }else if(locatorKey.endsWith("_classname")) {
			 by= By.className(orPro.getProperty(locatorKey));
		 }else if(locatorKey.endsWith("_name")) {
			 by= By.name(orPro.getProperty(locatorKey));
		 }else if(locatorKey.endsWith("_link")) {
			 by= By.linkText(orPro.getProperty(locatorKey));
		 }else if(locatorKey.endsWith("_partiallink")) {
			 by= By.partialLinkText(orPro.getProperty(locatorKey));
		 }
		return by;
		 
	 }
	 
	

}
