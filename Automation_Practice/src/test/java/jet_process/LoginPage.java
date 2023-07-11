package jet_process;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testAutomation.Signin_Page;

public class LoginPage {
	public WebDriver driver;

	@BeforeTest
	public void beforeTest(){

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.1.84:9090/");
		
	}

	@Test
	public void login() throws InterruptedException {
		
		 //String isNull = (driver==null) ? "Null":"Not null";
		 //System.out.println(isNull);
		 Signin_Page s = new Signin_Page(driver);
		 s.userLogin();
		 Thread.sleep(2000);
		 
		 //Thread.sleep(2000);
		 Assert.assertEquals(s.getUserName(), "DEEP VERMA");
	     // Thread.sleep(2000);
		 //s.jetPro();

	}
	
	
	  @AfterTest public void afterTest() { driver.quit(); }
	 
}
