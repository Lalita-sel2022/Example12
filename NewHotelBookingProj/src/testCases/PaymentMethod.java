package testCases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentMethod {
	
	  @Test
	  public void applyDiscount() 
	  {
		  System.out.println("applyDiscount");
	  }
 @Parameters({"action"})	  
  @Test
  public void makePayment(String payname, ITestContext context) 
  {
	  System.out.println("makePayment");
	  if(payname.equals("electronic media"))
	  {
	  System.out.println("Make payment through electronic media");
	  }
	  else
	  {
		  System.out.println("Make payment through pay@hotel");
	  }
	  
	  String bookingId="RRRR001234";
	  System.out.println(bookingId);
	  context.setAttribute("BID", bookingId);
  }
}
