package testcases;

import java.io.IOException;

//Acceptable failure(Even failure accure but the excution continue), Critical failure(con't further continue) and Unexpected failure()
//User soft Assert and heard Assert - SA(Will continue the execution)


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

public class BaseTest
{
	public ApplicationKeywords app;
	public static ExtentReports rep;
	public static ExtentTest test;
	
	
	@BeforeTest
	public void beforeTest(ITestContext context) throws IOException
	{
		app = new ApplicationKeywords();
		context.setAttribute("app", app);
		System.out.println("beforeTest");
		
		//Inti report for tests
		 rep = ExtentManger.getReport();
		 test = rep.createTest(context.getCurrentXmlTest().getName());
		 app.setReport(test);
		
		
		 context.setAttribute("report", rep);
		 context.setAttribute("test", test);
		
		
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		
		System.out.println("beforeMethod");
		
		 String CriticalFailure = (String)context.getAttribute("CriticalFailure");
		 if(CriticalFailure!=null && CriticalFailure.equals("Y"))
		 {
			 test.log(Status.SKIP, "Critical failure in privious test");
			 throw new SkipException("Critical failure in privious test");
		 }
		
		app =(ApplicationKeywords)context.getAttribute("app");
		rep = (ExtentReports)context.getAttribute("report");
		test = (ExtentTest)context.getAttribute("test");
		
	}
	
	@AfterTest
	public void afterTest()
	{
		if(rep!=null)
		{
			rep.flush();
		}
	}
	


}
