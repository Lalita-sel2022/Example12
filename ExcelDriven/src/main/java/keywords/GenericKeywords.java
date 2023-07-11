package keywords;

import java.io.File;
import java.io.FileInputStream;
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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import reporting.ExtentManger;

public class GenericKeywords {
	public  WebDriver driver;
	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fil;
	public  Properties mainPro;
	public  Properties childPro;
	public  Properties orPro;
	public ExtentTest test;
	public SoftAssert softAssert;
	

	public void launchBrowser(String browser) {
		log("Open browser : " + childPro.getProperty(browser));
		// test.log(Status.INFO, "Open browser : "+childPro.getProperty(browser));
		if (childPro.getProperty(browser).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		} else if (childPro.getProperty(browser).equals("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}

	public void navigateUrl(String url) {
		log("Navigate URL :" + childPro.getProperty(url));
		// test.log(Status.INFO, "Navigate URL :"+childPro.getProperty(url));
		driver.get(childPro.getProperty(url));

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void type(String locatorKey, String text) {
		//log("Send text");
		getElement(locatorKey).sendKeys(childPro.getProperty(text));
	}

	public void click(String locatorKey) {
		// test.log(Status.PASS, "Element is clickable");
		//log("Element is clickable");
        getElement(locatorKey).click();

	}

	public String getText(String locatorKey) {
		return getElement(locatorKey).getText();
	}

	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

	public WebElement getElement(String locatorKey) {
		WebElement element = null;
		// System.out.println("Checking for the element present : "+locatorKey);
		log("Checking for the element present : " + locatorKey);
		if (!isElementPresent(locatorKey))
			// System.out.println("Element is not present : "+locatorKey);
		test.log(Status.FAIL, "Element is not present : " + locatorKey);
		element = driver.findElement(getLocator(locatorKey));
		return element;

	}

	public boolean isElementPresent(String locatorKey) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		try {

			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));

		} catch (Exception e) {

			return false;
		}
		return true;
	}

	public By getLocator(String locatorKey) {
		By by = null;
		if (locatorKey.endsWith("_id")) {
			by = By.id(orPro.getProperty(locatorKey));
		} else if (locatorKey.endsWith("_classname")) {
			by = By.className(orPro.getProperty(locatorKey));
		} else if (locatorKey.endsWith("_name")) {
			by = By.name(orPro.getProperty(locatorKey));
		} else if (locatorKey.endsWith("_xpath")) {
			by = By.xpath(orPro.getProperty(locatorKey));
		} else if (locatorKey.endsWith("_css")) {
			by = By.cssSelector(orPro.getProperty(locatorKey));
		} else if (locatorKey.endsWith("_link")) {
			by = By.linkText(orPro.getProperty(locatorKey));
		} else if (locatorKey.endsWith("_partiallink")) {
			by = By.partialLinkText(orPro.getProperty(locatorKey));
		}
		return by;

	}

	public void getTest(ExtentTest test) {
		this.test = test;
	}

	public void log(String mez) {
		test.log(Status.INFO, mez);
	}
	
	public void repFailure(String actual, String expected, String msz, boolean stopFailure) throws IOException
	{
		//Reporting failure
		//softAssert.fail(msz);
		softAssert.assertEquals(actual, expected, msz);//Failure in TestNG report
		test.log(Status.FAIL, msz);//Failure in Extent Report
		takeScreenshot();
		if(stopFailure)
			assertAll();
	}
	
	public void assertAll()
	{
		Reporter.getCurrentTestResult().getTestContext().setAttribute("CriticalFailure", "Y");
		softAssert.assertAll();
	}
	
	
	  public void takeScreenshot() throws IOException 
	  { 
		  //File name of screenshot
		  Date d = new Date(); 
		  String screenshot =d.toString().replace(":", "-").replace(" ", "-")+".png";
		  
		  //Take Screenshot
		  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		  try {
		  //get the dynamic folder name
		  FileHandler.copy(srcFile, new File(ExtentManger.screenshotFolderPath+"//"+screenshot));
		  System.out.println("Screenshot Path : "+ExtentManger.screenshotFolderPath+"//"+screenshot);
		  //put screenshot file in reports
		  test.log(Status.INFO, "Screenshot -> "+test.addScreenCaptureFromPath(ExtentManger.screenshotFolderPath+"//"+screenshot));
		  }catch (Exception e) 
		  {
			e.printStackTrace();
		}
		  
	  
	  }
	 
}
