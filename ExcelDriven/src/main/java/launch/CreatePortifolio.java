package launch;

import java.io.IOException;

public class CreatePortifolio extends BaseClass
{
	static String expectederror = "Username and password does not match. Try again.";
	 static String expe="Hi Prachi Gupta";
	 
	public static void main(String[] args) throws IOException 
	{
		
		init();
		launchBrowser("firefoxbrowser");
		navigate("rediffurl");
		click("signinbutton_link");
		type("email_id", "useremail");
		type("password_id", "userpass");
		click("submitbutton_id");
		String actual = getText("errormessage_xpath");
		String verifyActual = getText("verifyusername_id");
		
		//System.out.println("Befor if statement");
		if(actual.equals(expectederror))
		{
			System.out.println("Hello if");
			takeScreensot();
		}
		else if(verifyActual.equals(expe))
		{
			System.out.println("Successfully logged in");
			takeScreensot();
		}
		
		

	}

}
