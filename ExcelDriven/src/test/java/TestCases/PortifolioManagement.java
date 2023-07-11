package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

public class PortifolioManagement extends BaseTest
{
	
	@Test
	public void createPortifolio() throws IOException 
	{
		
		app.log("Create portifolio");
		app.repFailure(null, null, "Critical failure in previous test case", false);
		app.assertAll();
	}

	@Test
	public void deletePortifolio() 
	{
		System.out.println("Delete portifolio");
	}

	@Test
	public void modifyPortifolio()
	{
		System.out.println("Modify portifolio");
	}
}
