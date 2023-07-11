package launch;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebPagination {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		 * List<WebElement> list = driver.findElements(By.
		 * xpath("//table[@id='example']/tbody/tr/td[contains(@class, 'sorting_1')]"));
		 * System.out.println(list.size()); String text = null; for(int
		 * i=0;i<list.size();i++) { text = list.get(i).getText();
		 * System.out.println(text); }
		 * 
		 */
		
	
		List<WebElement> pagination = driver.findElements(By.xpath("//div[@id='example_paginate']/span/a"));
		List<WebElement> elementList = driver.findElements(By.cssSelector("table#example>tbody>tr>td:nth-child(1)"));
		System.out.println("Total page :"+pagination.size());
		System.out.println("Total names in page :"+elementList.size());
		/*
		 * String text = null;
		 * 
		 * for(int j=1;j<=pagination.size();j++) { for(int i=0;i<elementList.size();i++)
		 * { text = elementList.get(i).getText(); System.out.println(text); }
		 * 
		 * driver.findElement(By.xpath("//a[text()='Next']")).click(); }
		 */
		
		for(int j=1;j<=pagination.size();j++)
		{
			String pageSelector = "div#example_paginate>span>a:nth-child("+j+")";
			//driver.navigate().refresh();
			
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(pageSelector)));
			//driver.findElement(By.cssSelector(pageSelector)).click();
			
			element.click();
			
			 for(WebElement name:elementList)
				{ 
				 String nameList = name.getText();
				 System.out.println(nameList);
				}
			 
			 Thread.sleep(3000);
			
			
		}
		
		
		

	}

}
