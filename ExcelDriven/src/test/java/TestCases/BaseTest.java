package TestCases;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.ApplicationKeywords;
import reporting.ExtentManger;

public class BaseTest {
	public ApplicationKeywords app;
	public ExtentReports rep;
	public ExtentTest test;

	@BeforeTest
	public void beforeTest(ITestContext context) throws IOException {
		app = new ApplicationKeywords();
		context.setAttribute("app", app);

		rep = ExtentManger.getReport();
		test = rep.createTest(context.getCurrentXmlTest().getName());
		// System.out.println("Test case : " +test);
		app.getTest(test);

		context.setAttribute("report", rep);
		context.setAttribute("test", test);

		// System.out.println("Before Test");
	}

	@BeforeMethod
	public void beforeMethod(ITestContext context) {
		
		
		  String criticalFailure = (String) context.getAttribute("CriticalFailure");
		  if(criticalFailure != null && criticalFailure.equals("Y")) 
		  {
		 test.log(Status.SKIP, "Critical Failure"); 
		  throw new SkipException("Critical Failure"); 
		
		  }
		 

		app = (ApplicationKeywords) context.getAttribute("app");
		rep = (ExtentReports) context.getAttribute("report");
		test = (ExtentTest) context.getAttribute("test");
		// System.out.println("Before Method");
		
	

	}

	@AfterTest
	public void afterTest() {
		if (rep != null)
			rep.flush();
	}

}
