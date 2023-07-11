package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

public class PortifilioManagement extends BaseClass
{
	
	public PortifilioManagement() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void create()
	{
		System.out.println("Create portifilio");
		app.reportFailure("Report Fail", true);
		app.assertAll();
	}
	
	@Test
	public void modify()
	{
		System.out.println("Modify portifilio");
	}
	

	
	@Test
	public void delete()
	{
		System.out.println("Delete portifilio");
	}

}
