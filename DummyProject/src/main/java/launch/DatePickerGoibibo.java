package launch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerGoibibo {
	
	public static WebDriver driver;
	public WebElement wait;

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='logSprite icClose']")));
		element.click();
		
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='sc-q68in4-22 hHpgdJ fswDownArrow']")));
		ele.click();

		System.out.println("Hello selenium");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-uojGG frgHMT']")));
		
		String value = driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month'][position()=1]/div[1]")).getText();
		System.out.println(value);
		
		while(!value.equals("June 2023"))
		{
			////span[@class='DayPicker-NavButton DayPicker-NavButton--next']
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			
			driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month'][position()=1]/div[1]")).getText();
		}
		
		//String date = driver.findElement(By.xpath("//div[@class='DayPicker-Day']//parent::div[@aria-label='Sat Jun 03 2023']")).getText();
		//System.out.println(date);
		List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]/div/div[@class='DayPicker-Day']"));
		for(int  i=0;i<days.size();i++)
		{
			String day=days.get(i).getText();
			System.out.println(day);
			if(day.equals("22"))
			{
				days.get(i).click();
				break;
			}
		}
		
	}

}
