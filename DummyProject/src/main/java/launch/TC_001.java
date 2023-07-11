package launch;

import java.io.IOException;
import org.apache.log4j.Logger;


public class TC_001 extends BaseClass
{
	
	private static final Logger log = Logger.getLogger(TC_001.class);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		 init();
		 log.info("Init the properties file");
		 launchBrowser("firefoxbrowser");
		 log.info("Opening browser .."+childpro.getProperty("firefoxbrowser"));
		 navigateUrl("amazonurl");
		 log.info("Opening URL .."+childpro.getProperty("amazonurl"));
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * WebElement element =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("dropdown_xpath")
		 * )); //driver.findElement(By.xpath("dropdown_xpath")).click();
		 * element.click(); Dimension d = new Dimension(800, 600);
		 * driver.manage().window().setSize(d);
		 */
		
		selectOption("amazondropdown_id", "Books");
		log.info("Selecting dropdown option as Books .."+orpro.getProperty("amazondropdown_id"));
		enterText("searchtext_id", "harry potter");
		log.info("Enter the text Harry Pottal by using locator ..."+orpro.getProperty("searchtext_id"));
		clickElement("searchbuttonclick_id");
		log.info("Click on search button by using locator..."+orpro.getProperty("searchbuttonclick_id"));
		
	
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
