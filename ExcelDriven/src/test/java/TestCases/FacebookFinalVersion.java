package TestCases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class FacebookFinalVersion 
{
	public WebDriver driver;
  
	@Test(dataProvider = "getData")
  public void f(Hashtable<String, String> h)
	{
		if(h.get("RunMode").equals("N"))
		{
			throw new SkipException("Test is skipped due to RunMode....");
		}
		else {
			
		
		driver.findElement(By.id("email")).sendKeys(h.get("UserName"));
		driver.findElement(By.id("pass")).sendKeys(h.get("UserPassword"));
		driver.findElement(By.xpath("//div[@class='_6ltg']/button")).click();
		}
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] getData() throws IOException 
  {
    String sheetName="data";
    String testCaseName="LoginTest";
    ExcelUtility e= new ExcelUtility("C:\\Users\\DELL\\Desktop\\Suite1.xlsx");
    return DataUtil.getData(e, sheetName, testCaseName);
  }
}
