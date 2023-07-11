package testListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener
{

	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start :"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success:"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure :"+result.getName());
	
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test starts :"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
		System.out.println("On the start Test Case");
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("On the finish Test case");
		
	}
	

}
