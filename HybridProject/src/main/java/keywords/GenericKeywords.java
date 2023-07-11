package keywords;

import java.awt.Image;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import reporting.ExtentManger;

public class GenericKeywords {
	public static WebDriver driver;
	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fil;
	public Properties mainPro;
	public Properties childPro;
	public static Properties orPro;
	public ExtentTest test;
	public SoftAssert softAssert;

	public void openBrowser(String browserName) {
		
		//System.out.println("opening browser :" + childPro.getProperty(browserName));
		//test.log(Status.INFO, "Opening brower :"+childPro.getProperty(browserName));
		log("Opening brower :"+childPro.getProperty(browserName));
		if (childPro.getProperty(browserName).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (childPro.getProperty(browserName).equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}

	public void navigateURL(String url) {
		//System.out.println("Navigate URL :" + childPro.getProperty(url));
		//test.log(Status.INFO, "Navigate the URL :"+childPro.getProperty(url));
		log("Navigate the URL :"+childPro.getProperty(url));
		driver.get(childPro.getProperty(url));

	}

	public void click(String keyLocator) 
	{
		//test.log(Status.PASS, "Element is clickable");
		getElement(keyLocator).click();

	}
	
	public void clear(String keyLocator)
	{
		getElement(keyLocator).clear();
	}

	public void type(String keyLocator, String text) {
		getElement(keyLocator).sendKeys(childPro.getProperty(text));

	}

	public void select(String keyLocator, String option) {
		getElement(keyLocator).sendKeys(childPro.getProperty(option));

	}
	
	public void selectByVisibleText(String keyLocator, String data)
	{
		Select s= new Select(getElement(keyLocator));
		s.selectByVisibleText(data);
				
	}
	
	public void acceptAlet(String keyLocator)
	{
		test.log(Status.INFO, "Switching to alert");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		test.log(Status.INFO, "Alert acceptable successfully");
		reportFailure("Alert not found when mandatory", true);
			
		}

	public String getTextEle(String keyLocator) throws IOException 
	{
		//test.log(Status.INFO, "captch img ::" + getElement(keyLocator).getText());
		//System.out.println("captch img ::" + getElement(keyLocator).getText());

		String val = getElement(keyLocator).getAttribute("src");
		//System.out.println("val:" + val);

		//URL url = new URL(val);
		//Image image = ImageIO.read(url);
		// String s = new OCR().recognizeCharacters((RenderedImage) image);
		//System.out.println("Text From Image : \n" + image);
		//System.out.println("Length of total text : \n" + ((CharSequence) image).length());
		return val;

	}

	public void closeBrowser() {

	}

	public WebElement getElement(String keyLocator) {

		WebElement element = null;
		test.log(Status.INFO, "Check for Element is present ::" + keyLocator);
		//System.out.println("Check for Element is present ::" + keyLocator);

		if (!isElementPresent(keyLocator))
			//System.out.println("Element is not present ::" + keyLocator);
			test.log(Status.FAIL, "Element is not present ::" + keyLocator);
			
			//reportFailure("");

		element = driver.findElement(getLocators(keyLocator));
		return element;
	}

	public static boolean isElementPresent(String keyLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocators(keyLocator)));

		} catch (Exception e) {

			return false;
		}
		return true;
	}

	public static By getLocators(String keyLocator) {
		By by = null;

		if (keyLocator.endsWith("_id")) {
			by = By.id(orPro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_name")) {
			by = By.name(orPro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_classname")) {
			by = By.className(orPro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_css")) {
			by = By.cssSelector(orPro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_xpath")) {
			by = By.xpath(orPro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_link")) {
			by = By.linkText(orPro.getProperty(keyLocator));
		} else if (keyLocator.endsWith("_partiallink")) {
			by = By.partialLinkText(orPro.getProperty(keyLocator));
		}

		return by;

	}

	public void setReport(ExtentTest test) {
		this.test = test;
	}

   //Reporting Function
	
	public void log(String msz)
	{
		test.log(Status.INFO, msz);
	}
	
	//Reporting failure
	public void reportFailure(String failureMez, boolean stopFailure)
	{
		//System.out.println("Inside reportFailure method");
		softAssert.fail(failureMez); //Failure in testng class
		test.log(Status.FAIL, failureMez);  //Failure in extent report
		//System.out.println("Take Screenshot");
		takeScreenshot();
		
		if(stopFailure)
			assertAll();
	}
	
	public void assertAll()
	{
		Reporter.getCurrentTestResult().getTestContext().setAttribute("CriticalFailure", "Y");
		softAssert.assertAll();
	}
	
	public void takeScreenshot() 
	{
		//File name of the screenshot
		
		Date d= new Date();
		String screenshotFile = d.toString().replace(':', '_').replace(' ', '_')+".png";
		//Take screenshot
		try {
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(file, new File(ExtentManger.screenshotFolderPath +"//"+screenshotFile));
			
		} catch (IOException e) 
		{

			e.printStackTrace();
		}
		
		test.log(Status.INFO, "Screenshot -> "+test.addScreenCaptureFromPath(ExtentManger.screenshotFolderPath + "//"+screenshotFile));
		
		
	}
	
	public void waitForPageToLoad() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0;
		//Ajax status
		while(i!=10)
		{
			String state = (String)js.executeScript("return document.ready state;");
			System.out.println(state);
			if(state.equals("complete"))
				break;
			else
				wait(2);
			
			i++;
		}
		//Check for jquary status
		while(i!=0)
		{
			Long l = (Long)js.executeScript("return jquery.active;");
			if(l.longValue()==0)
				break;
			else
				
				wait(2);
			i++;
			
		}
		}
	
	public void wait(int t) throws InterruptedException
	{
		Thread.sleep(t*1000);
	}
	
	// finds the row number of the data
		public int getRowNumWithCellData(String tableLocator, String data) 
		{
			WebElement table = getElement(tableLocator);
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			for(int rNum=0;rNum<rows.size();rNum++) 
			{
				WebElement row = rows.get(rNum);
				List<WebElement> cells = row.findElements(By.tagName("td"));
				for(int cNum=0;cNum<cells.size();cNum++) 
				{
					WebElement cell = cells.get(cNum);
					System.out.println("Text "+ cell.getText());
					if(!cell.getText().trim().equals(""))
						if(data.startsWith(cell.getText()))
							return(rNum+1);
				}
			}
			
			return -1; // data is not found
		}
		

		public void quit() 
		{
			driver.quit();	
		}
		
		
	}

