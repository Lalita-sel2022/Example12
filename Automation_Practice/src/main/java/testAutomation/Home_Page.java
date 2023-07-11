package testAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	WebDriver driver;
	
	
	
	@FindBy(id="home")public WebElement home_Module;
    @FindBy(linkText = " File ")public WebElement file_Module;
    @FindBy(linkText = " Receipt ")public WebElement receipt_Module;
    @FindBy(id="createFile")public WebElement fileCreat_Module;
    
    public Home_Page (WebDriver driver2) {
		PageFactory.initElements(driver, this);
	}
   



	public void clickOnHomePageModule() {
    	
		fileCreat_Module.click();
    	
    }
    
	
	

}
