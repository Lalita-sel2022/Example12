package launch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClientInvoice {

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
		driver.findElement(By.linkText("CLIENT INVOICES")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.id("client")).sendKeys("Varun");
		Thread.sleep(1000);
		driver.findElement(By.id("purchase-order")).sendKeys("djcjcsedvwdvw");
		driver.findElement(By.id("invoice-date")).sendKeys("2023-05-02");
		driver.findElement(By.id("currency")).sendKeys("INR");
		Thread.sleep(1000);
		driver.findElement(By.id("purchase-order-item")).sendKeys("kegkkfab");
		driver.findElement(By.id("instructions")).sendKeys("Testing");
		driver.findElement(By.id("message")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.id("invoice-advance-paid")).sendKeys("20000");
		driver.findElement(By.id("submitbtn")).click();
		
		

	}

}
