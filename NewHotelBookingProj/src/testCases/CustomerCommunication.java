package testCases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CustomerCommunication 
{
 
  @Test
  public void getConfirmByMail(ITestContext context)
  {
	  String bookingID = (String)context.getAttribute("BID");
	  System.out.println("Get confirmation meaasge buy gmail :"+bookingID);
	  
  }
  
  @Test
  public void getConfirmByPhone(ITestContext context)
  {
	  String bookID = (String)context.getAttribute("BID");
	
	  System.out.println("Get confirmation meaasge buy phone :"+bookID);
  }
}
