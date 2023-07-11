package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager {
	
  	
  @Test
  public void applyDicount() {
	  System.out.println("applyDicount");
	  
  }
  
  @Parameters({"action"})
  @Test
  public void makePayment(String pytMode, ITestContext context) {
	  
	 // System.out.println("makePayment");
	  if(pytMode.equals("pay@hotal"))
	
		  System.out.println("Making payment through pay@hotal");
	  else
		  System.out.println("Making payment through electronic media");
	  
	  String bookID= "RRRR20230503";
	  
	  System.out.println("booking ID :"+bookID);
	  
	  context.setAttribute("bID", bookID);
	  
	  
	  
  }
}
