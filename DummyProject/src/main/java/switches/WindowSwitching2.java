package switches;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println(driver.getTitle());
		//String window=driver.getWindowHandle();
		//System.out.println(window);
		
		
		  //WebElement element =
		  driver.findElement(By.xpath("(//img[@alt='Personal Loan'])[1]")); WebDriverWait wait =
		  new WebDriverWait(driver, Duration.ofSeconds(40));
		  
		  System.out.println("get image"+driver.findElement(By.xpath(
		  "(//img[@alt='UPI'])[1]")).getText());
		  
		  while(!wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "(//img[@alt='UPI'])[1]"))).isDisplayed()) {
		  System.out.println("Inside for loop");
		  driver.findElement(By.xpath("(//button[contains(text(), 'Next')])[1]")).click
		  (); break;
		  
		  }
		  
		  System.out.println("Outside for loop");
		  
		  WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='Personal Loan'])[1]")));
		  ele.click();
		  //driver.findElement(By.xpath("(//img[@alt='UPI'])[1]")).click();
		  String window=driver.getWindowHandle();
			System.out.println(window);
		  
		  Set<String> windows = driver.getWindowHandles();
		  
		  for(String win:windows)
		  {
			  //System.out.println(win);
			  if(!win.equals(windows))
			  {
				  driver.switchTo().window(win);
			  }
		  }
		  
		  System.out.println(driver.getTitle()+"..........."+driver.getWindowHandle());
		  
		  //driver.switchTo().window(windows.get(1))
		  //WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-chatInput']")));
		  //element1.click();
		  
		  driver.findElement(By.xpath("//input[@id='search-chatInput']")).sendKeys("Loan");
		  
		  String getText = driver.findElement(By.xpath("(//p[@class='font-14 gray'])[1]")).getText();
		  System.out.println(getText);
		  
		  System.out.println("After second window");
		  driver.switchTo().window(window);
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//span[@class='m-text'])[3]")).click();
		 
	
		
		/*
		 * driver.findElement(By.linkText("Fixed Deposit")).click();
		 * 
		 * Set<String> windows = driver.getWindowHandles(); for(String win:windows) {
		 * if(!win.equals(window)) { win. } }
		 * 
		 * driver.findElement(By.linkText("Personal Banking")).click();
		 */
	}

}
