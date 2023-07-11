package TestCases;

import static org.testng.Assert.*;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Session extends BaseTest
{
	@Test
	public void doLogin() throws InterruptedException, IOException 
	{
		//test.log(Status.INFO, "Application Logging....");
		app.log("Application Logging....");
		String expected = "Hi Gues";
	    app.launchBrowser("chromebrowser");
		app.navigateUrl("rediffurl");
		//System.out.println(app.getTitle());
		app.click("signinbutton_link");
		
		app.type("email_id", "useremail");
		app.type("password_id", "userpass");
		//Failure
        app.repFailure(app.getText("verifyusername_xpath"),expected, "Profile is mismatched",true);
	    app.click("submitbutton_id");
	 
		app.closeBrowser();
		app.assertAll();
		
		
		
		
	}

	@Test
	public void doLogout() 
	{
		app.log( "Logged out");
		//test.log(Status.INFO, "Logged out");
		//System.out.println("Logged out");
	}
}
