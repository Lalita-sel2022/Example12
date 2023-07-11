package testAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {
	public WebDriver driver;

	public Signin_Page(WebDriver driver) {
		this.driver = driver;
	   PageFactory.initElements(driver, this);
     
	}

	@FindBy(xpath = "//span[@class='ml-2 taglib-icon-label']")public WebElement signin_btn;
	@FindBy(id="_com_liferay_login_web_portlet_LoginPortlet_login") public WebElement user_id;
	@FindBy(id="_com_liferay_login_web_portlet_LoginPortlet_password")public WebElement pass_id;
	@FindBy(className ="lfr-btn-label")public WebElement sign_button;
	@FindBy(css =".dropdown-toggle.rounded-circle.btn.btn-unstyled")public WebElement profile_button;
	@FindBy(css = "div#clay-dropdown-menu-1 > ul > li:first-child")public WebElement userName;
	@FindBy(xpath= "//button[text()='My Sites']")public WebElement mySite;
	@FindBy(css = "a[data-groupdescriptivename=\"Jet_Process\"]")public WebElement jetProcess;
	@FindBy(id="selectSite_iframe_")public WebElement iframe;
	

	public void userLogin() {
		
		System.out.println("Click on signin");
		signin_btn.click();
	    user_id.clear();
	    System.out.println("enter user1@liferay.com");
	    user_id.sendKeys("user1@liferay.com");
	    System.out.println("enter test1");
		pass_id.sendKeys("test1");
		
		System.out.println("SignIn");
		sign_button.click(); 
		
		System.out.println("Click in profile");
		
		profile_button.click();
		 System.out.println("User name...."+userName.getText());
		System.out.println("Click on mysite");
		mySite.click();
		System.out.println("window switching :::");
		driver.switchTo().frame(iframe);
		System.out.println("Clicking on JetProcess :::");
		jetProcess.click();
		
	
	}
		

		
	
	
	  public String getUserName() {
		  profile_button.click();
		  String a= userName.getText();
	      System.out.println("User name :: "+a);
	      return userName.getText();
	  
	  }
	 
	
	
	/*
	 * public void jetPro() { mySite.click(); String
	 * parentWin=driver.getWindowHandle(); Set<String> windows =
	 * driver.getWindowHandles(); for(String handles:windows) {
	 * if(handles!=parentWin) { driver.switchTo().window(handles); } }
	 * driver.switchTo().frame(driver.findElement(By.id("selectSite_iframe_")));
	 * jetProcess.click(); }
	 */
	 
}
