package launch;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClientPO {

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
		
		driver.findElement(By.linkText("INVOICING")).click();
		driver.findElement(By.linkText("PURCHASE ORDER")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.id("clientName")).sendKeys("WebitUp");
		driver.findElement(By.id("ponumber")).sendKeys("TH/WEBIT/LR-SUP(22-23)/001");
		WebElement dt = driver.findElement(By.id("podate"));
		dt.sendKeys("2023-05-02");
		
		driver.findElement(By.id("receivedate")).sendKeys("2023-05-02");
		driver.findElement(By.id("deliverydate")).sendKeys("2023-05-02");
		
		driver.findElement(By.id("poTitle")).sendKeys("PO Tital");
		driver.findElement(By.id("currency")).sendKeys("INR");
		driver.findElement(By.id("billingtype")).sendKeys("T & M");
		driver.findElement(By.id("billingcycle")).sendKeys("Monthly");
		driver.findElement(By.id("hsn")).sendKeys("546545");
		driver.findElement(By.id("sow1")).click();
		driver.findElement(By.id("paymentTerm")).sendKeys("30 Days");
		driver.findElement(By.id("clientPurchaseOrderItem0.name")).sendKeys("Project");
		driver.findElement(By.id("clientPurchaseOrderItem0.description")).sendKeys("Project");
		driver.findElement(By.id("qty")).sendKeys("1");
		driver.findElement(By.id("price")).sendKeys("208000");
		driver.findElement(By.id("comments")).sendKeys("Testing");
		driver.findElement(By.id("comments")).sendKeys("Testing");
		driver.findElement(By.id("terms")).sendKeys("Testing");
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\DELL\\Downloads\\newmaster1.xlsx");
		Thread.sleep(1000);
		driver.findElement(By.id("submitbtn")).click();
		
		
		
		
		
		
		
		
		

	}

}
