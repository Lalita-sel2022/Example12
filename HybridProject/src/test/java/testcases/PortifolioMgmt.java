package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class PortifolioMgmt extends BaseTest
{
  @Test
  public void createPortifolio() throws InterruptedException 
  {
	
	app.log("Create portifolio");
	app.click("createport_id");
	app.clear("portifolioname_id");
	app.type("portifolioname_id", "portifoliName");
	app.click("createportbutton_id");
	app.waitForPageToLoad();
    app.validateSelectedValueInDropdown("portifolio_dropdown_id", "portifoliName");
			
  }
  
  @Test
  public void deletePortifolio() 
  {
	 app.log("Delete portifolio");
	 app.selectByVisibleText("portifolio_dropdown_id", "portifoliName");
	 app.click("deleteport_id");
	 app.acceptAlet("verifyporti_id");
	 app.validateSelectedValueNotInDropdown("portifolio_dropdown_id", "portifoliName");
	 
  }
  
  @Test
  public void selectPortifolio() throws InterruptedException
  {
	 app.log("Select portifolio");
	 app.selectByVisibleText("portifolio_dropdown_id", "portifoliName");
	 app.waitForPageToLoad();	 
  }
}
