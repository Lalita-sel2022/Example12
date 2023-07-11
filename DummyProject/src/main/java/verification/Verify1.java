package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sony");
		 //driver.findElement(By.id("twotabsearchtextbox")).getText();
		String value = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		System.out.println("Text...."+value);

	}

}
