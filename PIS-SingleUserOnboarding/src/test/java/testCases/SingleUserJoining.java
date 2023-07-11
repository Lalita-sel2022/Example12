package testCases;

import org.testng.annotations.Test;

public class SingleUserJoining extends BaseClass
{
  @Test
  public void tc_001()
  {
	  app.openBrowser("chromebrowser");
	  app.navigation("pisurl");
	  //app.clear("user_id");
	  app.type("user_id","username");
	  app.type("pass_id","pass");
	  app.click("signin_classname");
	  app.click("singleOnbording_xpath");
	  app.click("addsingle_id");
	  
	  
  }
 
 
}
