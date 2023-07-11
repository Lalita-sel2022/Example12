package excelReaderOperation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebbokDemo {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		ExcelApi e= new ExcelApi("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		
		for(int i=1;i<e.getRowCount("login");i++) {
			driver.findElement(By.id("email")).clear();	
		driver.findElement(By.id("email")).sendKeys(e.getCellData("login", "UserName", i));
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(e.getCellData("login", "Password", i));
		
		Thread.sleep(2000);
		}

	}

}
