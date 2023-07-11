package excelReaderOperation;

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
	
  WebDriver driver;	
  @Test(dataProvider = "getTest")
  public void f(Hashtable<String, String> h) throws InterruptedException 
  {
	  if(h.get("RunMode").equals("N"))
	  {
		  throw new SkipException("Test is skipped due to RunMode ...");
	  }
	  else {
		  driver.findElement(By.id("email")).sendKeys(h.get("UserName"));
		  driver.findElement(By.id("pass")).sendKeys(h.get("UserPassword"));
		  }
	  Thread.sleep(2000);
	 
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.firefoxdriver().setup();
	  driver =new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod() 
  {
  }


  @DataProvider
  public Object[][] getTest() throws IOException 
  {
	  ExcelApi e= new ExcelApi("C:\\Users\\DELL\\Desktop\\Suite1.xlsx");
      String sheetName = "data";
      String testCaseName = "LoginTest";
	  return DataUtils.getTestData(e, sheetName, testCaseName);
   
  }
}
