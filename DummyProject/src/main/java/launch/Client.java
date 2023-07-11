package launch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Client {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://192.168.1.17:8082/");
		
		driver.findElement(By.name("username")).sendKeys("rohini");
		driver.findElement(By.name("password")).sendKeys("rohini@123");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		
		driver.findElement(By.id("navbarDropdown")).click();
		driver.findElement(By.linkText("CLIENTS")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary client_btn float-right']")).click();
		driver.findElement(By.id("name")).sendKeys("WebitUp");
		driver.findElement(By.id("businessName")).sendKeys("WebitUp LLC");
		driver.findElement(By.id("companyType")).sendKeys("PVT. LTD.");
		driver.findElement(By.id("primaryBusiness")).sendKeys("IT Service");
		driver.findElement(By.id("address1")).sendKeys("H-104");
		driver.findElement(By.id("address2")).sendKeys("Main Road");
		driver.findElement(By.id("addressType")).sendKeys("Office");
		driver.findElement(By.id("city")).sendKeys("Noida");
		driver.findElement(By.id("state")).sendKeys("UP");
		driver.findElement(By.id("email")).sendKeys("patelpk@gmail.com");
		driver.findElement(By.id("pincode")).sendKeys("77006");
		driver.findElement(By.id("phone")).sendKeys("001 7134936304");
		driver.findElement(By.id("country")).sendKeys("US");
		driver.findElement(By.id("website")).sendKeys("http://www.webitup.com");
		driver.findElement(By.id("contactFirstName")).sendKeys("Bikram");
		driver.findElement(By.id("contactLastName")).sendKeys("Nayak");
		driver.findElement(By.id("contactPhone")).sendKeys("001 7134936304");
		driver.findElement(By.id("contactExtension")).sendKeys("912");
		driver.findElement(By.id("contactMobile")).sendKeys("001 7134936304");
		driver.findElement(By.id("contactDeg")).sendKeys("Manger");
		driver.findElement(By.id("contactprofile")).sendKeys("Facebook");
		driver.findElement(By.id("contactEmail")).sendKeys("nayak@gmail.com");
		driver.findElement(By.id("channel")).sendKeys("Promotional Emails");
		driver.findElement(By.id("taxDocNo1 ")).sendKeys("91AAZP001Z5AZPH");
		boolean tru = driver.findElement(By.id("taxDocNo12")).isDisplayed();
		System.out.println(tru);
		((RemoteWebDriver)driver).executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//input[@id='taxDocNo12']")).sendKeys("91AAZP001Z5AZPH");
		driver.findElement(By.xpath("//input[@class='form-check-input input-field '][1]")).click();
		driver.findElement(By.xpath("//input[@id='file']")).sendKeys("C:\\Users\\DELL\\Downloads\\newmaster1.xlsx");
		driver.findElement(By.id("submit_button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//table[@id='clientTable']/tbody/tr/td/a)[1]")).click();
		
		/*
		 * By By = null; List<WebElement> values = driver.findElements(By);
		 * 
		 * for(int i=1;i<values.size();i++) { String val = values.get(i).getText();
		 * System.out.println("Element name is :"+val); }
		 */
		
		

	}

}
