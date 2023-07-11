package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

public class StockManagement extends BaseClass
{
	
	public StockManagement() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
    public void add()
    {
		System.out.println("Create stock");
    }
	
	@Test
    public void modify()
    {
		System.out.println("Modify stock");
    }
	
	@Test
    public void verify()
    {
		System.out.println("Verify stock");
    }
	@Test
    public void delete()
    {
		System.out.println("Delete stock");
    }
}
