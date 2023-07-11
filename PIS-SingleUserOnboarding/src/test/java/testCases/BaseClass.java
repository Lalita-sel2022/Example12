package testCases;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import keywords.ApplicationKeywords;

public class BaseClass
{
	public ApplicationKeywords app;
	
	@BeforeTest
	public void beforeTest(ITestContext context) throws IOException
	{
		System.out.println("Before test");
		app = new ApplicationKeywords();
		context.setAttribute("app", app);
		
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("Before method");
		app=(ApplicationKeywords)context.getAttribute("app");
		
		
		
	}
 
}
