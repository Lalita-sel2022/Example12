package verification;

import java.io.IOException;

import com.aventstack.extentreports.Status;

import launch.BaseClass;

public class Verify2 extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		init();
		test=reports.createTest("Verify2");
		test.log(Status.INFO, "Init the properties file");
		launchBrowser("firefoxbrowser");
		test.log(Status.INFO, "Opening browser .."+childpro.getProperty("firefoxbrowser"));
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Opening URL .."+childpro.getProperty("amazonurl"));
		// Verification in dynamic way
		String expectedLink = "Customer Servic";

		// Checking expected link with actual one

		/*
		 * if (isLinkEqual().equals(expectedLink))
		 * 
		 * System.out.println("Both links are equal...."); else
		 * System.out.println("Both links are not equal....");
		 */
		
		if(!isLinkEqual(expectedLink, "navigation_link"))
			//System.out.println("Both links are not equal....");
		    reportFail("Both links are not equal....");
		else
			//System.out.println("Both links are equal....");
		    reportSuccess("Both links are equal....");
		
		reports.flush();
	}


	
	

}
