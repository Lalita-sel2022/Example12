package testCases;

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
import reporting.ExtentManager;

//Acceptable failure, Critical Failure, unwanted failure

public class BaseClass extends ApplicationKeywords
{
	public static ExtentReports report;
	public static ExtentTest test;
	public static ApplicationKeywords app;
	

    public BaseClass() throws IOException 
    {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	@BeforeTest
	public void beforeTest(ITestContext context)throws IOException
	{
		System.out.println("beforeTest");
	
		app = new ApplicationKeywords();
		
	   context.setAttribute("app", app);
	   
	   //Init the reporting for the test
	   
	   report =  ExtentManager.getReports();
	   test= report.createTest(context.getCurrentXmlTest().getName());
	   app.setReport(test);
	   

	   context.setAttribute("reports", report);
	   context.setAttribute("test", test);
	  
	   
		
	}  
	
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		
		System.out.println("Before method");
		   
		String criticalFailure = (String) context.getAttribute("CritiaclFailure");
		   if(criticalFailure!=null && criticalFailure.equals('y'))
		   {
			   test.log(Status.SKIP, "ritical Failure in privios test");
			   throw new SkipException("critical Failure in privios test");
			   
		   }
		   
		app =(ApplicationKeywords)context.getAttribute("app");
		
	    //report = (ExtentReports)context.getAttribute("report");
	    //test = (ExtentTest)context.getAttribute("test");
	    
		/*
		 * Object attribute = context.getAttribute("report"); if(attribute instanceof
		 * String) { System.out.println("String instance"); }else if(attribute
		 * instanceof ExtentReports){ System.out.println("ExtentReports instance"); }
		 * Object attribute2 = context.getAttribute("test");
		 * 
		 * //Object attribute2 = context.getAttribute("reports"); if(attribute2
		 * instanceof String) { System.out.println("String instance test"); }else
		 * if(attribute2 instanceof ExtentTest){
		 * System.out.println("ExtentTest instance"); }
		 */
	    
	    
	    test = (ExtentTest)context.getAttribute("test");
	    report = (ExtentReports)context.getAttribute("reports");
	}
	
	  @AfterTest public void quit() 
	  { if(report!=null); report.flush(); 
	  }
	 
	
	

}
