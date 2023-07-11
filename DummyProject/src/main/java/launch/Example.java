package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	public static WebDriver driver ;

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		//String s=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[6]/td[4]")).getText();
		//System.out.println(s);
		
		String price=driver.findElement(By.xpath("//a[contains(text(), 'Sun Retail')]/parent::td/following-sibling::td[3]")).getText();
		System.out.println(price);
		
		String name=driver.findElement(By.xpath("//span[@class='f12']/parent::div")).getText();
		
		System.out.println(name);
		

	}

}
