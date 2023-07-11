package launch;

import java.io.IOException;
import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;


public class TC_2 extends BaseClass
{
	
	//private static final Logger log = Logger.getLogger(TC_2.class);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		 init();
		 test=reports.createTest("TC_2");
		 
		 test.log(Status.INFO, "Init the properties file");
		 //log.info("Init the properties file");
		 launchBrowser("firefoxbrowser");
		 test.log(Status.INFO, "Opening browser .."+childpro.getProperty("firefoxbrowser"));
		 //log.info("Opening browser .."+childpro.getProperty("firefoxbrowser"));
		 navigateUrl("amazonurl");
		 test.log(Status.INFO, "Opening URL .."+childpro.getProperty("amazonurl"));
		 //log.info("Opening URL .."+childpro.getProperty("amazonurl"));
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * WebElement element =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("dropdown_xpath")
		 * )); //driver.findElement(By.xpath("dropdown_xpath")).click();
		 * element.click(); Dimension d = new Dimension(800, 600);
		 * driver.manage().window().setSize(d);
		 */
		
		selectOption("amazondropdown_id", "Books");
		test.log(Status.PASS, "Selecting dropdown option as Books .."+orpro.getProperty("amazondropdown_id"));
		//log.info("Selecting dropdown option as Books .."+orpro.getProperty("amazondropdown_id"));
		enterText("searchtext_id", "harry potter");
	    test.log(Status.FAIL, "Enter the text Harry Pottal by using locator ..."+orpro.getProperty("searchtext_id"));
		//log.info("Enter the text Harry Pottal by using locator ..."+orpro.getProperty("searchtext_id"));
		clickElement("searchbuttonclick_id");
		test.log(Status.PASS, "Click on search button by using locator..."+orpro.getProperty("searchbuttonclick_id"));
		//log.info("Click on search button by using locator..."+orpro.getProperty("searchbuttonclick_id"));
		
		reports.flush();
	
		/*
		 * driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		 * driver.findElement(By.id("nav-search-submit-button")).click();
		 * 
		 * Dimension value = driver.findElement(By.id("twotabsearchtextbox")).getSize();
		 * System.out.println(value);
		 * 
		 * String text = driver.findElement(By.id("twotabsearchtextbox")).getTagName();
		 * System.out.println(text);
		 */
	}

}
