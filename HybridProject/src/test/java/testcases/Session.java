package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Session extends BaseTest {

	@Test
	public void registration() throws IOException
	{
		
		System.out.println("Registration portifolio");
		app.openBrowser("firefoxbrowser");
		app.navigateURL("rediffurl");
		app.click("singup_link");
		app.type("fullname_id", "fullname");
		app.type("email_id", "email");
		app.type("password_id", "pass");
		app.type("repass_id", "repass");
		app.select("selectday_id", "days");
		app.select("selectmonth_id", "month");
		app.select("selectyear_id", "year");
		app.click("selectgender_xpath");
		app.select("selectcountry_id", "country");
		app.select("selectcity_id", "city");
		app.getTextEle("capchaimg_xpath");
		//app.type("verification_id", app.getText("capchaimg_id"));
		
		
	}

	@Test
	public void doLogin() throws IOException 
	{
		//System.out.println("Login portifolio");
		//test.log(Status.INFO, "Logging in...");
		app.log("Logging in...");
		app.openBrowser("firefoxbrowser");
		app.navigateURL("rediffurl");
		app.click("signin_link");
		app.type("email_xpath", "rediffuser");
		//failure
		//True means critical failure
		
		app.reportFailure("Test is incorrect",true);
		app.type("pass_id", "rediffpassword");
		app.click("submit_id");
		app.assertAll();
	}

	@Test
	public void doLogout() {
		//test.log(Status.INFO, "Logging out...");
		app.log("Logging out...");
	}
}
