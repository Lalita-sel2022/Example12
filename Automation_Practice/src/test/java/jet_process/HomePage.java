package jet_process;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testAutomation.Home_Page;
import testAutomation.Signin_Page;

public class HomePage extends LoginPage
{
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest(){

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.1.70:9090/group/jet_process/jet-process?p_p_id=io_jetprocess_web_JetProcessWebPortlet_INSTANCE_OwtLAn2ncQNH&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&_io_jetprocess_web_JetProcessWebPortlet_INSTANCE_OwtLAn2ncQNH_mvcRenderCommandName=%2FcreatedFileList&_io_jetprocess_web_JetProcessWebPortlet_INSTANCE_OwtLAn2ncQNH_selectedNav=home");
		
	}
	
	@Test
	public void test() {
		Signin_Page s = new Signin_Page(driver);
		 s.userLogin();
		}
	
	@Test
	public void homePage() {
		Home_Page hp= new Home_Page(driver);
		hp.clickOnHomePageModule();
	}
	
	 @AfterTest public void afterTest() { driver.quit(); }

}
