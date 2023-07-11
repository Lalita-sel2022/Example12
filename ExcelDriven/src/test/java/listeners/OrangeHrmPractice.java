package listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmPractice {
  @Test
  public void loginTest()
  {
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com");
	  driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("");
	  driver.findElement(By.name("password")).sendKeys("");
	  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	  
	  driver.findElement(By.xpath("//div[@class='oxd-brand-banner']")).isDisplayed();
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  driver.close();
  }
}
