package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CommunicationProcess {
  
  @Test
  public void checkMailVerification(ITestContext context) {
	  
	  String bookID = (String)context.getAttribute("bID");
	  System.out.println("checkMailVerification :" + bookID);
  }
  
  @Test
  public void checkMobailVerification(ITestContext con) {
	  String book1ID = (String)con.getAttribute("bID");
	  System.out.println("checkMailVerification :"+ book1ID);
  }
}
