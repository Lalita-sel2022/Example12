package launch;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerExample {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.cssSelector("input#datepicker")).click();
		
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#ui-datepicker-div")));
		String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthYear);
		
		while(!monthYear.equalsIgnoreCase("July 2023"))
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
			monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			//Thread.sleep(3000);
			System.out.println(monthYear);
		}
		
		
		  List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")); 
		
		  for(int i=0;i<days.size();i++) 
		  { 
			 // System.out.println("Inside For Loop");
			  String date = days.get(i).getText();
			  if(date.equals("1")) 
		  { 
				  //System.out.println("Inside if condition");
				  days.get(i).click();
				  break; 
				  }
			  }
		  
		  //driver.quit();
		 

	}


}
