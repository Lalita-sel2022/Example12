package testCases;



import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;






public class SessionManagement extends BaseClass
{
	



	public SessionManagement() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void login() throws Exception
	{
		//test.log(Status.INFO, "Log in...");
		app.log("Log in...");
		app.openBrowser("chromebrowser");
		
		app.navigate("radiffurl");
		
		app.click("sigin_linktext");
		
		app.type("mail_id", "rediffusername");
		
		
		app.type("pass_id", "rediffpass");
		
		app.click("submit_id");
		
		boolean bol = app.getText("errormessage_xpath");
		app.reportFailure(bol ? "sucessfull login":"Username and Password is not valid", bol);
		app.assertAll();
		//app.getText(projectPath);
		
	
	}

	
	@Test
	public void logout()
	{
		test.log(Status.INFO, "Log out");
		//System.out.println("Logout");
	}
}
